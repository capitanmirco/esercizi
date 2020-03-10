package esercizio;

public class Automobile extends Veicolo
{

	private int posti;
	private String modello;
	private String colore;
	private boolean decappottabile;
	
	public Automobile(String nome,
			String marca,
			double cilindrata,
			int posti,
			String modello,
			String colore,
			boolean decappottabile) {
		super (nome,marca,cilindrata);
		this.posti =posti;
		this.modello =modello;
		this.colore= colore;
		this.decappottabile= decappottabile;
	}
		


	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isDecappottabile() {
		return decappottabile;
	}

	public void setDecappottabile(boolean decappottabile) {
		this.decappottabile = decappottabile;
	}
}