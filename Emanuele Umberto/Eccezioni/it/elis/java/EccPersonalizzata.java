package it.elis.java;

public class EccPersonalizzata extends RuntimeException {
	
	public EccPersonalizzata() {
		super("Eccezzione Personalizzata");
	}
	
	public void metodoPersonalizzato() {
		System.out.println("abcabcabcabcbac");
	}

}
