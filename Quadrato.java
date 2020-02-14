public class Quadrato implements FormaGeometricaBeforJava8
{
	public double calcolaArea(double lato1,double lato2)
	{


			return lato2*lato2;
	}


	public static void main(String[] args) {

		
		Quadrato ciccio=new Quadrato();
		double x;
		x= ciccio.calcolaArea(10,30);
		System.out.println(x);
		
	}

}

