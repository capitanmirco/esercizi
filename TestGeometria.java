public class TestGeometria{
	
	public static void main(String[] args) {
		

			GeometriaMigliorata x=new GeometriaMigliorata();
			double c=14;
			
			double base=20;
			int altezza=10;

			int baset=2;
			int altezzat=10;
			
			System.out.println("l'area del quadrato e "+x.calcolaArea(c));

			System.out.println("l'area del rettangolo e "+x.calcolaArea(base,altezza));

			System.out.println("l'area del triangolo e "+x.calcolaArea(baset,altezzat));



	}


}