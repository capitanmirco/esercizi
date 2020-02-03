class TestInteresse2
{
	
		public static void main(String[] args) {
			


				ContoCorrente y=new ContoCorrente("Mario","Rossi",1200.0);

				ContoConInteressi x=new ContoConInteressi("ciccio","franco",1200.0,1.5);

				System.out.println("saldo di y -->"+y.getSaldo());


				System.out.println("saldo di x -->"+x.getSaldo());

		}

}