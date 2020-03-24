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
	private String password = "12345";
	private String nomeDb = "users";
	private Connection conn;
	private Statement st;

	public Database() throws SQLException {

		conn = DriverManager.getConnection(url + nomeDb + timezone, user, password);
		st = conn.createStatement();

	}

	public void insertUser(Utente u) throws SQLException {
		String sql = "INSERT INTO utenti (nome, cognome, email, password) VALUES ('" + u.getNome() + "', '"
				+ u.getCognome() + "', '" + u.getEmail() + "', '" + u.getPassword() + "' )";
		st.executeUpdate(sql);
	}

	public ArrayList<Utente> vediTabella() throws SQLException {
		String sql = "SELECT * FROM utenti";
		ResultSet rs = st.executeQuery(sql);
		ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
		while (rs.next()) {
			int utente_id = rs.getInt("utente_id");
			String nome = rs.getString("nome");
			String cognome = rs.getString("cognome");
			String email = rs.getString("email");
			String password = rs.getString("password");
			listaUtenti.add(new Utente(utente_id, nome, cognome, email, password));
		}
		return listaUtenti;
	}

	public void deleteUtente(String email) throws SQLException {
		String sql = "DELETE FROM utenti WHERE email = '" + email + "';";
		st.executeUpdate(sql);
	}
}
