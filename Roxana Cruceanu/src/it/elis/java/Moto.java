package it.elis.java;

public class Moto extends Veicolo {

	private int caschi;
	private int ruote;
	
	public Moto(String nome, String marca, double cilindrata, int caschi, int ruote) {
		super(nome, marca, cilindrata);
		this.caschi = caschi;
		this.ruote = ruote;
	}

	public int getCaschi() {
		return caschi;
	}

	public void setCaschi(int caschi) {
		this.caschi = caschi;
	}

	public int getRuote() {
		return ruote;
	}

	public void setRuote(int ruote) {
		this.ruote = ruote;
	}
	
	public String info() {
		
		return super.info() + this.caschi + " " + this.ruote;
	}

}
