package it.servlet;

public class ToDo {
	
	private String dato;
	private String timeStamp;
	private Utente utente;
	
	public ToDo(String dato, String timeStamp, Utente utente) {
		super();
		this.dato = dato;
		this.timeStamp = timeStamp;
		this.utente = utente;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	

}
