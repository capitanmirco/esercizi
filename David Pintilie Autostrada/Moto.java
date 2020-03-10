package garage;

public class Moto extends Veicolo{
	private int caschi;
	private int posti;
	public Moto(String nome, String marca, double cilindrata, int caschi, int posti) {
		super(nome, marca, cilindrata);
		this.caschi = caschi;
		this.posti = posti;
	}
	public String toString(){
	    String c=" ";
	    return c=this.nome+"\n"+this.marca+"\n"+this.cilindrata+"\n"+this.caschi+" "+this.posti;
	}
	

}
