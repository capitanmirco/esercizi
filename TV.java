public class TV{
	
	private String marca;
	private double pollici;
	private double risoluzione;



	//uso del costruttore con parametri
	public TV(String marca, double pollici, double risoluzione) {
		
		setMarca(marca);
		setPollici(pollici);
		setRisoluzione(risoluzione);
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPollici() {
		return pollici;
	}
	public void setPollici(double pollici) {
		this.pollici = pollici;
	}
	public double getRisoluzione() {
		return risoluzione;
	}
	public void setRisoluzione(double risoluzione) {
		this.risoluzione = risoluzione;
	}



}