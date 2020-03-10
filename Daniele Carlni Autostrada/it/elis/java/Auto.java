package it.elis.java;

public class Auto extends Veicolo {
	
	private String tipoAuto;
	private int postiAuto;
	
	
	
	public Auto(String nome, String marca, double cilindrata, String tipoAuto, int postiAuto) {
		super(nome, marca, cilindrata);
		setTipoAuto(tipoAuto);
		setPostiAuto(postiAuto);
	}
	
	public String getTipoAuto() {
		return tipoAuto;
	}
	public void setTipoAuto(String tipoAuto) {
		this.tipoAuto = tipoAuto;
	}
	public int getPostiAuto() {
		return postiAuto;
	}
	public void setPostiAuto(int postiAuto) {
		this.postiAuto = postiAuto;
	}
	
	@Override
	public String info() {
		return getNome() + " " + getMarca() + " " + getCilindrata() + " " + getPostiAuto() + " " + getTipoAuto();
	}

}
