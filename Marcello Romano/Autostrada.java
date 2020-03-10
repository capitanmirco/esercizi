package it.elis.java;

import java.util.List;
import java.util.ArrayList;



public class Autostrada {
	
	
	
	List<Veicolo> ve= new ArrayList<Veicolo>();
	
	
	public void entra(Veicolo vo) {
		ve.add(vo);
		
	
	}
	
	
	
	public void esci (Veicolo vo) {
		
		int veicolo = ve.indexOf(vo);
		ve.remove(veicolo);
		
	}
	
	
	
	public void stampaM() {
		
		for ( Veicolo vo : ve ) {
			
			if(vo.getClass() == Moto.class) {
				System.out.println(vo.info());
			}
		}
	}
	
public void stampaC() {
		
		for ( Veicolo vo : ve ) {
			
			if(vo.getClass() == Camion.class) {
				System.out.println(vo.info());
			}
		}
	}



public void stampaA() {
	
	for ( Veicolo vo : ve ) {
		
		if(vo.getClass() == Automobile.class) {
			System.out.println(vo.info());
		}
	}
}

	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
		Automobile a = new Automobile("Panda","Fiat",1.2,4,"12568548");
		Moto m = new Moto ("Horent","honda",1.0,1,"frtgu");
		Camion c = new Camion ("f150","scania",2.8,2,12);
		
		Autostrada au = new Autostrada();
		
		au.entra(a);
		au.entra(m);
		au.entra(c);
		
		
		System.out.println("veicoli presnti");
		int ve = au.ve.size();
		System.out.println(ve);
		au.stampaA();
		au.stampaC();
		au.stampaM();
		
		System.out.println("veicolo uscito");
		au.esci(a);
		
		System.out.println("veicoli restanti");
		int vi = au.ve.size();
		System.out.println(ve);
		au.stampaA();
		au.stampaC();
		au.stampaM();
		
	
		
	}
}
