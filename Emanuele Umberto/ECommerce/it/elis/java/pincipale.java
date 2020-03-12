package it.elis.java;

public class pincipale {

	public static void main(String[] args) {
		
		Ecommerce amazon = new Ecommerce("Amazon");
		/*Prodotto iphone = new Prodotto("Iphone", 800);
		Prodotto mascherine = new Prodotto("Fp3", 1.5);
		Prodotto amuchina = new Prodotto("Amuchina", 3.9);*/
		
		amazon.addProdotto(new Prodotto("Iphone", 800));
		amazon.addProdotto(new Prodotto("Fp3", 1.5));
		amazon.addProdotto(new Prodotto("Amuchina", 3.9));
		
		Utente rossi = new Utente("Mario Rossi", 100, 39);
		//Carrello carr = new Carrello(rossi);
		//amazon.addCarrello(carr);
		
	}

}
