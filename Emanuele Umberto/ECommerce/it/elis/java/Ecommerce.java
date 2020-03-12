package it.elis.java;

import java.util.ArrayList;

public class Ecommerce {
	
	private String nome;
	private ArrayList<Prodotto> listaProdotti;
	private Carrello carrello;
	
	public Ecommerce(String nome) {
		this.nome = nome;
		this.listaProdotti = new ArrayList<Prodotto>();
	}
	
	public void addProdotto(Prodotto p) {
		listaProdotti.add(p);
	}
	
	public void creaCarrello(Utente utente) {
		this.carrello = new Carrello(utente);
	}
	
	public void addCarrello(String nome) {
		for (Prodotto prodotto : listaProdotti) {
			if(prodotto.getNome().equals(nome)) {
				this.carrello.addCarrello(prodotto);
			}
		}
	}
	
	private class Carrello {
		
		private Utente utente;
		private ArrayList<Prodotto> listaCarrello;
		
		public Carrello(Utente utente) {
			this.utente = utente;
			this.listaCarrello = new ArrayList<Prodotto>();
		}

		public Utente getUtente() {
			return utente;
		}
		
		public void addCarrello(Prodotto p) {
			this.listaCarrello.add(p);
		}
		
	}

}
