import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class SuperEnalotto
{
	
	public static void main(String[] args) {
		
			Scanner s=new Scanner(System.in);

			HashSet<Integer> sestinaG=new HashSet<Integer>();
			HashSet<Integer> sestinaV=new HashSet<Integer>();
			ArrayList<Integer> gOrdinata=new ArrayList<Integer>();
			ArrayList<Integer> vOrdinata=new ArrayList<Integer>();

			int punti=0;

			System.out.println("inserisci un numero tra 1 e 90");

			for (int i=0;i<6 ;i++ ) {
				
				
				int g=s.nextInt();
				if (g<=0 || g>90 ) {
					
					System.out.println("numero non valido");
					i--;
					
					
				}
				
				else if(  !sestinaG.add(g))
				{
					System.out.println("numero gia inserito");
						i--;

				}
				
			}

			gOrdinata.addAll(sestinaG);
			Collections.sort(gOrdinata);
			System.out.println("La tua giocata");
			System.out.println(gOrdinata);
			

			for (int j=0;j<6 ;j++ ) {


				
					if(!sestinaV.add( (int)(Math.random()*90+1)   ) )
					{
							j--;
					}
			}
			for (int k=0;k<sestinaV.size() ;k++ ) {

				if (sestinaV.contains(gOrdinata.get(k))) {
					punti++;
				}
				
			}
			vOrdinata.addAll(sestinaV);
			Collections.sort(vOrdinata);
			System.out.println("sestina vincente");
			System.out.println(vOrdinata);
			System.out.println("hai ottenuto "+punti+" punti");
	}
}