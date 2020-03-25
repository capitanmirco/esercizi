package it.corso.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataBase {
	@SuppressWarnings("unused")
	private String nomeDb = "users";
	@SuppressWarnings("unused")
	private String url = "jdbc:mysql://localhost:3306/";
	@SuppressWarnings("unused")
	private String user = "root";
	@SuppressWarnings("unused")
	private String password = "FammiFare11";
	@SuppressWarnings("unused")
	private Connection  conn;
	@SuppressWarnings("unused")
	private Statement st;
	


	public DataBase () throws SQLException{
          conn = DriverManager.getConnection(url+nomeDb,user,password);
          st = conn.createStatement();
	}
	public void insertUser(Utente u) throws SQLException {
		String sql = "INSERT INTO utenti (nome,cognome,email,password) VALUES ("
			+"'"+ u.getNome()+ "',"
			+"'"+ u.getCognome()+ "',"
			+"'"+ u.getEmail()+ "',"
			+"'"+ u.getPassword()+ "'"
			+")";
		st.executeUpdate(sql);
	}
	public ArrayList<Utente> selectUtenti() throws SQLException
	{
		String sql = "SELECT * FROM utenti";
		
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Utente> users = new ArrayList<Utente>();
		while (rs.next()) 
		{
			int id = rs.getInt("utente_id");
			Utente u = new Utente(id,
					rs.getString("nome"),
					rs.getString("cognome"),
					rs.getString("email"),
					rs.getString("password"));
			users.add(u);
			
		}
		return users;
	
	
}
}