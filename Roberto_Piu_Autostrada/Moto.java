package it.elis.java;

public class Moto extends Veicolo{
	private int tempi;
	private String tipo;
	
	public Moto(String ma, String mo, double c, int te, String ti) {
		super(ma, mo, c);
		setTempi(te);
		setTipo(ti);
	}

	public int getTempi() {
		return tempi;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTempi(int tempi) {
		this.tempi = tempi;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString() {
		return super.toString() + " " + getTempi() + " " + getTipo();
	}
}
