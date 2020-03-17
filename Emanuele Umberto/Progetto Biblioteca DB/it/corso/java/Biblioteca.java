package it.corso.java;

import java.sql.SQLException;
import java.util.ArrayList;

public class Biblioteca {
	
	private String nome;
	private String citta;
	private ArrayList<Utente> listaIscritti;
	private ArrayList<Libro> listaLibri;
	Database db = new Database();
	
	public Biblioteca() throws SQLException {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public void setListaIscritti() throws SQLException {
		this.listaIscritti = db.leggiUtenti(this.nome);
	}

	public void setListaLibri() throws SQLException {
		this.listaLibri = db.leggiLibri(this.nome);
	}
	
	public void stampaIscritti() {
		for (Utente utente : listaIscritti) {
			System.out.println(utente.info());
		}
	}
	
	public void stampaLibri() {
		for (Libro libro : listaLibri) {
			System.out.println(libro.info());
		}
	}

	public String info() {
		return "nome=" + nome + ", citta=" + citta;
	}

}
