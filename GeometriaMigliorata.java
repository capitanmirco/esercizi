public class GeometriaMigliorata{

		private double area;

		// USO DELL' OVERLOADING SUI METODI

		public double calcolaArea(double lato){


				area=lato*lato;
				return area;

		}
		public double calcolaArea(double base,double altezza){


				area=base*altezza;
				return area;

		}

		public double calcolaArea(int base,int altezza){


				area=(base*altezza)/2;
				return area;

		}

		

}