package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import java.sql.ResultSet;

public class Database 
{
	private String url = "jdbc:mysql://localhost:3306/";
	private String timezone = "?serverTimezone=UTC";
	private String user = "root";
	private String password = "start1234";
	private String nomeDB = "users";
	private Connection conn;
	private Statement st; // permette di aprire la connessione con il db

	public Database() throws SQLException // gestià un eventuale eccezione da un'altra parte
	{
		conn = DriverManager.getConnection(url+nomeDB+timezone, user, password);  //url user password
		st = conn.createStatement(); // apre collegamento
		
	}
	
	
	public void insertUtente(Utente u) throws SQLException 
	{
		String sql = "INSERT INTO users.utenti(nome, cognome, email, password) VALUES (" + 
					"'" + u.getNome() + "',"
				+ "'" + u.getCognome() + "',"
				+ "'" + u.getEmail() + "',"
				+ "'" + u.getPassword() + "')";
			System.out.println("utente inserito");
		st.execute(sql);
	}
	
	
	public int contaUtenti() throws SQLException 
	{
		String sql = "SELECT count(*) as c " + 
					"FROM utenti;";
	
		ResultSet rs = st.executeQuery(sql);
		int count = 0;
		while(rs.next()){
		    count = rs.getInt("c");
		}
		return count;
	}
	
	public boolean verificaEsistenza(String email) throws SQLException
	{
		String sql = "SELECT count(*) as c "
					+ "FROM utenti "
					+ "WHERE email='" + email + "';";
			
		ResultSet rs = st.executeQuery(sql);
		
		int count = 0;
		while(rs.next()){
		    count = rs.getInt("c");
		    }
		
		//System.out.println(rs.getInt(1));
		
		return count != 0 ? true : false;
	}
	
	public ArrayList<Utente> selectUtenti() throws SQLException
	{
		String sql = "SELECT * FROM utenti";
		
		ResultSet rs = st.executeQuery(sql);
		
		ArrayList<Utente> lista = new ArrayList<Utente>();
		while (rs.next())  //next si riferisce alla row
		{
			int id = rs.getInt("utente_id");
			Utente u = new Utente(id,
					rs.getString("nome"),
					rs.getString("cognome"),
					rs.getString("email"),
					rs.getString("password"));
			lista.add(u);
			System.out.println(u.toString());
		}
		return lista;
	}
	
	public void delete(String email) throws SQLException
	{
		String sql = "DELETE FROM utenti WHERE email = '" + email + "'"; 
		st.execute(sql);
	}
	
}
