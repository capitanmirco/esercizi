package garage;


public class Automobile extends Veicolo{
	private int posti;
	private String modello;
	public Automobile(String nome, String marca, double cilindrata, int posti, String modello) {
		super(nome, marca, cilindrata);
		this.posti = posti;
		this.modello = modello;
	}
	public String toString(){
	    String c=" ";
	    return c=this.nome+"\n"+this.marca+"\n"+this.cilindrata+"\n"+this.posti+" "+this.modello;
	}
	
}