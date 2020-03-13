package it.corso.java;

import java.util.ArrayList;

public class Biblioteca {
	
	private String nome;
	private String citta;
	private ArrayList<Utente> listaIscritti;
	private ArrayList<Libro> listaLibri;
	
	public Biblioteca(String nome, String citta) {
		this.nome = nome;
		this.citta = citta;
		this.listaIscritti = new ArrayList<Utente>();
		this.listaLibri = new ArrayList<Libro>();
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

	public String info() {
		return "nome=" + nome + ", citta=" + citta;
	}

}
