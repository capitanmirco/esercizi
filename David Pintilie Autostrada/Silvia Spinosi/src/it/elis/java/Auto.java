package it.elis.java;

public class Auto extends Veicolo {
	private String colore;
	private double prezzo;
	public Auto(String nome, String marca, double cilindrata, String colore, double prezzo) {
		super(nome, marca, cilindrata);
		this.colore = colore;
		this.prezzo = prezzo;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
