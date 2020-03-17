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

	public void insertBiblioteca(Biblioteca b) throws SQLException {
		String sql = "INSERT INTO biblioteca (nome_biblioteca, citta) "
				+ "VALUES ('" + b.getNome() + "', '" + b.getCitta() + "')";
		st.executeUpdate(sql);
		System.out.println("Biblioteca aggiunta!");
	}
	
	public void insertUtente(Utente u, String nomeBiblioteca) throws SQLException {
		
		int id_biblioteca = leggiIdBiblioteca(nomeBiblioteca);
		
		String sql = "INSERT INTO utente (nome_utente, eta, tessera, biblioteca_id) "
				+ " VALUES ( '" + u.getNome() + "', " + u.getEta() + ", " + u.isTessera() + ", " + id_biblioteca + " )";
		st.executeUpdate(sql);
		System.out.println("Utente aggiunto!!!");
	}
	
	public void insertLibro(Libro l, String nomeBiblioteca) throws SQLException {
		
		int id_biblioteca = leggiIdBiblioteca(nomeBiblioteca);
		
		String sql = "INSERT INTO libro (titolo, pagine, autore, codice, biblioteca_id) "
				+ " VALUES ('" + l.getTitolo() + "', " + l.getPagine() + ", '" + l.getAutore() + "', " + l.getCodice() + ", " + id_biblioteca + ")";
		
		st.executeUpdate(sql);
		System.out.println("Libro aggiunto!");
	}
	
	private int leggiIdBiblioteca(String nomeBiblioteca) throws SQLException {
		
		String sql = "SELECT biblioteca_id FROM biblioteca WHERE nome_biblioteca = '" + nomeBiblioteca + "'";
		ResultSet rs =  st.executeQuery(sql);
		int id = 0;
		while(rs.next()) {
			id = rs.getInt("biblioteca_id");
			break;
		}
		return id;
	}
	
	public ArrayList<Libro> leggiLibri(String nomeBiblioteca) throws SQLException{
		ArrayList<Libro> lista = new ArrayList<Libro>();
		int id_biblioteca = leggiIdBiblioteca(nomeBiblioteca);
		
		String sql = "SELECT * FROM libro WHERE biblioteca_id = " + id_biblioteca;
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			String titolo = rs.getString("titolo");
			int pagine = rs.getInt("pagine");
			String autore = rs.getString("autore");
			int codice = rs.getInt("codice");
			
			Libro l = new Libro(titolo, pagine, autore, codice);
			lista.add(l);
		}
		
		return lista;
	}
	
	public ArrayList<Utente> leggiUtenti(String nomeBiblioteca) throws SQLException{
		ArrayList<Utente> lista = new ArrayList<Utente>();
		int id_biblioteca = leggiIdBiblioteca(nomeBiblioteca);
		
		String sql = "SELECT * FROM Utente WHERE biblioteca_id = " + id_biblioteca;
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()){
			String nome_utente = rs.getString("nome_utente");
			int eta = rs.getInt("eta");
			boolean tessera = rs.getBoolean("tessera");
			
			Utente utente = new Utente(nome_utente, eta, tessera);
			lista.add(utente);
		}
		
		return lista;
		
	}
	
	public Biblioteca leggiBiblioteca(int id) throws SQLException {
		
		String sql = "SELECT * FROM biblioteca WHERE biblioteca_id = " + id;
		ResultSet rs =  st.executeQuery(sql);
		Biblioteca b = new Biblioteca();
		
		while(rs.next()) {
			
			String nome = rs.getString("nome_biblioteca");
			String citta = rs.getString("citta");
			
			b.setNome(nome);
			b.setCitta(citta);
			
		}
		
		return b;
	}
}
