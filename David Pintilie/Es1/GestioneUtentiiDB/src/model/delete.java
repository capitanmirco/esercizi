package model;

import java.io.IOException;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class delete
 */
@WebServlet("/d")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public delete() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("delete"));
		List<utenti> utenti=getUtenteall();
		utenti u=new utenti();
		for (utenti utente : utenti) {
			if(utente.getUtenteId()==id)
			{
				u=utente;
				//break;
			}
		}
		removeUtente(u);
		response.sendRedirect("display");
	}
	private void removeUtente(utenti u) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("GestioneUtentiiDB");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.getTransaction();
		if (!em.contains(u)) {
		    u = em.merge(u);
		}
		em.remove(u);//DELETE FROM utenti WHERE utenti=u.getutenteig()
		em.getTransaction().commit();
		System.out.println("Utente cancellato");
	}
	 private List<utenti> getUtenteall(){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("GestioneUtentiiDB");
		EntityManager em=emf.createEntityManager();
		//Query q=(Query) em.createQuery("SELECT u FROM utenti u");
		Query q= em.createQuery("SELECT u FROM utenti u");
		return q.getResultList();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
