package it.elis.java;

public class Automobile  extends Veicolo{
	private int posti;
	private String modello;
	public Automobile(String nome, String marca, double cilindrata, int posti, String modello) {
		super(nome, marca, cilindrata);
		this.posti = posti;
		this.modello = modello;
	}
	public String toString(){
	    String a =" ";
	    return a = this.nome+" "+this.marca+" "+this.cilindrata+" "+this.posti+" "+this.modello;
	}
}
