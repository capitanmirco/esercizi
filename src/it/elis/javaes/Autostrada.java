package it.elis.javaes;

import java.util.ArrayList;

public class Autostrada {
	static ArrayList<Veicolo> listaVeicoli=new ArrayList<Veicolo>();
	

	public static void main(String[] args) {
		
		Autostrada autostrada=new Autostrada();
		Moto m=new Moto("Hornet","Honda",1.0,1,"strada");
		Automobile a=new Automobile("Panda","Fiat",1.2,5,"utilitaria");
		Camion c=new Camion("boh","boh",3.0,"si",8);
		autostrada.EntraInAutostrada(m);
		autostrada.EntraInAutostrada(a);
		autostrada.StampaVeicoli();
		
		
				
	}
	public void EntraInAutostrada(Veicolo v) {
		listaVeicoli.add(v);
		
	}
	public void EsciDaAutostrada(Veicolo v) {
		listaVeicoli.remove(v);
	}
	public void StampaVeicoli() {
		for(int i=0;i<listaVeicoli.size();i++) {
			System.out.println(listaVeicoli.get(i).toString());
		}
	}
	

}
