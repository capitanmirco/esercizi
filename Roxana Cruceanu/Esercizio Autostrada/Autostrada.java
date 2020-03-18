package it.elis.java;
import java.util.ArrayList;
public class Autostrada {
	
	ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();
	
	public void entraInAutostrada(Veicolo v) {
		
		veicoli.add(v);
		
	}
	
	public void esciDaAutostrada(Veicolo v) {
		
		veicoli.remove(v);
	}
	
	
	public void stampaAutomobili() {
		
		for(Veicolo v : veicoli) {
			
			if(v.getClass() == Automobile.class) {
				System.out.println(v.info());
			}
		}
		
	}
	
	public void stampaMoto() {
		
		for(Veicolo v : veicoli) {
			
			if(v.getClass() == Moto.class) {
				System.out.println(v.info());
			}
			
		}
		
	}
	
	public void stampaCamion() {
		
		for(Veicolo v : veicoli) {
			
			if(v.getClass() == Camion.class) {
				System.out.println(v.info());
			}
			
		}
		
	}
	
	
	public void stampaVeicoli() {
		
		for(Veicolo z: veicoli) {

			System.out.println(z.info());
	}
	}
	

	public static void main(String[] args) {
		
		Autostrada autostrada = new Autostrada();
		
		Moto m = new Moto("Hornet", "Honda", 1.2, 2, 2);
		Automobile a = new Automobile("Ford", "Fiesta", 0.8, 5, "Utilitaria");
		Camion c = new Camion("TGX", "MAN", 2.4, 8, "Bianco");
		
		autostrada.entraInAutostrada(m);
		autostrada.entraInAutostrada(a);
		autostrada.entraInAutostrada(c);
		
		autostrada.stampaVeicoli(); 
		
		autostrada.esciDaAutostrada(m);
		
		System.out.println("Automobili in autostrada:");		
		autostrada.stampaAutomobili();
		System.out.println("Moto in autostrada:");
		autostrada.stampaMoto();
		System.out.println("Camion in autostrada:");
		autostrada.stampaCamion();
		
	}

}
