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
	private String password = "toor";
	private String nomeDb = "users";
	private Connection conn;
	private Statement st;
	
	public Database() throws SQLException {		
		conn = DriverManager.getConnection(url+nomeDb+timezone, user, password);
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
	
	public ArrayList<Utente> readUsers() throws SQLException {
		String sql = "SELECT * FROM utenti;";
		ResultSet rs = st.executeQuery(sql);
		ArrayList<Utente> lista = new ArrayList<Utente>();
		
		while(rs.next()) {
			if(rs.getString("email") != "null") {
				int id = rs.getInt("utente_id");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String email = rs.getString("email");
				String password = rs.getString("password");
				Utente x = new Utente(id, nome, cognome, email, password);
				lista.add(x);
			}
		}
		return lista;
	}
	
	public void removeUser(int id) throws SQLException{
		String sql = "DELETE FROM utenti WHERE (utente_id = '" + id + "');";
		st.executeUpdate(sql);
	}
}
