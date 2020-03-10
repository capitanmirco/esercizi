package it.elis.java;

public abstract class Veicolo {
	
	private String marca;
	private String nome;
	private double cilindrata;
	
	public Veicolo(String marca, String nome, double cilindrata) {
		this.marca = marca;
		this.nome = nome;
		this.cilindrata = cilindrata;
	}

	public String getMarca() {
		return marca;
	}

	public String getNome() {
		return nome;
	}

	public double getCilindrata() {
		return cilindrata;
	}

	@Override
	public String toString() {
		return "marca=" + marca + ", nome=" + nome + ", cilindrata=" + cilindrata;
	}
	
	public abstract boolean accellera();

}
