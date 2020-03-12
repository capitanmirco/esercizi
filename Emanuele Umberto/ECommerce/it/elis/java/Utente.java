package it.elis.java;

public class Utente {
	
	private String nome;
	private double budget;
	private int anni;
	
	public Utente(String nome, double budget, int anni) {
		super();
		this.nome = nome;
		this.budget = budget;
		this.anni = anni;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getAnni() {
		return anni;
	}

	public void setAnni(int anni) {
		this.anni = anni;
	}
	
	

}
