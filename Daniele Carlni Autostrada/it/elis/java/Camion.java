package it.elis.java;

public class Camion extends Veicolo {
	
	private double altezza;
	private String tipoTrasporto;
	
	
	
	public Camion(String nome, String marca, double cilindrata, double altezza, String tipoTrasporto) {
		super(nome, marca, cilindrata);
		setAltezza(altezza);
		setTipoTrasporto(tipoTrasporto);
	}
	
	public double getAltezza() {
		return altezza;
	}
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	public String getTipoTrasporto() {
		return tipoTrasporto;
	}
	public void setTipoTrasporto(String tipoTrasporto) {
		this.tipoTrasporto = tipoTrasporto;
	}
	
	@Override
	public String info() {
		return getNome() + " " + getMarca() + " " + getCilindrata() + " " + getAltezza() + " " + getTipoTrasporto();
	}

}
