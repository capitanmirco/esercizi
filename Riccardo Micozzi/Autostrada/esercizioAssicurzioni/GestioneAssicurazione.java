package esercizioAssicurzioni;

public class GestioneAssicurazione 
{
	public static void main(String[] args) 
	{
		Archivio a = new Archivio();
		a.addAutomobile("abcd", "Riccardo");
		a.addAutomobile("efgh", "Ciccio");
		a.addAutomobile("ilm", "Mario");
		a.addAutomobile("nop", "Luigi");
		a.addAutomobile("qrs", "Gino");
		a.addAutomobile("tuv", "Federico");
		a.addAutomobile("wxyz", "Benny");
		a.addCliente("Riccardo");
		a.addCliente("Federico");
		
		a.stampaAutomobili();
		a.stampaClienti();
		//System.out.println("*************************\n");
		
		System.out.println("\nil cliente con più auto è " + a.maxAuto());
		
		System.out.println("\nHO RIMOSSO UN CLIENTE");
		a.removeCliente("Federico");
		a.stampaAutomobili();
		a.stampaClienti();
		
		System.out.println("\nHO RIMOSSO UN'AUTOMOBILE");
		a.removeAutomobile("wxyz");
		a.stampaAutomobili();
		
		System.out.println("\nle macchine di Riccardo sono: " + a.contaAuto("Riccardo"));
		for(String s : a.returnTarga("Riccardo"))
		{
			System.out.println(s);
		}
		
		System.out.println("la macchina targata abcd è di " + a.clienteTarga("abcd"));
		
	}
}
