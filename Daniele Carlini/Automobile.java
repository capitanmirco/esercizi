package it.elis.java;

public class Automobile {
	
	private String targa;
	private Cliente cliente;
	
	public Automobile(String targa, Cliente cliente) {
		super();
		setTarga(targa);
		this.cliente = cliente;
	}
	
	public String getTarga() {
		return targa;
	}
	
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	

}
