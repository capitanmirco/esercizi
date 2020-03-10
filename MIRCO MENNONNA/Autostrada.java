package it.elis.java;
import java.util.ArrayList;
public class Autostrada {
		
	    public ArrayList<Veicolo> veicoli=new ArrayList<Veicolo>();
	
		public static void main(String[] args){
			System.out.println("veicoli presenti in autostrada");
			Autostrada autostrada=new Autostrada();
			Moto a=new Moto("R1", "Yamaha", 1.2, 1, 2);
			Automobile b=new Automobile("Clio", "Renault", 1.2,5, "utilitaria");
			Camion c=new Camion("Daily","Iveco", 5.0, "rimorchio piccolo", "patente c");
			autostrada.entraInAutostrada(a);
			autostrada.entraInAutostrada(b);
			autostrada.entraInAutostrada(c);
			autostrada.stampa();
			
			
			System.out.println("veicoli che hanno lasciato l'autostrada");
			
			
			autostrada.lasciaAutostrada(a);
			autostrada.lasciaAutostrada(b);
			autostrada.stampa();
			
			
			
			
			
		}
		public void entraInAutostrada(Veicolo c) {
			veicoli.add(c);
			
		}
		public void lasciaAutostrada(Veicolo c) {
			veicoli.remove(c);
		}
		
		public void stampa() {
			for(Veicolo v:veicoli) {
				
				System.out.println(v);
				
				
				
			}
		}

}
