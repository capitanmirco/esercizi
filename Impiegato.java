public class Impiegato
{

		private String nome;

		private String cognome;

		private static int contatore;



		
		{

			contatore++;
		}


		public void setNome(String nome)
		{
				this.nome=nome;

		}

		public static int getContatore()
		{
			return contatore;
		}

}