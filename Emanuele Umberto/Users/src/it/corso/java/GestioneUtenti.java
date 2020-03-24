package it.corso.java;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gestioneutenti")
public class GestioneUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Database db;
       
    public GestioneUtenti() {
        super();
    }

	@Override
	public void init() throws ServletException {

		try {
			db = new Database();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Utente u = new Utente(0, "Mario", "Rossi", "mariorossi@gmail.com", "12345");
		
		try {
			db.insertUser(u);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}

}
