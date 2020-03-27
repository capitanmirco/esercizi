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

@WebServlet("/cancellautenti")
public class CancellaUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneFinaleUtentiWebDB");
	EntityManager em = emf.createEntityManager();
       
    public CancellaUtenti() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("del"));
		Utente u = getUtenteById(id);
		
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		response.sendRedirect("disp_listaUtenti");
	}
	
	private Utente getUtenteById(int id) {
		em.getTransaction().begin();
		Utente u = em.find(Utente.class, id);
		em.getTransaction().commit();
		return u;
	}

}
