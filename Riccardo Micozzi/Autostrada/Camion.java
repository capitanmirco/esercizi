package it.elis.javaes;

public class Camion extends Veicolo{
	
	private String rimorchio;
	private int numeroRuote;
	public Camion(String nome, String marca, double cilindrata, String rimorchio, int numeroRuote) {
		super(nome, marca, cilindrata);
		this.rimorchio = rimorchio;
		this.numeroRuote = numeroRuote;
	}
	public String getRimorchio() {
		return rimorchio;
	}
	public void setRimorchio(String rimorchio) {
		this.rimorchio = rimorchio;
	}
	public int getNumeroRuote() {
		return numeroRuote;
	}
	public void setNumeroRuote(int numeroRuote) {
		this.numeroRuote = numeroRuote;
	}
	
	
	
	
	

}
