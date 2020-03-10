package it.elis.java;

public class Camion extends Veicolo {
	
	private int rimorchio;
	private int assi;
	public Camion(String nome, String marca, double cilindrata, int rimorchio, int assi) {
		super(nome, marca, cilindrata);
		this.rimorchio = rimorchio;
		this.assi = assi;
	}
	public int getRimorchio() {
		return rimorchio;
	}
	public void setRimorchio(int rimorchio) {
		this.rimorchio = rimorchio;
	}
	public int getAssi() {
		return assi;
	}
	public void setAssi(int assi) {
		this.assi = assi;
	}
	
	public String info() {
		return getNome() + " " + getMarca()+ " " + getCilindrata() + " " + getRimorchio()  + " " + getAssi();
		
	}
	
	

}
