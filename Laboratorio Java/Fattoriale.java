import java.util.Scanner;
public class Fattoriale{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci numero: ");
		long n = sc.nextLong();
		long fatt = 1;
		System.out.print(n+"! = ");
		while(n!=0){
			if(n>0){
				fatt*=n--;
			}else{
				fatt*=n++;
			}
		}
		System.out.println(fatt);
	}
}