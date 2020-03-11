package it.elis.java;

public class Automobile2 {
	private int numeroTarga;
	private int idCliente;
	public Automobile2(int numeroTarga, int idCliente) {
		
		this.numeroTarga = numeroTarga;
		this.idCliente = idCliente;
	}
	public Automobile2(int targa, Cliente cliente) {


	}
	public int getNumeroTarga() {
		return numeroTarga;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public Cliente getProprietario() {


		return null;
	}	
}
