package it.elis.java;

public class Moto extends Veicolo {
	private String nazionalita;
	private double posti;
	public Moto(String nome, String marca, double cilindrata, String nazionalita, double posti) {
		super(nome, marca, cilindrata);
		this.nazionalita = nazionalita;
		this.posti = posti;
	}
	public String getNazionalita() {
		return nazionalita;
	}
	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
	public double getPosti() {
		return posti;
	}
	public void setPosti(double posti) {
		this.posti = posti;
	}
	
	

}
