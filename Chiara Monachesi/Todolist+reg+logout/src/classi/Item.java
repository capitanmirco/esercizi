package classi;

public class Item 
{
	private String testo, timestamp;
	private Utente utente;
	
	public Item(String testo, String timestamp, Utente utente) {
		this.testo = testo;
		this.timestamp = timestamp;
		this.utente = utente;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
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

	@Override
	public String toString() {
		return "Item [testo=" + testo + ", timestamp=" + timestamp + ", utente=" + utente.toString() + "]";
	} 
	
	
	
}
