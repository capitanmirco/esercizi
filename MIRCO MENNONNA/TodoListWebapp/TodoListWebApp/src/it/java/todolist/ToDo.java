package it.java.todolist;

public class ToDo {

	private String dato;
	private String timestamp;
	private Utente utente;

	public ToDo(String dato, String timestamp, Utente utente) {
		super();
		this.dato = dato;
		this.timestamp = timestamp;
		this.utente = utente;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}



}