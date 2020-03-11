package esercizioAssicurzioni;

public class Automobile 
{
	private String targa;
	private Cliente cliente;
	
	
	
	public Automobile(String targa, Cliente cliente) 
	{
		this.targa=targa;
		this.cliente=cliente;
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
		return "targa=" + targa + ", " + cliente.toString() + " ";
	}
	
	

}
