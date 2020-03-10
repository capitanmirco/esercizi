package esGestioneAssicurazione;

public class Automobile 
{
	private String targa;
	private Cliente cliente;
	
	
	
	public Automobile(String targa, Cliente cliente) 
	{
		setTarga(targa);
		setCliente(cliente);
	}
	
	

	public String getTarga() 
	{
		return targa;
	}
	
	public void setTarga(String targa) 
	{
		this.targa = targa;
	}

	public Cliente getCliente() 
	{
		return cliente;
	}

	public void setCliente(Cliente cliente) 
	{
		this.cliente = cliente;
	}



	@Override
	public String toString() {
		return "Automobile [targa=" + targa + ", " + cliente.toString() + "]";
	}
	
	

}
