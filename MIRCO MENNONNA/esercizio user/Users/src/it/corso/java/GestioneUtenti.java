package it.corso.java;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/GestioneUtenti")
public class GestioneUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Database db;
	private ArrayList<Utente> listaUtenti;

	public GestioneUtenti() {
	}

	public void init() throws ServletException {
		try {
			db = new Database();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		listaUtenti = new ArrayList<Utente>();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getParameter("method") != null) {
			try {
				db.eliminaUtente(request.getParameter("id"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("utente eliminato");
			request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/menu.jsp").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/view.jsp").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		}

		else {
			Utente u = new Utente(0, request.getParameter("nome"), request.getParameter("cognome"), request.getParameter("email"), request.getParameter("password"));
			listaUtenti.add(u);

			try {
				db.insertUser(u);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Utente Registrato");
			request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/menu.jsp").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/view.jsp").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}