package garage;

public class Camion extends Veicolo{
	private String cambio;
	private double capienza;
	public Camion(String nome, String marca, double cilindrata, String cambio, double capienza) {
		super(nome, marca, cilindrata);
		this.cambio = cambio;
		this.capienza = capienza;
	}
	public String toString(){
	    String c=" ";
	    return c=this.nome+"\n"+this.marca+"\n"+this.cilindrata+"\n"+this.cambio+" "+this.capienza;
	}

	
}
