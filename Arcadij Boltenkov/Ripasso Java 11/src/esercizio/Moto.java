package esercizio;

public class Moto extends Veicolo {

	private int caschi;
	private String colore;
	private String Grandezzavetro;
	public Moto(String nome, 
			String marca, 
			double cilindrata,
			int caschi,
			String colore,
			String Grandezzavetro
			){
		super(nome, marca, cilindrata);
		this.caschi = caschi;
		this.colore= colore;
		this.Grandezzavetro= Grandezzavetro;
		

}
	public int getCaschi() {
		return caschi;
	}
	public void setCaschi(int caschi) {
		this.caschi = caschi;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getGrandezzavetro() {
		return Grandezzavetro;
	}
	public void setGrandezzavetro(String grandezzavetro) {
		Grandezzavetro = grandezzavetro;
	}
}