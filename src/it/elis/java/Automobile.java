package it.elis.java;

public class Automobile extends Veicolo {

	private int nPosti;
	private int nPorte;
	
	public Automobile(String nome, String marca, double cilindrata, int nPosti, int nPorte) {
		super(nome,marca, cilindrata);
		this.nPosti = nPosti;
		this.nPorte = nPorte;
	}

	public int getnPosti() {
		return nPosti;
	}

	public void setnPosti(int nPosti) {
		this.nPosti = nPosti;
	}

	public int getnPorte() {
		return nPorte;
	}

	public void setnPorte(int nPorte) {
		this.nPorte = nPorte;
	}
	
	public String toString() {
		return super.toString() +" "+nPosti+" "+" "+nPorte;		
	}
	
	
}
