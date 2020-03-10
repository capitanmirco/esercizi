package it.elis.java;

public class Automobile extends Veicolo {
	
	private int capienza;
	private int numeroPorte;
	
	public Automobile(String nome, String marca, double cilindrata, int capienza, int numeroPorte) {
		super(nome, marca, cilindrata);
		this.capienza = capienza;
		this.numeroPorte = numeroPorte;
	}
	
	public int getCapienza() {
		return capienza;
	}
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}
	public int getNumeroPorte() {
		return numeroPorte;
	}
	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
	
}
