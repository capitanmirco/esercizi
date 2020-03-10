package it.elis.java;

public class Moto extends Veicolo{
	
	private String colore;
	private int numeroRuote;
	public Moto(String nome, String marca, double cilindrata, String colore, int numeroRuote) {
		super(nome, marca, cilindrata);
		this.colore = colore;
		this.numeroRuote = numeroRuote;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public int getNumeroRuote() {
		return numeroRuote;
	}
	public void setNumeroRuote(int numeroRuote) {
		this.numeroRuote = numeroRuote;
	}

}
