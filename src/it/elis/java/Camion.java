package it.elis.java;

public class Camion extends Veicolo{

	private double altezza;
	private int velocitaMax;
	
	public Camion(String nome, String marca, double cilindrata, double altezza, int velocitaMax) {
		super(nome, marca, cilindrata);
		this.altezza = altezza;
		this.velocitaMax = velocitaMax;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public int getVelocitaMax() {
		return velocitaMax;
	}

	public void setVelocitaMax(int velocitaMax) {
		velocitaMax = velocitaMax;
	}

	public String toString() {
		return super.toString() +" "+altezza+" "+" "+velocitaMax;		
	}

}

