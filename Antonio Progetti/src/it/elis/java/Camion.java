package it.elis.java;

public class Camion extends Veicolo{
	
	private double lunghezza;
	private double altezza;

	public double getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(double lunghezza) {
		this.lunghezza = lunghezza;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public Camion(String nome, String marca, double cilindrata, double lunghezza, double altezza) {
		super(nome, marca, cilindrata);
		this.lunghezza = lunghezza;
		this.altezza = altezza;
	}

}
