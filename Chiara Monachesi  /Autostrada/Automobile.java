package it.elis.esAutostrada;

public class Automobile extends Veicolo 
{
	
	private String modello;
	private int posti;
	private boolean cabrio;
	private String colore;
	

	public Automobile(String nome, String marca, double cilindrata, String modello, int posti, boolean cabrio, String colore) 
	{
		super(nome, marca, cilindrata);
		setModello(modello);
		setPosti(posti);
		setCabrio(cabrio);
		setColore(colore);
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	public boolean getCabrio() {
		return cabrio;
	}

	public void setCabrio(boolean cabrio) {
		this.cabrio = cabrio;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

}
