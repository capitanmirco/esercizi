import java.util.Scanner; 
public class TestUsernamePassword{
	
	public static void main(String[] ciao) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("inserisci un nome");

		String nomeInserito=s.next();

		System.out.println("hai inserito il nome: "+nomeInserito);

		System.out.println("inserisci un numero");

		int numeroInserito=s.nextInt();//funzione che permette
									// di ottenere un numero

		System.out.println("hai inserito il numero: "+numeroInserito);


	}
}