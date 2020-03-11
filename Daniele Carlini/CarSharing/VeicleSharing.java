package it.carsharing;

public interface VeicleSharing {
	
	public void prenotaVeicolo(String locazione);
	public boolean disponibilitaVeicolo(String locazione);
	public void liberaVeicolo(String unaTarga);
}
