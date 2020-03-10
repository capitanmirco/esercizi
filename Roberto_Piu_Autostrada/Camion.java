package it.elis.java;

public class Camion extends Veicolo{
	private int marce;
	private int rimorchi;
	
	public Camion(String ma, String mo, double c, int mar, int r) {
		super(ma, mo, c);
		setMarce(mar);
		setRimorchi(r);
	}

	public int getMarce() {
		return marce;
	}

	public int getRimorchi() {
		return rimorchi;
	}

	public void setMarce(int marce) {
		this.marce = marce;
	}

	public void setRimorchi(int rimorchi) {
		this.rimorchi = rimorchi;
	}
	
	public String toString() {
		return super.toString() + " " + getMarce() + " " + getRimorchi();
	}
}
