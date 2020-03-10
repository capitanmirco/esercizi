package it.elis.java;

public class Moto extends Veicolo {
	private int caschi;
	private int posti;
	public Moto(String nome, String marca, double cilindrata, int caschi, int posti) {
		super(nome, marca, cilindrata);
		this.caschi = caschi;
		this.posti = posti;
	}
	public String toString(){
	    String a =" ";
	    return a = this.nome+" "+this.marca+" "+this.cilindrata+" "+this.caschi+" "+this.posti;
	}
}
