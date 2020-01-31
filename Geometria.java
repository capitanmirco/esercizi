public class Geometria{
	

	public double areaQuadrato(double lato){

			double area;

			area=lato*lato;

			return area;

	}

	public double areaRettangolo(double base,double altezza){

			double area=0;
			area=base*altezza;
			return area;

	}

	public double areaCerchio(double raggio){

			double area=0;
			area=(raggio*raggio)*3.14;
			return area;


	}


}