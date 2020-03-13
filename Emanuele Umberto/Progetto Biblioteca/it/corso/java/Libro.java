package it.corso.java;

public class Libro {
	
	private String titolo;
	private int pagine;
	private String autore;
	private int codice;
	
	public Libro(String titolo, int pagine, String autore, int codice) {
		super();
		this.titolo = titolo;
		this.pagine = pagine;
		this.autore = autore;
		this.codice = codice;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public String info() {
		return "titolo=" + titolo + ", pagine=" + pagine + ", autore=" + autore + ", codice=" + codice;
	}
	
	

}
