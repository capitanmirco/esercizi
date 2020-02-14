public class UsoFunctional
{
	
	public static void main(String[] args) {
			

			FormaGeometrica Rettangolo=(a,d)->a*d;
			
			FormaGeometrica Triangolo=(a,b) -> (a*b)/2;

			System.out.println( Rettangolo.calcolaArea(10,20) );
			System.out.println( Triangolo.calcolaArea(10,10) );
		}	

}