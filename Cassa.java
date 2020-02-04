public class Cassa
{


	public double scontrino(OggettiPrezzabili[] ciccio)
	{

				double totale=0;

				for (int i=0;i<ciccio.length ;i++ ) {

					totale+=ciccio[i].getPrezzo();
					
				}

				return totale;

	}
}