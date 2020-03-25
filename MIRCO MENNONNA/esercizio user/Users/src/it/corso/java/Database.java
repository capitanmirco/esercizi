package it.corso.java;

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
	private String password = "rootroot";
	private String timezone = "?serverTimezone=UTC";
	private String dbNome = "users";

	public Database() throws SQLException {
		conn = DriverManager.getConnection(url+dbNome+timezone, user, password);
		st = conn.createStatement();
	}

	public void insertUser(Utente u) throws SQLException {
		String sql = "INSERT INTO utenti (nome, cognome, email, password) VALUES ('" + u.getNome() + "', '" + u.getCognome() + "', '" + u.getEmail() + "', '" + u.getPassword() + "')";
		st.executeUpdate(sql);
	}

	public ArrayList<Utente> getUtente() throws SQLException {
		ArrayList<Utente> listaUtenti = new ArrayList<Utente>();

		String sql = "SELECT * FROM utenti;";
		ResultSet rs = st.executeQuery(sql);

		while(rs.next()) {
			Utente u = new Utente(rs.getInt("utente_id"), rs.getString("nome"), rs.getString("cognome"), rs.getString("email"), rs.getString("password"));
			listaUtenti.add(u);
		}

		return listaUtenti;
	}

	public void eliminaUtente(String utente_id) throws SQLException {
		String sql = "DELETE FROM utenti WHERE utente_id = '" + utente_id + "'";
		st.executeUpdate(sql);
	}


}