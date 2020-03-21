package it.classi;

import java.util.ArrayList;

public class Lista {
	
	private ArrayList<String> lista;
	
	public Lista() {
		lista = new ArrayList<String>();
	}
	
	public void addLista(String s) {
		this.lista.add(s);
	}
	
	public ArrayList<String> getLista(){
		return this.lista;
	}
	
	public String info() {
		String info = "";
		for(String s : this.lista) {
			info += s + "/n";
		}
		return info;
	}

}
