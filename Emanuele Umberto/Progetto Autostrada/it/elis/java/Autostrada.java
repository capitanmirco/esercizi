package it.elis.java;

import java.util.ArrayList;

public class Autostrada {
	
	static ArrayList<Veicolo> a1 = new ArrayList<Veicolo>();

	public static void main(String[] args) {
		
		Automobile panda = new Automobile("Fiat", "Panda", 1.2, "Rossa", 4);
		//System.out.println(panda.toString());
		Moto hornet = new Moto("Honda", "Hornet", 1.0, 1, "strada");
		//System.out.println(hornet.toString());
		Camion daily = new Camion("Iveco", "Daily", 1.9, false, "Mascherine");
		//System.out.println(daily.toString());
		
		stampaVeicoli();
		entraInAutostrada(panda);
		entraInAutostrada(daily);
		entraInAutostrada(hornet);
		stampaVeicoli();
		escidaAutostrada(daily);
		stampaVeicoli();
		stampaAutomobili();

	}
	
	public static void entraInAutostrada(Veicolo v) {
		a1.add(v);
	}
	
	public static void escidaAutostrada(Veicolo v) {
		a1.remove(v);
	}
	
	public static void stampaVeicoli() {
		System.out.println("Veicoli in autostrada " + a1.size());
		for (Veicolo veicolo : a1) {
			System.out.println(veicolo.toString());
		}
	}
	
	public static void stampaAutomobili() {
		System.out.println("Automobili in autostrada ");
		for (Veicolo veicolo : a1) {
			if(veicolo instanceof Automobile) {
				System.out.println(veicolo.toString());
			}
		}
	}

}
