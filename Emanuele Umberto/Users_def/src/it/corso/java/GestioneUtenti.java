package it.corso.java;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gestioneutenti")
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
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			if(!db.controllaEmail(email)) {
				db.inserisciUtente(nome, cognome, email, password);
				response.sendRedirect("listautenti");
			}
			
		} catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("Email duplicata");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
