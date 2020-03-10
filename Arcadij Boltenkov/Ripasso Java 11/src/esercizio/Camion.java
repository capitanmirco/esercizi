package esercizio;

public class Camion extends Veicolo {

private String colore;
private String merce;
public Camion(String nome, 
		String marca, 
		double cilindrata,
		String colore,
		String merce
		){
	super(nome, marca, cilindrata);
	this.colore = colore;
	this.merce = merce;



}
public String getColore() {
	return colore;
}
public void setColore(String colore) {
	this.colore = colore;
}
public String getMerce() {
	return merce;
}
public void setMerce(String merce) {
	this.merce = merce;
}
}