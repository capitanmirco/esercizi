package it.elis.java;

public class Cliente {
	
	private String nominativo;

	public Cliente(String nominativo) {
		this.nominativo = nominativo;
	}

	public String getNominativo() {
		return nominativo;
	}

	@Override
	public String toString() {
		return "Nominativo Cliente= " + getNominativo();
	}
	
	

}
