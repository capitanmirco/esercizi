package it.corso.java;

public class Utente {
	
	private int utente_id;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	
	public Utente(int utente_id, String nome, String cognome, String email, String password) {
		super();
		this.utente_id = utente_id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
	}

	public int getUtente_id() {
		return utente_id;
	}

	public void setUtente_id(int utente_id) {
		this.utente_id = utente_id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
		
}
