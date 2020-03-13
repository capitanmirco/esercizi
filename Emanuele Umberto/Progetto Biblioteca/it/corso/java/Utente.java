package it.corso.java;

public class Utente {
	
	private String nome;
	private int eta;
	private boolean tessera;
	
	public Utente(String nome, int eta, boolean tessera) {
		super();
		this.nome = nome;
		this.eta = eta;
		this.tessera = tessera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean isTessera() {
		return tessera;
	}

	public void setTessera(boolean tessera) {
		this.tessera = tessera;
	}

	public String info() {
		return "nome=" + nome + ", eta=" + eta + ", tessera=" + tessera;
	}
	
}
