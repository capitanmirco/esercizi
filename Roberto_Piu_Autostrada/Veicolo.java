package it.elis.java;

public class Veicolo {
	private String marca;
	private String modello;
	private double cilindrata;
	
	public Veicolo(String ma, String mo, double c) {
		setMarca(ma);
		setModello(mo);
		setCilindrata(c);
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public double getCilindrata() {
		return cilindrata;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public String toString() {
		return getMarca() + " " + getModello() + " " + getCilindrata();
	}
}
