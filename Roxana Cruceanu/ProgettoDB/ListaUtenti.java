package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "listautenti", urlPatterns = { "/listautenti" })
public class ListaUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaUtenti() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/menu.jsp").include(request, response);

		List<Utente> utenti = getUtenteAll();
		request.setAttribute("lista", utenti);

		request.getServletContext().getRequestDispatcher("/jsp/visualizzaDati.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);

	}

	private List<Utente> getUtenteAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProgettoDB");
		EntityManager em = emf.createEntityManager();
		Query q = em.createNamedQuery("Utente.findAll");
		return q.getResultList();

	}

}
