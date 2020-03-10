package it.elis.java;

public class Camion extends Veicolo {
	private String rimorchio;
	private String patente;
	public Camion(String nome, String marca, double cilindrata, String rimorchio, String patente) {
		super(nome, marca, cilindrata);
		this.rimorchio = rimorchio;
		this.patente = patente;
	}
	public String toString(){
	    String a =" ";
	    return a = this.nome+" "+this.marca+" "+this.cilindrata+" "+this.rimorchio+" "+this.patente;
	}

}
