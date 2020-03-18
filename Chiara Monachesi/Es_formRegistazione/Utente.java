public class Utente 
{
	private String nome, cognome, citta, via, email;
	private int eta;
	
	
	public Utente(String nome, String cognome, int eta, String citta, String via, String email) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.citta = citta;
		this.via = via;
		this.email = email;
		this.eta = eta;
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


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
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


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}
	
	
}
