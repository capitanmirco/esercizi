import java.util.Scanner;
public class EsercizioArray{
	

	public static void main(String[] args) {
		int dim;
		int[] v;
		
		Scanner s=new Scanner(System.in);

		/***********************************/
		// DIMENSIONE DELL'ARRAY
		/**********************************/
		
			System.out.println("inserisci la dimensione dell'array");
			dim=s.nextInt();
		while(dim<10)
		{

			System.out.println("inserisci la dimensione dell'array");
			
		}
			v=new int[dim];
			System.out.println("dimensione inserita "+v.length);
		/***********************************/
		// INSERIMENTO VALORI NELL'ARRAY
		
			System.out.println("inserisci i valori dell'array");
			for(int j=0;j<dim;j++)
			{
				System.out.println("valore all'indice "+j);
				v[j]=s.nextInt();

			}
			
			for (int i=0;i<v.length ;i++ ) {

				if ((i%2==0 && v[i]%2==0)) {
					
					System.out.println("indice "+i+" valore "+v[i]);
				}
				if ((i%2!=0 && v[i]%2!=0)) {

					System.out.println("indice "+i+" valore "+v[i]);
					
				}
				
			}
			

		
	}

}