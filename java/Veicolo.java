package it.elis.java;

public class Veicolo {
	
	public String nome;
	public String marca;
	public double cilindrata;
	public Veicolo(String nome, String marca, double cilindrata) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.cilindrata = cilindrata;
	}
	
	public String getNome() {
		return this.nome;
	}
	public String getMarca() {
		return this.marca;
	}
	public double getCilindrata() {
		return this.cilindrata;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String info(){
		return this.marca+" "+" "+this.nome+" "+this.cilindrata;
	}
	public void accellera() {
		System.out.println("Sto accellerando");
	}
	
	
	
}
