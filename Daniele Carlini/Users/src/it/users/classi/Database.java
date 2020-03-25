package it.users.classi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	
	private Connection conn;
	private Statement st;
	private String url = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String password = "1234Kemot!";
	private String timezone = "?serverTimezone=UTC";
	private String dbNome = "users";
	
	
	public Database() throws SQLException {
		conn = DriverManager.getConnection(url+dbNome+timezone, user, password);
		st = conn.createStatement();
	}
	
	public void insertUser(Utente u) throws SQLException {	
		String sql = "INSERT INTO utenti (nome,cognome,email,password) VALUES ('"
				+ u.getNome() + "', '"
				+ u.getCognome() + "', '"
				+ u.getEmail() + "', '"
				+ u.getPassword() + "')";
		
		st.executeUpdate(sql);
	}
	
	public ArrayList<Utente> readUtente () throws SQLException {
		ArrayList<Utente> listaUtente = new ArrayList<Utente>();
		String sql = "SELECT * FROM utenti;";
		
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			Utente u = new Utente(rs.getString("nome"), rs.getString("cognome"), rs.getString("email"), rs.getString("password"));
			u.setUtente_id(rs.getInt("utente_id"));
			listaUtente.add(u);
		}
		return listaUtente;
	}
	
	public boolean utenteEsistente (String email) throws SQLException {
		boolean esistente = false;
		String sql = "SELECT email FROM utenti WHERE email='" + email + "';";
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			String emailutente = rs.getString("email");
			System.out.println(emailutente);
			if(emailutente != null) {
				esistente = true;
			}
		}
		return esistente;
		
	}
	
	public String emailUtente (int utente_id) throws SQLException {
		String email = "-1";
		String sql = "SELECT email FROM utenti WHERE utente_id='" + utente_id + "';";
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			email = rs.getString("email");
			}
		return email;
	}
	
	public void cancellaUtente (String email) throws SQLException {
		String sql = "DELETE FROM utenti WHERE email='" + email + "';";
		st.executeUpdate(sql);
	}

}
