package it.elis.java;

import java.util.ArrayList;
import java.util.List;

public class Autostrada {
	
	List<Veicolo> veicoli = new ArrayList<Veicolo>();
	
	public void entraInAutostrada(Veicolo v) {
		veicoli.add(v);
	}
	
	public void esciDaAutostrada(Veicolo v) {
			int veicolo = veicoli.indexOf(v);
			veicoli.remove(veicolo);
	}
	
	public void stampaAutomobili() {
		for(Veicolo v : veicoli) {
			if(v.getClass() == Auto.class) {
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
	

	public static void main(String[] args) {
		Auto a = new Auto("Punto", "Fiat", 1.2, "Berlina", 4);
		Moto m = new Moto("Ninja", "kawasaky", 1.2, "Strada", 1);
		Camion c = new Camion("TGC", "MAN", 13.9, 2.9, "rimorchio");
		
		Autostrada aut = new Autostrada();
		
		aut.entraInAutostrada(a);
		aut.entraInAutostrada(m);
		aut.entraInAutostrada(c);
		
		System.out.println("Veicoli in Autostrada");
		int veicoli = aut.veicoli.size();
		System.out.println(veicoli);
		aut.stampaAutomobili();
		aut.stampaCamion();
		aut.stampaMoto();
		
		System.out.println("Un veicolo esce dall'autostrada");
		aut.esciDaAutostrada(a);
		
		System.out.println("Restainti veicoli in autostrada");
		veicoli = aut.veicoli.size();
		System.out.println(veicoli);
		aut.stampaAutomobili();
		aut.stampaCamion();
		aut.stampaMoto();

	}

}
