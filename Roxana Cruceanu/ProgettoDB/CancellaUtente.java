package model;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "cancellautente", urlPatterns = { "/cancellautente" })
public class CancellaUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProgettoDB");
	EntityManager em = emf.createEntityManager();

	public CancellaUtente() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("delete"));
		Utente u = getUtenteById(id);
		removeUtente(u);
		response.sendRedirect("listautenti");

	}

	private Utente getUtenteById(int id) {

		em.getTransaction().begin();
		Utente u = em.find(Utente.class, id);
		em.getTransaction().commit();
		System.out.println("Utente letto dal database");
		return u;
	}

	private void removeUtente(Utente u) {

		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("Utente cancellato dal database");
	}

}
