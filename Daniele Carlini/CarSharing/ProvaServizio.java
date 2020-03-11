package it.carsharing;

public class ProvaServizio {
	
	public static void main(String[] args) {
		
		CarSharing c = new CarSharing();
		
		c.aggiungiParcheggio("Roma");
		c.aggiungiParcheggio("Milano");
		c.aggiungiParcheggio("Frosinone");
		c.aggiungiParcheggio("Venezia");
		c.aggiungiParcheggio("Venezia");
		
		try {
			c.aggiungiAutomobile("aa000aa", "Roma");
			c.aggiungiAutomobile("aa001aa", "Roma");
			c.aggiungiAutomobile("aa002aa", "Milano");
			c.aggiungiAutomobile("aa004", "Torino");
			c.aggiungiAutomobile("aa000aa", "Frosinone");
		} catch (Exception e) {
			System.out.println("Automobile non aggiunta");
		}
		
		System.out.println("Roma");
		System.out.println(c.contaAutomobile("Roma"));
		System.out.println("Milano");
		System.out.println(c.contaAutomobile("Milano"));
		
		System.out.println("il veicolo transita da roma a milano");
		c.transito("aa001aa", "Milano");
		
		System.out.println("Roma");
		System.out.println(c.contaAutomobile("Roma"));
		System.out.println("milano");
		System.out.println(c.contaAutomobile("Milano"));
		
		try {
			System.out.println(c.statistica());
		} catch (Exception e) {
			System.out.println("Attenzione Anomalia!");
		}
		
		try {
			c.aggiungiAutomobile("bb000bb", "Frosinone");
			c.aggiungiAutomobile("bb001bb", "Frosinone");
			c.aggiungiAutomobile("bb002bb", "frosinone");
			c.aggiungiAutomobile("cc000cc", "Labico");
		} catch (Exception e) {
			System.out.println("Automobile non aggiunta");
		}
		
		try {
			System.out.println(c.statistica());
		} catch (Exception e) {
			System.out.println("Attenzione Anomalia!");
		}
		
		System.out.println("Prenota 3 veicoli su frosinone");
		c.prenotaVeicolo("frosinone");
		c.prenotaVeicolo("Frosinone");
		c.prenotaVeicolo("frosinone");
		
		System.out.println("Dispoibilita frosinone");
		System.out.println(c.disponibilitaVeicolo("Frosinone"));
		
		try {
			System.out.println(c.statistica());
		} catch (Exception e) {
			System.out.println("Attenzione Anomalia!");
		}
		
		System.out.println("frosinone");
		System.out.println(c.disponibilitaVeicolo("Frosinone"));
		System.out.println("roma");
		System.out.println(c.disponibilitaVeicolo("Roma"));
		System.out.println("milano");
		System.out.println(c.disponibilitaVeicolo("milano"));
		
		System.out.println("rimuovi veicoli con piu di 2 viaggi");
		c.rimuoviAutomobili(2);
		
		System.out.println("milano");
		System.out.println(c.disponibilitaVeicolo("milano"));
		
		System.out.println("libera 2 veicoli da frosinone");
		c.liberaVeicolo("bb000bb");
		c.liberaVeicolo("bb001bb");
		
		System.out.println("spista veicoli con 2 viaggi milano");
		c.transito("aa001aa", "Roma");
		c.transito("aa001aa", "Milano");
		c.transito("aa001aa", "venezia");
		c.transito("aa001aa", "Milano");
		c.transito("cc000cc", "Labico");
		c.transito("cc000cc", "Labico");
		c.transito("cc000cc", "Labico");
		c.transito("cc000cc", "Labico");
		
		System.out.println("rimuovi veicoli con 2 viaggi");
		c.rimuoviAutomobili(2);
		
		System.out.println("frosinone");
		System.out.println(c.contaAutomobile("Frosinone"));
		System.out.println("milano");
		System.out.println(c.contaAutomobile("Milano"));
		System.out.println("labico");
		System.out.println(c.contaAutomobile("LAbico"));
		
		
		try {
			System.out.println(c.statistica());
		} catch (Exception e) {
			System.out.println("Attenzione Anomalia!");
		}
		
	}

}

