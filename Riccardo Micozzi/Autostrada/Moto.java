package it.elis.javaes;

public class Moto extends Veicolo{

	private int caschi;
	private String tipologia;

	public Moto(String nome, String marca, double cilindrata, int caschi,String tipologia) {
		super(nome, marca, cilindrata);
		this.caschi = caschi;
		this.tipologia=tipologia;
	}

	public int getCaschi() {
		return caschi;
	}

	public void setCaschi(int caschi) {
		this.caschi = caschi;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
}
