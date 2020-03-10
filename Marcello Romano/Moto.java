package it.elis.java;

public class Moto extends Veicolo{
	private int ruote;
	private String targa;
	
	
	public Moto(String nome, String marca, double cilindrata, int ruote, String targa) {
		super(nome, marca, cilindrata);
		this.ruote = ruote;
		this.targa = targa;
	}


	public int getRuote() {
		return ruote;
	}


	public void setRuote(int ruote) {
		this.ruote = ruote;
	}


	public String getTarga() {
		return targa;
	}


	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public String info() {
		return getNome() + " " + getMarca()+ " " + getCilindrata() + " " + getRuote()  + " " + getTarga();
		
	}

}
