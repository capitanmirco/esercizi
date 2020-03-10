package it.elis.java;

public class Camion extends Veicolo {
	
	private boolean rimorchio;
	private String carico;
	
	public Camion(String marca, String nome, double cilindrata, boolean rimorchio, String carico) {
		super(marca, nome, cilindrata);
		this.rimorchio = rimorchio;
		this.carico = carico;
	}

	public boolean isRimorchio() {
		return rimorchio;
	}

	public void setRimorchio(boolean rimorchio) {
		this.rimorchio = rimorchio;
	}

	public String getCarico() {
		return carico;
	}

	public void setCarico(String carico) {
		this.carico = carico;
	}

	@Override
	public String toString() {
		return super.toString() + " rimorchio=" + rimorchio + ", carico=" + carico;
	}

	@Override
	public boolean accellera() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
