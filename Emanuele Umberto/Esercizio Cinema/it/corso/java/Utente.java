package it.corso.java;

public class Utente {
	
	private String nomeUtente;
	private String citta;
	private int eta;
	
	public Utente(String nomeUtente, String citta, int eta) {
		this.nomeUtente = nomeUtente;
		this.citta = citta;
		this.eta = eta;
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}	
	
}
