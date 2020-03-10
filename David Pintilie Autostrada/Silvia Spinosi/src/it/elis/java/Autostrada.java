package it.elis.java;
import java.util.ArrayList;

public class Autostrada {
	
	public void entraInAutostrada(Veicolo x) {
		list.add(x);
	}
	public void esciDaAutostrada(Veicolo x) {
		list.remove(x);
	}
	public void stampa() {
		for (Veicolo ve: list)
			System.out.println(ve);
	}
	
	ArrayList<Veicolo> list= new ArrayList<Veicolo>();
	

	public static void main(String[] args) {
		
		Auto a =new Auto("serie1", "bmw", 1.8 , "giallo", 13.28);
		Moto m =new Moto("hornet", "honda", 1.0, "italiana", 3);
		Camion c= new Camion("ciao", "iveco", 1.5, 1.4, 10.20 );
		Autostrada au=new Autostrada();
		
		
	
		
		au.entraInAutostrada(a);
		au.entraInAutostrada(m);
		au.entraInAutostrada(c);
		au.stampa();
		au.esciDaAutostrada(a);
		au.esciDaAutostrada(m);
		au.esciDaAutostrada(c);
		au.stampa();
		

	}

}
