public class Cane extends Animali{


	private String razza;
	private String taglia;

	public void setRazza(String razza)
	{
		this.razza=razza;
	}
	public void setTaglia(String taglia)
	{

		this.taglia=taglia;

	}
	public String getTaglia()
	{
		return taglia;
	}
	public String getRazza()
	{
		return razza;
	}
	public  void stampaVerso()
	{

		System.out.println("bau");
	}

}