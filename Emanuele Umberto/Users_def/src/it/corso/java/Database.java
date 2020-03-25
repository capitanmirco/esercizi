package it.corso.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	
	private Connection conn;
	private Statement st;
	private String url = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String password = "12345";
	private String timezone = "?serverTimezone=UTC";
	private String dbNome = "users";
	
	public Database() throws SQLException {
		conn = DriverManager.getConnection(url+dbNome+timezone, user, password);
		st = conn.createStatement();
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
	
	public void inserisciUtente(String nome, String cognome, String email, String password) throws SQLException {
		String sql = "INSERT INTO utenti (nome, cognome, email, password) values (?, ?, ?, ?)";
		PreparedStatement prepStat = conn.prepareStatement(sql);
		prepStat.setString(1, nome);
		prepStat.setString(2, cognome);
		prepStat.setString(3, email);
		prepStat.setString(4, password);
		prepStat.executeUpdate();
	}
	
	public boolean controllaEmail(String email) throws SQLException {
		String sql = "SELECT email FROM utenti WHERE email = '" + email +"'";
		ResultSet e =  st.executeQuery(sql);
		return e.first();
	}
	
	public ArrayList<Utente> leggiUtenti() throws SQLException{
		ArrayList<Utente> lista = new ArrayList<Utente>();
		String sql = "SELECT * FROM utenti";
		ResultSet result =  st.executeQuery(sql);
		while (result.next()) {
			int id = result.getInt("utente_id");
			String nome = result.getString("nome");
			String cognome = result.getString("cognome");
			String email = result.getString("email");
			String password = result.getString("password");
			
			Utente u = new Utente(id, nome, cognome, email, password);
			lista.add(u);
		}
		return lista;
	}
	
	public void cancellaUtente(int id) throws SQLException {
		String sql = "DELETE FROM utenti WHERE utente_id="+id;
		st.executeUpdate(sql);
	}

}
