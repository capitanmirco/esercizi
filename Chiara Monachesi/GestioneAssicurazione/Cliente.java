package esGestioneAssicurazione;

public class Cliente 
{
	private String nome;
	
	
	public Cliente(String nome) 
	{
		setNome(nome);
	}

	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + "]";
	}
	
}
