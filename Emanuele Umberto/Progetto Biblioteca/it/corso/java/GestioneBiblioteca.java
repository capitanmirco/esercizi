package it.corso.java;

import java.sql.SQLException;

public class GestioneBiblioteca {

	public static void main(String[] args) {
		
		try {
			Database db = new Database();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
