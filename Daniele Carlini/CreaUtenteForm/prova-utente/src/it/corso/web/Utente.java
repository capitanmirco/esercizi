package it.corso.web;

public class Utente {

	private String nome;
	private String cognome;
	private int eta;
	private String citta;
	private String via;
	private String email;
	
	public Utente(String nome, String cognome, String eta, String citta, String via, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = Integer.parseInt(eta);
		this.citta = citta;
		this.via = via;
		this.email = email;
	}

	
	public int getEta() {
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

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}


	public String info() {
		return "nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", citta=" + citta + ", via=" + via
				+ ", email=" + email;
	}
	
	
	
	
}
