/*
 * 
 *  Gestione di un’assicurazione
 *
 *  Un’assicurazione desidera creare un archivio elettronico in grado di raccogliere
 *  informazioni sulle automobili e sui loro proprietari. 
 *
 *  classe Cliente
 *  - nominativo (stringa)
 *   
 *  classe Automobile 
 *  - il numero di targa della vettura (intero) 
 *  - un riferimento al proprietario della classe Cliente. 
 *  
 *  La classe Archivio 
 *  - variabile di istanza ArrayList<Cliente> clienti 
 *  - ArrayList<Automobile> automobili.
 *  
 *  Metodi:
 *  + addCliente(String unNome)che aggiunge un nuovo cliente all’arraylist clienti.
 *  + addAutomobile(int unaTarga, String unNome) che aggiunge una nuova auto all’arraylist automobili. 
 *  + removeAutomobile(int unaTarga) che rimuove un automobile dall’arraylist automobili. 
 *  + clienteTarga(int unaTarga) che restituisce il nome del proprietario di una targa. 
 *  + returnTarga(String unNome) che restituisce una lista con le targhe delle automobili aventi un dato proprietario. 
 *  + contaAuto(String unNome) che conta quante automobili sono associate a un cliente. 
 *  + removeCliente(String unNome) che toglie un cliente dall'arraylist clienti e le sue auto dall'arraylist automobili. 
 *  + maxAuto() che restituisce il cliente con il maggior numero di auto.
 */

package esGestioneAssicurazione;

public class GestioneAssicurazione 
{
	public static void main(String[] args) 
	{
		Archivio a = new Archivio();
		a.addAutomobile("MNC960MNE", "Chiara");
		a.addAutomobile("SDC940MNU", "Chiara");
		a.addAutomobile("CCC222LED", "Chiara");
		a.addAutomobile("NNC395WUP", "Franco");
		a.addAutomobile("MPO034KNE", "Franco");
		a.addAutomobile("RRT375ABC", "Alba");
		a.addAutomobile("ASD764FNO", "Simona");
		a.addCliente("Simona");
		a.addCliente("Jessica");
		
		a.stampaAutomobili();
		a.stampaClienti();
		//System.out.println("*************************\n");
		
		System.out.println("\nil cliente con più auto è " + a.maxAuto());
		
		System.out.println("\nHO RIMOSSO UN CLIENTE");
		a.removeCliente("Alba");
		a.stampaAutomobili();
		a.stampaClienti();
		
		System.out.println("\nHO RIMOSSO UN'AUTOMOBILE");
		a.removeAutomobile("NNC395WUP");
		a.stampaAutomobili();
		
		System.out.println("\nle macchine di Chiara sono: " + a.contaAuto("Chiara"));
		for(String s : a.returnTarga("Chiara"))
		{
			System.out.println(s);
		}
		
		System.out.println("la macchina targata ASD764FNO è di " + a.clienteTarga("ASD764FNO"));
		
	}
}
