/*
 * Gestione di un Cinema
Testo:
Si implementi una classe Cinema, avente il nominativo (stringa) come variabile d’istanza, 
la città (stringa) come variabile d’istanza e una serie di Sale (Sala) come variabile d’istanza; 
una classe Sala avente come variabili d’istanza il nominativo della sala(stringa) 
il numero di posti totali(intero), il film in proiezione (stringa) come variabile d'istanza e 
una serie di Biglietti (Biglietto);
una classe Biglietto avente come variabili d’istanza un riferimento all'oggetto Utente (Utente);
una classe Utente avente il nominativo (stringa) come variabile d’istanza, 
la città (stringa) come variabile d’istanza, età (intero) come variabile d’istanza;

La classe
Gestione Cinema dove creare un oggetto di tipo Cinema, creare successivamente una serie di sale del Cinema e per ogni Sala creare una serie di biglietti. Dotare la classe Cinema dei seguenti metodi:
addSala che aggiunge una nuova sala all’arraylist sale.
addBiglietto che aggiunge una nuovo biglietto all’arraylist Biglietti tenendo conto del numero massimo di posti per ogni Sala.
printBiglietti che stampa tutti i biglietti venduti per una determinata sala.
printInfoBiglietto che stampa tutte le informazioni del biglietto, 
(num.posto, nominativo utente, film e nome sala, nome cinema)
*/

package it.corso.java;

public class GestioneCinema {

	public static void main(String[] args) {
		
		Cinema UCI = new Cinema("UCI Cinema", "Roma");
		UCI.addSala("Mastroianni", 50, "La vita è bella");
		UCI.addSala("Galvani", 80, "Batman");
		UCI.stampaSale();
		Utente rossi = new Utente("Mario Rossi", "Roma", 79);
		UCI.addBigliettoCinema(rossi, "Galvani");
		UCI.addBigliettoCinema(new Utente("Giuseppe Verdi", "Milano", 19), "Galvani");
		UCI.stampaBiglietti("Galvani");
	

	}

}
