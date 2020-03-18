package it.corso.java;

import java.util.ArrayList;

public class Persona {
	private String nome;
	private String cognome;
	private Integer eta;
	private String citta;
	private String via;
	private String email;
	private ArrayList<Persona> listapersone;
	public Persona(String nome, String cognome, Integer eta, String citta, String via, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		citta = this.citta;
		this.via = via;
		this.email = email;
		listapersone=new ArrayList<Persona>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void insertPersona(Persona p) {
		listapersone.add(p);
		
	}
	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", citta=" + citta + ", via=" + via
				+ ", email=" + email + "]";
	}
	
	
	
	

}
