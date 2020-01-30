import java.util.Scanner; 
public class CheckUsername{
	

	public static void main(String[] args) {
		
		int cont=3;
		Scanner s=new Scanner(System.in);

		for (int j=3;j>0 ;j-- ) {

			System.out.println("inserisci una username");

			String us=s.next();
			if (us.equals("pippo")) {
				
				System.out.println("Accesso consentito");
				break;
			}
			else{

				cont--;
				if(cont==0){

					System.out.println("tentativi terminati");

				}
				else{
					System.out.println("username inesistente, hai ancora "+cont+" tentativi");
				}
				
			}
			
		}

	}
}