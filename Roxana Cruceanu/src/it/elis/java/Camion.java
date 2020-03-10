package it.elis.java;

public class Camion extends Veicolo {
	
	private int ruote;
	private String colore;

	public Camion(String nome, String marca, double cilindrata, int ruote, String colore) {
		super(nome, marca, cilindrata);
		this.ruote = ruote;
		this.colore = colore;
		
	}

	public int getRuote() {
		return ruote;
	}

	public void setRuote(int ruote) {
		this.ruote = ruote;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String info() {
		
		return super.info() + this.ruote + " " + this.colore;
	}

}
