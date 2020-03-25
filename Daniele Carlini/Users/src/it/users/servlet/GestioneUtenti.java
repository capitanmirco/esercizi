package it.users.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.users.classi.Database;
import it.users.classi.Utente;

/**
 * Servlet implementation class GestioneUtenti
 */
@WebServlet(name = "gestioneutenti", urlPatterns = {"/gestioneutenti"})
public class GestioneUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Database db;

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
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utente u = (Utente)request.getAttribute("utente_aggiunto");
		try {
			if(!db.utenteEsistente(u.getEmail())) {
				db.insertUser(u);
				System.out.println("utente inserito");
				response.sendRedirect("visualizzadatabase");
			}else {
				System.out.println("utente non inserito");
				response.sendRedirect("registrazione");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
