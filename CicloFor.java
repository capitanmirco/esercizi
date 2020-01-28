public class CicloFor
{
	
	public static void main(String[] args) {

		
		// ciclo for, forma classica
		for (int cont=5;cont>0;cont--) 
		{
			
			System.out.println("ciao");
		}


		//uso del break nel ciclo for

		for (int v=0;v<20 ; v++) {

			if (v==17) {
				
				break;
			}
			System.out.println(v);

			
		}

		//uso del continue nel ciclo for

		for (int v=0;v<20 ; v++) {

			if (v==17) {
				
				continue;
			}
			System.out.println(v);

			
		}


	}


}