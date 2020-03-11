package it.carsharing;

public class Parcheggio {
	
	private String nome;
	
	public Parcheggio(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "nome=" + nome;
	}

}
