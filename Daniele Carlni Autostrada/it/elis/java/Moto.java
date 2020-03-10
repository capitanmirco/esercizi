package it.elis.java;

public class Moto extends Veicolo {
	
	private String tipoMoto;
	private int casco;
	
	public Moto(String nome, String marca, double cilindrata, String tipoMoto, int casco) {
		super(nome, marca, cilindrata);
		this.tipoMoto = tipoMoto;
		this.casco = casco;
	}

	public String getTipoMoto() {
		return tipoMoto;
	}

	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}

	public int getCasco() {
		return casco;
	}

	public void setCasco(int casco) {
		this.casco = casco;
	}
	
	
	@Override
	public String info() {
		return getNome() + " " + getMarca() + " " + getCilindrata() + " " + getCasco() + " " + getTipoMoto();
	}
	

}
