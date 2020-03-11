package it.corso.assicurazione;

public class Automobile {
	
	private int numeroTarga;
	private Cliente cliente;
	
	public Automobile(int numeroTarga, Cliente cliente) {
		this.numeroTarga = numeroTarga;
		this.cliente = cliente;
	}

	public int getNumeroTarga() {
		return numeroTarga;
	}

	public void setNumeroTarga(int numeroTarga) {
		this.numeroTarga = numeroTarga;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
