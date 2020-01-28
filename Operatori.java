public class Operatori{
	
	public static void main(String[] args) {

		//uso degli operatori unari
		int x=10;
		x=x+1;

		x++;

		x+=2;// equivale a x=x+2

		System.out.println(x++);//stampa 14
		System.out.println(++x);//stampa 16
		/************************************/

		// operatore mod, restituisce il resto di una divisione

		int z=10;

		int resto = z%2;
		System.out.println("resto della divisione "+ resto);


		
	}

	
}