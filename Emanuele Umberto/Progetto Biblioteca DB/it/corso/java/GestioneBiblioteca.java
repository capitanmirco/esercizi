package it.corso.java;

import java.sql.SQLException;
import java.util.ArrayList;

public class GestioneBiblioteca {

	public static void main(String[] args) {
		
		try {
			Database db = new Database();
			
			Biblioteca b = db.leggiBiblioteca(1);
			b.setListaIscritti();
			b.setListaLibri();
			
			b.stampaIscritti();
			
			System.out.println("--------");
			
			b.stampaLibri();
			
			//db.insertBiblioteca(b);
			
			//Utente u = new Utente("Mario Rossi", 42, false);
			Utente u = new Utente("Antonio Bianchi", 24, true);
			//db.insertUtente(u, "Biblioteca Elis");
			
			//Libro l = new Libro("Java8", 743, "Matteo Aiello", 12345);
			Libro l = new Libro("Generation11", 1, "Giusy Marasco", 11111);
			//db.insertLibro(l, "Biblioteca Elis");
			
			//System.out.println(db.leggiIdBiblioteca("Biblioteca Elis"));
			
			/*ArrayList<Libro> listaLibri = db.leggiLibri(b.getNome());
			for (Libro libro : listaLibri) {
				System.out.println(libro.info());
			}*/
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
