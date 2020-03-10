package esercizio;

import java.util.ArrayList;

public class Persona {
	


	public static void main(String[] args) {

		Automobile a = new Automobile ("Panda", "Fiat", 1.2,4,"utilitaria");
		Moto m= new Moto( "Hornet","Honda",1.0);
		
		ArrayList<Veicolo> lista = new ArrayList<Veicolo>();
		lista.add(a);
		lista.add(m);
	}
	
}