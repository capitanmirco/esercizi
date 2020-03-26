package Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Utente database table.
 * 
 */
@Entity
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="utente_id")
	private int utenteId;
	private String nome;
	private String cognome;
	private String email;
	private String password;


	public Utente() {
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

	
	public int getUtenteId() {
		return utenteId;
	}


	public void setUtenteId(int utenteId) {
		this.utenteId = utenteId;
	}




}