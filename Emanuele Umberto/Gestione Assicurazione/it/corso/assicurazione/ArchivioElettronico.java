package it.corso.assicurazione;

import java.util.ArrayList;

public class ArchivioElettronico {

	public static void main(String[] args) {
		
		/*Cliente rossi = new Cliente("Mario Rossi");
		Cliente verdi = new Cliente("Antonio Verdi");
		Cliente bianchi	= new Cliente("Giuseppe Bianchi");
		
		Automobile fiesta = new Automobile(12345, rossi);
		Automobile cinquecento = new Automobile(246810, verdi);
		Automobile smart = new Automobile(13579, bianchi);
		Automobile micra = new Automobile(123789, verdi);*/
		
		Archivio arc = new Archivio();
		
		arc.addCliente("Mario Rossi");
		arc.addCliente("Antonio Verdi");
		arc.addCliente("Giuseppe Bianchi");
		arc.addAutomobile(12345, "Mario Rossi");
		arc.addAutomobile(246810, "Antonio Verdi");
		arc.addAutomobile(13579, "Giuseppe Bianchi");
		arc.addAutomobile(123789, "Antonio Verdi");
		arc.addAutomobile(555555, "Prova Nome");
		
		System.out.println("Nome Cliente: " + arc.clienteTarga(13579));
		//ArrayList<Integer> targhe = arc.returnTarga("Antonio Verdi");
		for (Integer integer : arc.returnTarga("Antonio Verdi")) {
			System.out.println("Targa: " + integer);
		}
		
		arc.contaAuto("Antonio Verdi");
		
		Cliente c = arc.maxAuto();
		System.out.println("Cliente con maggior numero di auto: " + c.getNominativo());
		
		arc.removeAutomobile(246810);
		
		for (Integer integer : arc.returnTarga("Antonio Verdi")) {
			System.out.println("Targa: " + integer);
		}
		
		arc.removeCliente("Antonio Verdi");
		arc.addAutomobile(123789, "Antonio Verdi");

	}

}
