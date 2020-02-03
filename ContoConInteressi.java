public class ContoConInteressi extends ContoCorrente{
	

	private double tassoInteresse;



	public ContoConInteressi(String ciccio,String carlo,double mirco,double ti)
	{



			super(ciccio,carlo,mirco);
			tassoInteresse=ti;

			



	}




	public void setInteresse(double t){

			tassoInteresse=t;

	}


	//OVERRIDE DEL METODO GETSALDO() DELLA SUPER CLASSE CONTOCORRENTE
	public double getSaldo()
	{

			double s=super.getSaldo();

			s=s*tassoInteresse;

			return s;

	}


}