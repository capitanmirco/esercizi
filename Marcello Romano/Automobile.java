package it.elis.java;

public class Automobile extends Veicolo {
	
	private int specchietti;
	private String matricola;
	public Automobile(String nome, String marca, double cilindrata, int specchietti, String matricola) {
		super(nome, marca, cilindrata);
		this.specchietti = specchietti;
		this.matricola = matricola;
	}
	public int getSpecchietti() {
		return specchietti;
	}
	public void setSpecchietti(int specchietti) {
		this.specchietti = specchietti;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	public String info() {
		return getNome() + " " + getMarca()+ " " + getCilindrata() + " " + getSpecchietti()  + " " + getMatricola();
		
	}

}
