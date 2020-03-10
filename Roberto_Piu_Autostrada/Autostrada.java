package it.elis.java;
import java.util.ArrayList;

public class Autostrada {
	static ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();
	
	public static void entraInAutostrada(Veicolo x){
		veicoli.add(x);
	}
	
	public static void esciDaAutostrada(Veicolo x){
		veicoli.remove(x);
	}
	
	public static void stampaVeicoli() {
		for(Veicolo x : veicoli) {
			System.out.println(x.toString());
		}
	}
	
	
	public static void main(String[] args) {
		Veicolo fiat = new Auto("Fiat", "600", 1.1, 5, "utilitaria");
		Veicolo alfa = new Auto("Alfa Romeo", "Giulia", 2.0, 5, "berlina");
		Veicolo cbr = new Moto("Honda", "cbr", 0.125, 4, "stradale");
		Veicolo iveco = new Camion("Iveco", "Iveco", 10_000, 12, 2);
		
		entraInAutostrada(fiat);
		entraInAutostrada(cbr);
		entraInAutostrada(iveco);
		entraInAutostrada(alfa);
		
		esciDaAutostrada(fiat);
		
		stampaVeicoli();
	}
}
