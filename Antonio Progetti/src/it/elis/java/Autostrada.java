package it.elis.java;
import java.util.ArrayList;
import java.util.List;


public class Autostrada {

	public static void main(String[] args) {
		
		  ArrayList<Veicolo> lista = new ArrayList<Veicolo>();
		 
		 Automobile a = new Automobile("c1","Citroen",0.9,4,5);
		 Camion c = new Camion("Globetrotter","Iveco",2.0,13.5,3.4);
		 Moto m = new Moto("Hornet","Honda",1.0,"Nero",2);

	
	
	public void stampaAuto() {
		
		System.out.println(a.getMarca() + a.getNome()+ a.getCilindrata() + a.getCapienza() + a.getNumeroPorte());
	}

	public void stampaCamion() {
		
		System.out.println(c.getMarca() + c.getNome()+ c.getCilindrata() + c.getLunghezza() + c.getAltezza());
	}
	
	public void stampaMoto() {
		
		System.out.println(m.getMarca() + m.getNome()+ m.getCilindrata() + m.getColore() + m.getNumeroRuote());
	}
	
	public Veicolo entraAutostrada() {
		
		lista.add(a);
		lista.add(c);
		lista.add(m);
	}
	
	public Veicolo esciAutostrada() {
		
		lista.remove(a);
		lista.remove(c);
		lista.remove(m);
	}
	}
}
