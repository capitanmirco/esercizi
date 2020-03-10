package it.elis.java;

import java.util.ArrayList;

public class Autostrada {
	
	static ArrayList<Veicolo> listaVeicoli= new ArrayList<Veicolo>();
	
	public static void main(String[] args) {
		
		Autostrada aS = new Autostrada();
		
		Veicolo a = new Automobile("Fiat","Punto",1.2,4,5);
		Veicolo b = new Moto("ccc","ccc",0.8,2,"cccc");
		Veicolo c = new Camion("xxx","xxx",1.3,5,90);
		
		aS.entraInAutostrada(a);
		aS.entraInAutostrada(b);
		aS.entraInAutostrada(c);
		
		aS.stampaVeicoli();
		
	}
	
	public void entraInAutostrada(Veicolo v) {
		listaVeicoli.add(v);
	}
	
	public void esciDaAutostrada(Veicolo v1) {
		listaVeicoli.remove(v1);
	}
	
	public void stampaVeicoli() {
		for(Veicolo v : listaVeicoli) {
			System.out.println(v.toString());
		}
		
	}

	
}
