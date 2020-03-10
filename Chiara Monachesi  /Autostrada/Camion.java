package it.elis.esAutostrada;

public class Camion extends Veicolo
{

	private double grandezza;
	private int velocitaMax;
	
	public Camion(String nome, String marca, double cilindrata, double grandezza, int velocitaMax) 
	{
		super(nome, marca, cilindrata);
		setGrandezza(grandezza);
	}

	public double getGrandezza() {
		return grandezza;
	}

	public void setGrandezza(double grandezza) {
		this.grandezza = grandezza;
	}

	public int getVelocitaMax() {
		return velocitaMax;
	}

	public void setVelocitaMax(int velocitaMax) {
		this.velocitaMax = velocitaMax;
	}

	
}
