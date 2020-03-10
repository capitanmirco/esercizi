package garage;

import java.util.ArrayList;

public class Autostrada {
	public ArrayList<Veicolo> lista=new ArrayList<Veicolo>();
	public static void main(String[] args){
		Autostrada f=new Autostrada();
		Moto a=new Moto("nome1", "marca1", 12.4, 5, 3);
		Automobile b=new Automobile("nome2", "marca2", 13.0,2, "modello");
		Camion c=new Camion("nome3","marca3", 15, "manuale", 123.89);
		f.entraInAutostrada(a);
		f.entraInAutostrada(b);
		f.entraInAutostrada(c);
		f.stampa();
		
		System.out.println("auto ancora in autostrada...");
		System.out.println("--------------");
		f.esciDaAutostrada(b);
		f.esciDaAutostrada(c);
		f.stampa();
		
	}
	public void entraInAutostrada(Veicolo a) {
		lista.add(a);
	}
	public void esciDaAutostrada(Veicolo a) {
		lista.remove(a);
	}
	public void stampa() {
		for(Veicolo ds:lista) {
			System.out.println(ds);
			System.out.println("-----------------");
		}
	}
	
	

}
