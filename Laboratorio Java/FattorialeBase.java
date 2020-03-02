import java.util.Scanner;
public class FattorialeBase{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci numero: ");
		long num = sc.nextLong();
		long fatt = 1;
		while(num!=1){
			fatt = fatt*num;
			num--;
			//fatt *= num--
		}

		System.out.println("Il fattoriale del numero inserito e' "+fatt);
	}
}