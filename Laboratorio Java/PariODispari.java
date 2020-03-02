import java.util.Scanner;
public class PariODispari{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int x = sc.nextInt();
		if(x == x/2*2){
			System.out.println("Il numero e' pari");
		}else{
			System.out.println("Il numero e' dispari");
		}
	}
}