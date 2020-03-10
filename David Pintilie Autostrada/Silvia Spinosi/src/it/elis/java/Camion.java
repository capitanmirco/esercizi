package it.elis.java;

public class Camion extends Veicolo {
	private double altezza;
	private double peso;
	public Camion(String nome, String marca, double cilindrata, double altezza, double peso) {
		super(nome, marca, cilindrata);
		this.altezza = altezza;
		this.peso = peso;
	}
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
