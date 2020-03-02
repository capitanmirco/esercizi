import java.util.Scanner;
public class ConsonanteVocale{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci carattere: ");
		char c = sc.next().toLowerCase().charAt(0);
		if(c>=97 && c<=122){
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
				System.out.println("Vocale");
			}else{
				System.out.println("Consonante");
			}
		}else {
			System.out.println("Carattere Speciale");
		}

	}
}