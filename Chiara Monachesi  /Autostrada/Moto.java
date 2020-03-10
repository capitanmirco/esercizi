package it.elis.esAutostrada;

public class Moto extends Veicolo
{
	private int caschi;
	private int ruote;
	private boolean bauletto;
	
	public Moto(String nome, String marca, double cilindrata, int caschi, int ruote, boolean bauletto)
	{
		super(nome, marca, cilindrata);
		this.setCaschi(caschi);
		this.setRuote(ruote);
		this.setBauletto(bauletto);
	}

	public int getCaschi() {
		return caschi;
	}

	public void setCaschi(int caschi) {
		this.caschi = caschi;
	}

	public int getRuote() {
		return ruote;
	}

	public void setRuote(int ruote) {
		this.ruote = ruote;
	}

	public boolean isBauletto() {
		return bauletto;
	}

	public void setBauletto(boolean bauletto) {
		this.bauletto = bauletto;
	}
	
	
	
	

}
