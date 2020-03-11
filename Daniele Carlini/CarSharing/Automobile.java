package it.carsharing;

public class Automobile {
	
	private String targa;
	private int viaggi;
	private Parcheggio locazione;
	
	public Automobile(String targa, int viaggi, Parcheggio locazione) {
		this.targa = targa;
		this.viaggi = viaggi;
		this.locazione = locazione;
	}
	
	public int getViaggi() {
		return viaggi;
	}
	
	public void setViaggi(int viaggi) {
		this.viaggi = viaggi;
	}
	
	public Parcheggio getLocazione() {
		return locazione;
	}
	
	public void setLocazione(Parcheggio locazione) {
		this.locazione = locazione;
	}
	
	public String getTarga() {
		return targa;
	}

	
	@Override
	public String toString() {
		return "targa=" + targa + ", viaggi=" + viaggi + ", locazione=" + locazione;
	}


}
