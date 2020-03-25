package it.corso.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	private String url = "jdbc:mysql://localhost:3306/";
	private String timezone = "?serverTimezone=UTC";
	private String user = "root";
	private String password = "12345678";
	private String nomeDb = "users";
	private Connection conn;
	private Statement st;
	ArrayList<Utente> listautenti;
	public Database() throws SQLException {
		conn = DriverManager.getConnection(url+nomeDb+timezone, user, password);
		st = conn.createStatement();
		listautenti=new ArrayList<Utente>();
	}
	public void insertUser(Utente u) throws SQLException {
		String sql = "INSERT INTO utenti (nome, cognome, email, password) VALUES ("
				+ "'" + u.getNome() + "',"
				+ "'" + u.getCognome() + "',"
				+ "'" + u.getEmail() + "',"
				+ "'" + u.getPassword() + "'"
				+ ")";
		st.executeUpdate(sql);
	}
	public ArrayList<Utente> Search() throws SQLException {
		String nome = null;
		String cognome = null;
		String email = null;
		String password = null;
		String sql="SELECT * FROM users.utenti";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()) {
			//String utente_id=rs.getNString("utente_id");
			int utente_id=rs.getInt("utenti_id");
			nome=rs.getNString("nome");
			cognome=rs.getNString("cognome");
			email=rs.getNString("email");
			password=rs.getNString("password");
			Utente u=new Utente(utente_id,nome, cognome, email, password);
			listautenti.add(u);
		}
		/*for (Utente utente : listautenti) {
			System.out.println(utente.toString());
		}*/
		
		return listautenti;
	}
	public void remove(int i) throws SQLException {
		String sql="DELETE FROM users.utenti WHERE utenti_id="+i+"";
		st.executeUpdate(sql);
	}
}
