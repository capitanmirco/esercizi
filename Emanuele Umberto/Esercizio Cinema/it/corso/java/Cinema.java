package it.corso.java;

import java.util.ArrayList;

public class Cinema {
	
	private String nomeCinema;
	private String citta;
	private ArrayList<Sala> listaSale;

	public Cinema(String nomeCinema, String citta) {
		super();
		this.nomeCinema = nomeCinema;
		this.citta = citta;
		this.listaSale = new ArrayList<Sala>();
	}

	public String getNomeCinema() {
		return nomeCinema;
	}

	public void setNomeCinema(String nomeCinema) {
		this.nomeCinema = nomeCinema;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	//Sono nella classe cinema
	public void addSala(String nomeSala, int numPostiTotali, String filmInProiezione) {
		//Sala s = new Sala(nomeSala, numPostiTotali, filmInProiezione);
		this.listaSale.add(new Sala(nomeSala, numPostiTotali, filmInProiezione));
	}
	
	public void stampaSale() {
		for (Sala sala : listaSale) {
			System.out.println(sala.infoSala());
		}
	}
	
	public void addBigliettoCinema(Utente utente, String nomeSala) {
		for (Sala sala : listaSale) {
			if(sala.getNomeSala().equals(nomeSala)) {
				sala.addBiglietto(utente);
			}
		}
	}
	
	public void stampaBiglietti(String nomeSala) {
		
		for (Sala sala : listaSale) {
			if(sala.getNomeSala().equals(nomeSala)) {
				sala.printBiglietti();
			}
		}
		
	}


	private class Sala {
		
		private String nomeSala;
		private int numPostiTotali;
		private String filmInProiezione;
		private ArrayList<Biglietto> listaBiglietti;
		
		public Sala(String nomeSala, int numPostiTotali, String filmInProiezione) {
			this.nomeSala = nomeSala;
			this.numPostiTotali = numPostiTotali;
			this.filmInProiezione = filmInProiezione;
			this.listaBiglietti = new ArrayList<Biglietto>();
		}

		public String getNomeSala() {
			return nomeSala;
		}

		public void setNomeSala(String nomeSala) {
			this.nomeSala = nomeSala;
		}

		public int getNumPostiTotali() {
			return numPostiTotali;
		}

		public void setNumPostiTotali(int numPostiTotali) {
			this.numPostiTotali = numPostiTotali;
		}

		public String getFilmInProiezione() {
			return filmInProiezione;
		}

		public void setFilmInProiezione(String filmInProiezione) {
			this.filmInProiezione = filmInProiezione;
		}

		public String infoSala() {
			return this.nomeSala + " posti n." + this.numPostiTotali + " Film: " + this.filmInProiezione; 
		}

		//Sono nella class Sala
		public void addBiglietto(Utente utente) {
			//Biglietto b = new Biglietto(utente);
			if(numPostiTotali > listaBiglietti.size()) {
				listaBiglietti.add(new Biglietto(utente));
				System.out.println("Biglietto N." + listaBiglietti.size() + " stampato a " + 
						utente.getNomeUtente() + " Sala: " + getNomeSala());
			} else {
				System.out.println("Posti sono terminati!!!");
			}
		}
		
		
		public void printBiglietti() {
			for (Biglietto biglietto : listaBiglietti) {
				System.out.println(
						"N." + listaBiglietti.indexOf(biglietto)
						+ " - " + biglietto.printInfoBiglietto()) ;
			}
		}


		private class Biglietto {
			
			private Utente utente;

			public Biglietto(Utente utente) {
				this.utente = utente;
			}
			
			public String printInfoBiglietto() {
				return utente.getNomeUtente() + " Film: " 
						+ getFilmInProiezione() + " Sala: "
						+ getNomeSala() + " Cinema: "
						+ getNomeCinema();
			}
			
		}
		
	}

}
