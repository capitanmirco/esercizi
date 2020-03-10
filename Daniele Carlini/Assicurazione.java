package it.elis.java;

import java.util.Scanner;

public class Assicurazione {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		Cliente c;
		Automobile aut;
		Archivio arc = new Archivio();
		
		System.out.println("Benvenuto nella tua societa' Assicurativa");
		
		String scelta = "";
		while(!scelta.equalsIgnoreCase("exit")) {
			System.out.println("Digita AddCli - Aggiungi nuovo cliente");
			System.out.println("Digita AddAut - Aggiungi nuova Automobile");
			System.out.println("Digita RimAut - Rimuovi Automobile");
			System.out.println("Digita RimCli - Rimuovi Cliente");
			System.out.println("Digita PropCli - Per cercare il proprietario di un veicolo");
			System.out.println("Digita VeicCli - Per cercate tutti i veicoli di un cliente");
			System.out.println("Digita Count - Per sapere quanti veicoli possiede un cliente");
			System.out.println("Digita MaxAut - Per vedere il cliente con piu' Automobili");
			System.out.println("-----------------------------------------------------------");
			System.out.println("-----------------------------------------------------------");
			
			scelta = tastiera.next();
			
			scelta = scelta.toLowerCase();
			switch(scelta) {
			/*aggiunta cliente*/
			case "addcli" : 
				System.out.println("Inserisci il nome del Cliente");
				if(arc.addCliente(tastiera.next())) {
					System.out.println("Cliente Aggiunto Correttamente \n");
				}
				break;
			/*aggiunta automobile*/	
			case "addaut" : 	
				System.out.println("Inserisci Targa dell'automobile");
				String targa = tastiera.next();
				System.out.println("Inserisci Proprietario dell'automobile");
				String cliente = tastiera.next();
				if(arc.addAutomobile(targa,cliente)) {
					System.out.println("Veicolo aggiunto Correttamente \n");
				}
				break;
			/*rimuovi automobile*/
			case "rimaut" :
				System.out.println("Inserisci la targa del veicolo da rimuovere");
				if(arc.removeAutomobile(tastiera.next())) {
					System.out.println("Veicolo Rimosso Correttamente \n");
				}
				break;
			/*rimuovi cliente*/
			case "rimcli" :
				System.out.println("Inserisci il nome del cliente per rimuovere");
				System.out.println("Il cliente ed i veicoli a lui collegati");
				if(arc.removeCliente(tastiera.next())){
					System.out.println("Cliente rimosso correttamente \n");
				}
				break;
			/*visualizza il cliente proprietario di quella targa*/
			case "propcli" :
				System.out.println("Inserisci una targa per visualizzare il proprietario");
				System.out.println(arc.clienteTarga(tastiera.next()) + "\n");
				break;
			/*visualizza veicoli di proprieta' del cliente*/
			case "veiccli" :
				System.out.println("Inserisci il nome del cliente di cui visualizzare i veicoli");
				System.out.println(arc.returnTarga(tastiera.next()) + "\n");
				break;
			/*visualizza il numero dei veicoli in possesso di un cliente*/
			case "count" :
				System.out.println("Inserisci il nome di un cliente per sapere quanti veicoli possiede");
				System.out.println(arc.contaAuto(tastiera.next()) + "\n");
				break;
			/*visualizza il cliente che possiede piu' veicoli*/
			case "maxaut" :
				System.out.println(arc.maxAuto() + "\n");
				break;
			/*default per gestione altri casi*/
			default : 
				if(scelta.equalsIgnoreCase("exit")) {
					System.out.println("Uscita in Corso! \n");
				}else {
					System.out.println("Comando non valido! \n");
				}
			}
		}
	}

}
