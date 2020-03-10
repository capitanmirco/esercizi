package it.elis.esAutostrada;

public class Veicolo 
{
	private String nome, marca;
	private double cilindrata;
	
	
	public Veicolo(String nome, String marca, double cilindrata)
	{
		setNome(nome);
		setMarca(marca);
		setCilindrata(cilindrata);
	}
	
	
	public String getNome()
	{
		return this.nome;
	}	
	
	public void setNome(String nome)
	{
		this.nome = nome; 
	}

	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		this.marca = marca;
	}

	public double getCilindrata() 
	{
		return cilindrata;
	}

	public void setCilindrata(double cilindrata) 
	{
		this.cilindrata = cilindrata;
	}
	
	public String info()
	{
		return this.marca +
				" " + this.nome + 
				" cc. " + this.cilindrata;
	}
	
}
