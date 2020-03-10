package it.elis.java;

public class Moto extends Veicolo{

	private int caschi;
	private String marmitta;
	
	public Moto(String nome, String marca, double cilindrata, int caschi, String marmitta) {
		super(nome, marca, cilindrata);
		this.caschi = caschi;
		this.marmitta = marmitta;
	}

	public int getCaschi() {
		return caschi;
	}

	public void setCaschi(int caschi) {
		this.caschi = caschi;
	}

	public String getMarmitta() {
		return marmitta;
	}

	public void setMarmitta(String marmitta) {
		this.marmitta = marmitta;
	}
	
	public String toString() {
		return super.toString() +" "+caschi+" "+" "+marmitta;		
	}
}
