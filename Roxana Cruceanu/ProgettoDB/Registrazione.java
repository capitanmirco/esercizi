package model;

import java.io.IOException;
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

@WebServlet(name = "registrazione", urlPatterns = { "/registrazione" })
public class Registrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProgettoDB");
	EntityManager em = emf.createEntityManager();

	public Registrazione() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/menu.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/registraUtente.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Utente u = new Utente();
		u.setNome(request.getParameter("nome"));
		u.setCognome(request.getParameter("cognome"));
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));

		List<Utente> lista = getUtenteAll();
		for (Utente utente : lista) {
			if (request.getParameter("email").equals(utente.getEmail())) {
				request.setAttribute("presente", true);
				doGet(request, response);
			}
		}
		addUtente(u);
		response.sendRedirect("disp");
	}

	private void addUtente(Utente u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		System.out.println("Utente aggiunto al DB");
	}

	private List<Utente> getUtenteAll() {

		Query q = em.createNamedQuery("Utente.findAll");
		return q.getResultList();

	}

}
