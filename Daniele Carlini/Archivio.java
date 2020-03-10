package it.elis.java;

import java.util.ArrayList;
import java.util.List;

public class Archivio {
	
	List<Cliente> clienti = new ArrayList<Cliente>();
	List<Automobile> automobili = new ArrayList<Automobile>();
	
	
	/**
	 * @param unNome nominativo del cliente
	 * crea un nuovo cliente con nominativo unNome
	 */
	public boolean addCliente(String unNome) {
		boolean aggiunto = false;
		boolean contains = false;
		for(int i=0;i<clienti.size();i++) {
			if(clienti.get(i).getNominativo().equalsIgnoreCase(unNome)) {
				contains = true;
			}
		}
		if(!contains) {
			clienti.add(new Cliente(unNome));
			aggiunto = true;
		}
		return aggiunto;
	}
	
	/**
	 * @param unaTarga targa automobile
	 * @param unNome nome del cliente proprietario dell'automobile
	 * aggiunge un automobile con il nominativo di un cliente gia' creato (se cliente esistente)
	 * aggiunge un automobile e crea un nuovo cliente se il cliente non esiste gia'
	 */
	public boolean addAutomobile(String unaTarga, String unNome) {
		boolean contains = false;
		int indice = 0;
		for(int i=0;i<clienti.size();i++) {
			if(clienti.get(i).getNominativo().equalsIgnoreCase(unNome)) {
				contains = true;
				indice = i;
			}
		}
		
		if(contains) {
			automobili.add(new Automobile(unaTarga,clienti.get(indice)));
		}else {
			addCliente(unNome);
			automobili.add(new Automobile(unaTarga,clienti.get(clienti.size()-1)));
		}
		
		return true;
	}
	
	
	/**
	 * @param unaTarga targa di un automobile
	 * il metodo cancella un automobile di cui viene passata in ingresso una targa
	 */
	public boolean removeAutomobile(String unaTarga) {
		for(int i=0;i<automobili.size();i++) {
			if(automobili.get(i).getTarga().equalsIgnoreCase(unaTarga)) {
				automobili.remove(i);
			}
		}
		return true;
	}
	
	/**
	 * @param unaTarga passa in ingresso una targa di un automobile
	 * @return ritorna il nome del cliente proprietario del veicolo
	 */
	public String clienteTarga(String unaTarga) {
		String cliente = "";
		for(int i=0;i<automobili.size();i++) {
			if(automobili.get(i).getTarga().equalsIgnoreCase(unaTarga)) {
				cliente = automobili.get(i).getCliente().getNominativo();
			}
		}
		return "Il Proprietario di questo veicolo e': " + cliente;
	}
	
	/**
	 * @param unNome passa in ingresso una stringa che rappresenta il nime del proprietario del veicolo
	 * @return restituisce una List contenente tutti i veicoli in possesso del nome inserito
	 */
	public List<String> returnTarga(String unNome) {
		List<String> veicoli = new ArrayList<String>();
		for(int i=0; i<automobili.size();i++) {
			if(automobili.get(i).getCliente().getNominativo().equalsIgnoreCase(unNome)) {
				veicoli.add(automobili.get(i).getTarga());
			}
		}
		return veicoli;
	}
	
	/**
	 * @param unNome passa in ingresso il nome del cliente
	 * @return restituisce il numero di veicoli in possesso del determinato cliente
	 */
	public int contaAuto(String unNome) {
		int numero = 0;
		for(int i=0; i<automobili.size();i++) {
			if(automobili.get(i).getCliente().getNominativo().equalsIgnoreCase(unNome)) {
				numero++;
			}
		}
		return numero;
	}
	
	/**
	 * @param unNome passa in ingresso il nome di un cliente
	 * il metodo cancella tutti i veicoli in possesso del cliente
	 * il metodo cancella anche il cliente
	 */
	public boolean removeCliente(String unNome) {
		List<String> vetture = returnTarga(unNome);
		for(String s : vetture) {
			removeAutomobile(s);
		}
		if(vetture.size() == 0) {
			for(int i=0;i<clienti.size();i++) {
				if(clienti.get(i).getNominativo().equalsIgnoreCase(unNome)) {
					clienti.remove(i);
				}
			}
		}
		return true;
	}
	
	
	/**
	 * @return restituisce il cliente con il numerativo di veicoli maggiori
	 */
	public String maxAuto() {
		String cliente = "";
		int numero = 0;
		for(Cliente c : clienti) {
			if(contaAuto(c.getNominativo())>numero) {
				numero = contaAuto(c.getNominativo());
				cliente = c.getNominativo();
			}
		}
		return "Il maggior numero di veicoli e' posseduto da: " + cliente + " con: " + numero + " veicoli.";
	}

}
