package esercizio;

import java.util.ArrayList;
import java.util.List;

public class Autostrada {
	
	List<Veicolo> veicoli = new ArrayList<Veicolo>();
	

	
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
	
	public void entraInAutostrada(Veicolo v) {
		veicoli.add(v);
	}
	
	public void esciDaAutostrada(Veicolo v) {
			int veicolo = veicoli.indexOf(v);
			veicoli.remove(veicolo);
	}
	

	public static void main(String[] args) {
		
		Automobile a = new Automobile("panda", "fiat", 0, 0, null, null, true);
		Moto m = new Moto("hornet", "honda", 0, 0, null, null);
		Camion cn = new Camion(null, null, 0, null, null);
		
		Autostrada strada = new Autostrada();
		
		strada.entraInAutostrada(a);
		strada.entraInAutostrada(m);
		strada.entraInAutostrada(cn);
		
		System.out.println("Veicoli in Autostrada");
		
		int suStrada = strada.veicoli.size();
		
		System.out.println(suStrada);
		
		strada.stampaAutomobili();
		strada.stampaCamion();
		strada.stampaMoto();
		
		System.out.println("Un veicolo esce dall'autostrada");
		
		strada.esciDaAutostrada(cn);
		
		System.out.println("Veicoli restanti");
	
		suStrada = strada.veicoli.size();
		
		System.out.println(suStrada);
		
		strada.stampaAutomobili();
		strada.stampaCamion();
		strada.stampaMoto();

}
}