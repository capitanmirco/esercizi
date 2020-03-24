package it.corso.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

}
