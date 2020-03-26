package model;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="utenti")

public class utenti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="utente_id")
	private int utenteId;

	private String cognome;

	private String email;

	private String nome;

	private String password;


	public int getUtenteId() {
		return this.utenteId;
	}

	public void setUtenteId(int utenteId) {
		this.utenteId = utenteId;
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

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}