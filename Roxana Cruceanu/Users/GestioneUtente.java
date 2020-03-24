package it.corso.java;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.corso.java.Utente;

@WebServlet(name = "gestioneutente", urlPatterns = { "/gestioneutente" })
public class GestioneUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Database db;

	public GestioneUtente() throws SQLException {
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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			session.setAttribute("listaUtenti", db.vediTabella());
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/menu.jsp").include(request, response);

		if (request.getQueryString() != null && request.getParameter("id").equals("r")) {
			request.getServletContext().getRequestDispatcher("/jsp/registraUtente.jsp").include(request, response);
		}

		else if (request.getQueryString() != null && request.getParameter("id").equals("l")) {
			try {
				request.setAttribute("listaUtenti", db.vediTabella());
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			request.getServletContext().getRequestDispatcher("/jsp/visualizzaDati.jsp").include(request, response);
		}

		else if (request.getQueryString() != null && request.getParameter("method").equals("delete")) {
			try {
				for (Utente u : db.vediTabella()) {
					if (request.getParameter("id").equals(u.getEmail())) {
						try {
							db.deleteUtente(request.getParameter("id"));
							request.setAttribute("listaUtenti", db.vediTabella());
							request.getServletContext().getRequestDispatcher("/jsp/visualizzaDati.jsp").include(request,
									response);
						} catch (SQLException e) {

							e.printStackTrace();
						}
					}
				}
			} catch (SQLException | ServletException | IOException e) {
				
				e.printStackTrace();
			}
		}

		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Utente u = new Utente(Integer.parseInt(request.getParameter("n")), request.getParameter("nome"),
				request.getParameter("cognome"), request.getParameter("email"), request.getParameter("password"));
		try {
			db.insertUser(u);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);

	}

}