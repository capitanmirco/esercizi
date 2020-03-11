package it.carsharing;

import java.util.ArrayList;
import java.util.List;

public class CarSharing implements VeicleSharing{

	private List<Parcheggio> parcheggi;
	private List<Automobile> automobili;
	private List<Automobile> automobiliImpegnate;
	
	public CarSharing() {
		this.parcheggi = new ArrayList<Parcheggio>();
		this.automobili = new ArrayList<Automobile>(); 
		this.automobiliImpegnate = new ArrayList<Automobile>();
	}
	
	/**
	 * @param nome indica la localita del parcheggio
	 * aggiunge un parcheggio se non esistente. se esistente restiusce un messaggio di errore
	 */
	public void aggiungiParcheggio(String nome) {
		if(!parcheggi.contains(new Parcheggio(nome))) {
			parcheggi.add(new Parcheggio(nome));
		}else {
			System.out.println("Luogo di parcheggio Esistente");
		}
	}
	
	/**
	 * @param targa targa del veicolo che si vuole aggiungere
	 * @param unNomeParcheggio localita' del veicolo che si vuole aggiungere
	 * aggiunge un'auto se non esistente ad un parcheggio aggiungendo il parcheggio se non esiste
	 * mentre se esistente assegna il parcheggio già esistente
	 * il metodo lancia un'eccezione null in caso di anomalia
	 */
	public void aggiungiAutomobile(String targa, String unNomeParcheggio) throws Exception {
		boolean esistente = false;
		for(Automobile a : automobili) {
			if (a.getTarga().equalsIgnoreCase(targa)) {
				esistente = true;
			}
		}
		Parcheggio par = null;
		for(Parcheggio p : parcheggi) {
			if(p.getNome().equalsIgnoreCase(unNomeParcheggio)){
				par = p;
			}
		}
		if(!esistente && parcheggi.contains(par)) {
			automobili.add(new Automobile(targa, 0, par));
			System.out.println("Automobile aggiunta ad un parcheggio esistente");
		}else if(!esistente && !parcheggi.contains(par)){
			automobili.add(new Automobile(targa, 0, new Parcheggio(unNomeParcheggio)));
			System.out.println("Automobile aggiunta in un nuovo parcheggio");
		}else {
			System.out.println("Automobile non aggiunta in quanto gia' esistente");
		}
		if(par == null) {
			throw new Exception();
		}
	}
	
	/**
	 * @param unaTarga inserisci la targa del veicolo
	 * @param parcheggioArrivo inserisci il parcheggio di destinazione
	 * il metodo cerca il veicolo con la targa indicata e, se esistente sposta il veicolo 
	 * nel parcheggio di destinazione indicato aumentando di 1 il numero dei viaggi
	 * dell'automobile
	 */
	public void transito(String unaTarga, String parcheggioArrivo) {
		for(Automobile a : automobili) {
			if(a.getTarga().equalsIgnoreCase(unaTarga)) {
				for(Parcheggio p : parcheggi) {
					if(p.getNome().equalsIgnoreCase(parcheggioArrivo)) {
						if(!p.getNome().equalsIgnoreCase(a.getLocazione().getNome())) {
							a.setViaggi(a.getViaggi()+1);
							a.setLocazione(p);
							System.out.println("Veicolo spostato correttamente!");
						}else {
							System.out.println("Il veicolo e' gia' in quel posto");
						}
					}
				}
			}
		}
	}
		
	/**
	 * @param unNomeParcheggio passa in ingresso il nome del parcheggio
	 * @return restituisce il numero di automobili di un determinato parcheggio indicato
	 */
	public int contaAutomobile(String unNomeParcheggio) {
		int count = 0;
		for(Automobile a : automobili) {
			if(a.getLocazione().getNome().equalsIgnoreCase(unNomeParcheggio)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * @param unNumeroViaggi inserisci il numero di viaggi delle macchine che vuoi cancellare
	 * il metodo cancella uno o piu' veicoli che hanno il numero di viaggi indicati o superiori
	 */
	public void rimuoviAutomobili(int unNumeroViaggi) {
		for(int i=0;i<automobili.size();i++) {
			if(automobili.get(i).getViaggi() == unNumeroViaggi || automobili.get(i).getViaggi() > unNumeroViaggi) {
				automobili.remove(i);
			}
		}
		System.out.println("Auto rimosse correttamente!");
	}

	/**
	 * @return il nome del parcheggio con il numero di veicoli maggiori
	 * @throws Exception se la variabile per il parcheggio è null potrebbe generarsi un eccezzione
	 * per esempio se non ci sono parcheggi e/o automobili e il metodo viene chiamato
	 */
	public String statistica() throws Exception{
		Parcheggio park = null;
		int count = 0;
		for(Parcheggio p : parcheggi) {
			if(contaAutomobile(p.getNome())>count) {
				park = p;
				count = contaAutomobile(p.getNome());
			}
		}
		if(park == null) {
			throw new Exception();
		}
		
		return "Il maggior numero di veicoli e' situato nel parcheggio: " + park.getNome();
	}

	
	/**
	 * @param locazione indica il parcheggio da dove bloccare la macchiana
	 * l'automobile bloccata viene trasferita in un array temporaneo in attesa di rilascio
	 */
	@Override
	public void prenotaVeicolo(String locazione) {
		for(int i=0;i<automobili.size();i++) {
			if(automobili.get(i).getLocazione().getNome().equalsIgnoreCase(locazione)) {
				Automobile temp = automobili.get(i);
				automobili.remove(temp);
				automobiliImpegnate.add(temp);
				System.out.println("Veicolo impegnato correttamente");
			}
		}
	}
	
	/**
	 * @param locazione passa in ingresso il nome del parcheggio
	 * il metodo restituisce true se almeno 1 veicolo e' presente false se invece non ci sono
	 * automobili disponibili
	 */

	@Override
	public boolean disponibilitaVeicolo(String locazione) {
		boolean disponibile = false;
		for(Automobile a : automobili) {
			if(a.getLocazione().getNome().equalsIgnoreCase(locazione)) {
				disponibile = true;
				break;
			}
		}
		return disponibile;
	}
	
	/**
	 * @param passa in ingresso una targa di un veicolo
	 * il metodo controlla se il veicolo era impegnato, se era impegnato restituisce un messaggio 
	 * di corretto rilascio e lo rimette nel parcheggio
	 */
	@Override
	public void liberaVeicolo(String unaTarga) {
		for(int i=0;i<automobiliImpegnate.size();i++) {
			if(automobiliImpegnate.get(i).getTarga().equalsIgnoreCase(unaTarga)) {
				Automobile temp = automobiliImpegnate.get(i);
				automobiliImpegnate.remove(temp);
				automobili.add(temp);
				System.out.println("Veicolo e' stato liberato correttamente");
			}
		}
	}
	
}
