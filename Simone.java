public class Simone
{
	
	private String competenze;
	private String msg;


	public Simone(String m)
	{
		this.msg=m;
		System.out.println("Messaggio :"+ msg);

	}



	public void setCompetenze(String c)
	{

		if(c.equals("liceo"))
		{
			this.competenze=c;
		}
		else
		{
			System.out.println("competenza non valida");
		}
		
	}
}