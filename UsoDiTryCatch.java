import javax.swing.*;
public class UsoDiTryCatch
{


	public static void main(String[] args) {
		
		String x=JOptionPane.showInputDialog("INSERISCI UN NUMERO!!!!!");

		try{

				int y=Integer.parseInt(x);

		   }
		   catch(NumberFormatException e)
		   {
		   		JOptionPane.showMessageDialog(null,"devi inserire numeri c.....");
		   		//System.out.println("devi inserire numeri c.....");

		   }
		   finally
		   {

		   		System.out.println("sono nel blocco finally");

		   }
		
	}
}