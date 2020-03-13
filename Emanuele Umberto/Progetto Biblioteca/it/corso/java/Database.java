package it.corso.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	private String url = "jdbc:mysql://localhost:3306/";
	private String timezone = "?serverTimezone=UTC";
	private String user = "root";
	private String password = "12345";
	private String nomeDb = "bibliotecaDb11";
	private Connection conn;
	private Statement st;
	
	public Database() throws SQLException {
		conn = DriverManager.getConnection(url+timezone, user, password);
		st = conn.createStatement();
		
		String sql = "CREATE DATABASE IF NOT EXISTS " + nomeDb;
		st.executeUpdate(sql);
		
		conn = DriverManager.getConnection(url+nomeDb+timezone, user, password);
		st = conn.createStatement();
		
		createTableBiblioteca();
		createTableUtente();
		createTableLibro();
	}
	
	public void createTableBiblioteca() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS biblioteca ("
				+ "biblioteca_id INT NOT NULL AUTO_INCREMENT,"
				+ "nome_biblioteca VARCHAR(50) NOT NULL,"
				+ "citta VARCHAR(50),"
				+ "PRIMARY KEY(biblioteca_id));";
		st.executeUpdate(sql);
	}
	
	public void createTableUtente() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS utente ("
				+ "utente_id INT NOT NULL AUTO_INCREMENT,"
				+ "nome_utente VARCHAR(50) NOT NULL,"
				+ "eta INT NOT NULL,"
				+ "tessera BOOLEAN NOT NULL,"
				+ "biblioteca_id INT NOT NULL,"
				+ "PRIMARY KEY(utente_id),"
				+ "FOREIGN KEY (biblioteca_id) REFERENCES biblioteca(biblioteca_id));";
		st.executeUpdate(sql);
	}
	
	public void createTableLibro() throws SQLException {
		String sql = "CREATE TABLE IF NOT EXISTS libro ("
				+ "libro_id INT NOT NULL AUTO_INCREMENT,"
				+ "titolo VARCHAR(50) NOT NULL,"
				+ "pagine INT NOT NULL,"
				+ "autore VARCHAR(50) NOT NULL,"
				+ "codice INT NOT NULL,"
				+ "biblioteca_id INT NOT NULL,"
				+ "PRIMARY KEY(libro_id),"
				+ "FOREIGN KEY (biblioteca_id) REFERENCES biblioteca(biblioteca_id));";
		st.executeUpdate(sql);
	}

}
