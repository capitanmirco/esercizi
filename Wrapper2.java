import javax.swing.*;


public class Wrapper2
{

	public static void main(String[] args) {
		
		
		String v=JOptionPane.showInputDialog("inserisci un numero");

		//int v2=(int)v;//ERRORE, NON SI PUO' FARE IL CASTING TRA UNA STRINGA E UN NUMERO

		int v2=Integer.parseInt(v);//TRASFORMO LA STRINGA OTTENUTA CON LA FINESTRA DI DIALOGO
									//UTILIZZANDO IL METODO PARSEINT() DELLA CLASSE INTEGER

		int x=10;

		int risultato =x*v2;

		System.out.println(risultato);
		System.out.println("**********************************************");


		Integer b=10;
		System.out.println(b.toString());


	}
}