package it.elis.java;

public class Auto extends Veicolo{
	private int posti;
	private String tipo;
	
	public Auto(String ma, String mo, double c, int p, String t) {
		super(ma, mo, c);
		setPosti(p);
		setTipo(t);
	}

	public int getPosti() {
		return posti;
	}

	public String getTipo() {
		return tipo;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return super.toString() + " " + getPosti() + " " + getTipo();
	}	
}
