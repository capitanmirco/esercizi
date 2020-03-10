package it.elis.java;

public class Automobile extends Veicolo {
	
	private String colore;
	private int posti;
	
	public Automobile(String marca, String nome, double cilindrata, String colore, int posti) {
		super(marca, nome, cilindrata);
		this.colore = colore;
		this.posti = posti;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public int getPosti() {
		return posti;
	}

	@Override
	public String toString() {
		return super.toString() + " colore=" + colore + ", posti=" + posti;
	}

	@Override
	public boolean accellera() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
