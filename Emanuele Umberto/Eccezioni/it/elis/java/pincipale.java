package it.elis.java;

public class pincipale {

	public static void main(String[] args) {
		
		String txt = "Mario Rossi";
		String txt3 = "Paolo";
		String txt2 = null;
		
		try {
			stampaLungezzaStringa(txt);
		} catch (NullPointerException e) {
			System.out.println("Testo non valido");
		} catch (EccPersonalizzata e) {
			System.out.println(e.getMessage());
			System.out.println("Testo più lungo di 10 caratteri");
		} catch (Exception e) {
			System.out.println("Eccezione Generica");
		}
		
	}
	
	public static void stampaLungezzaStringa(String testo) throws Exception{
		if(testo.length() > 10) {
			throw new EccPersonalizzata();
		} else {
			System.out.println(testo.length());
		}
	}

}
