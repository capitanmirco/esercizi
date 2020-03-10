/* 	
 * 
 *  crea super classe Veicolo
 *  3 sottoclassi: automobile, moto, camion che ereditano da veicolo, 
 *  aggiungi 2 attributi a scelta 
 * 	Crea un main chiamato Autostrada che contiene un array list di Veicoli.
 * 
 * 	1 metodo entraInAutostrada e esciDaAutostrada
 * 	1 metodo che stampa le automobili presenti in autostrada
 * 	1 metodo che stampi i camion presenti in autostrada;
 * 
 * 
 * */


package it.elis.esAutostrada;

import java.util.ArrayList;

public class Autostrada {
	
	public static ArrayList<Veicolo> inAutostrada = new ArrayList<Veicolo>();

	public static void main(String[] args) 
	{
		//ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();
		
		Automobile a = new Automobile("Panda", "Fiat", 1.2, "utilitaria", 4, false, "nero");
		Moto m = new Moto("Hornet", "Honda", 1.0, 1, 2, true);
		Camion c = new Camion("Ducato", "Fiat", 2.0, 300.5,  200);
		
		
		Autostrada.entraInAutostrada(c);
		Autostrada.entraInAutostrada(m);
		Autostrada.entraInAutostrada(a);
		
		Autostrada.stampaInAutostrada();
		Autostrada.stampaCamionInAutostrada();
		
		
		Autostrada.esciDaAutostrada(0);
		
		Autostrada.stampaInAutostrada();
		
	}
	
	public static void entraInAutostrada(Veicolo v)
	{
		inAutostrada.add(v);
	}
	
	public static void esciDaAutostrada(int i)
	{
		inAutostrada.remove(i);
	}
	
	public static void stampaInAutostrada()
	{
		System.out.println("AUTOSTRADA: \n");
		for(Veicolo v : inAutostrada)
		{
			System.out.println(v.info() + "\n");
		}
	}
	
	public static void stampaCamionInAutostrada()
	{
		System.out.println("CAMION IN AUTOSTRADA: \n");
		for(Veicolo v : inAutostrada)
		{
			if(v instanceof Camion)
			{
				System.out.println(v.info() + "\n");
			}

		}
	}
	
	

}
