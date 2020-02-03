public class TestInteressi{
	

		public static void main(String[] args) {
			

			ContoConInteressi x=new ContoConInteressi();

			x.setInteresse(1.3);


			x.deposito(1000);


			System.out.println( x.getSaldo() );



		}

}