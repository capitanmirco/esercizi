package model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int utenti_Id;
	private String nome;
	private String cognome;
	private String email;
	private String password;

	public int getUtenti_Id() {
		return this.utenti_Id;
	}

	public void setUtenti_Id(int utenti_Id) {
		this.utenti_Id = utenti_Id;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}