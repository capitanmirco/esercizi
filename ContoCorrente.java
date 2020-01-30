public class ContoCorrente{
	
	private double saldo;
	private String nome;
	private String cognome;
	private String id;

	/**
	*
	*	metodo che permette di inserire
	*	il nome del correntista
	*/
	public String getNome()
	{

			return nome;

	}
	public String getCognome()
	{

			return cognome;

	}

	public String getId()
	{

			return id;

	}

	public double getSaldo()
	{

			return saldo;

	}


	public void setNome(String n)
	{

		nome=n;
	}

	public void setCognome(String c)
	{

		cognome=c;
	}

	public void setId(String i)
	{

		id=i;
	}




	public boolean deposito(double d){

		boolean check=true;

		if (d<=0) {
			check= false;
		}
		else
		{
			saldo=saldo+d;
			
		}
		return check;
	}


	/**
	*
	*
	* metodo che permette di effettuare 
	*	un prelievo.
	* effettua un controllo sul valore passato in input
	*/
	public boolean prelievo(double p){

			boolean check=true;

			if (p>saldo) {

				check=false;
				
			}
			else
			{
				saldo=saldo-p;
			}

			return check;

	}
}