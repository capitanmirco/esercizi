package it.elis.java;

public class Moto extends Veicolo {
	
	private int caschi;
	private String categoria;
	
	public Moto(String marca, String nome, double cilindrata, int caschi, String categoria) {
		super(marca, nome, cilindrata);
		this.caschi = caschi;
		this.categoria = categoria;
	}

	public int getCaschi() {
		return caschi;
	}

	public void setCaschi(int caschi) {
		if(caschi <=2 && caschi > 0) {
			this.caschi = caschi;
		} else {
			this.caschi = 1;
		}	
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return super.toString() + " caschi=" + caschi + ", categoria=" + categoria;
	}

	@Override
	public boolean accellera() {
		// TODO Auto-generated method stub
		return false;
	}



}
