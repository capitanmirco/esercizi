public class ForWhileDoWhile{
	
		public static void main(String[] args) {
			
			for (int cont=0;cont<5 ;cont++ ) {

				System.out.println(cont);
				
			}

			System.out.println("FINE CICLO FOR");
			System.out.println("***********************");
			System.out.println("INIZIO CICLO WHILE");

			int cont=0;
			while(cont<5){

					System.out.println(cont);
					cont++;
			}

			System.out.println("FINE CICLO WHILE");
			System.out.println("***********************");




			int i=5;

			while(i<5){

					System.out.println(i);
					i++;
			}



			do{
					System.out.println("contatore del do-while "+i);
					i++;
			}
			while(i<5);	







			boolean check=true;
				int valori=0;	
				while(check){

					
					

					if(valori==17){

							check=false;		


					}			
					System.out.println(valori++);
				}





		}



}