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
		public String getNome()
		{
				return this.nome;

		}


		public static int getContatore()
		{

			return contatore;

		}

		public static void main(String[] args) 
		{


				Impiegato x=new Impiegato();



				x.setNome(args[0]);
			
				System.out.println(x.getNome());

		}

}