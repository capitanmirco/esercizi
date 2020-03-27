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

@WebServlet("/disp_listaUtenti")
public class disp_listaUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public disp_listaUtenti() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Utente> lista = getAll();
		request.setAttribute("listaUtenti", lista);
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/navbar.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/lista.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	
	}
	
	private List<Utente> getAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneFinaleUtentiWebDB");
		EntityManager em = emf.createEntityManager();
		
		//Query q = em.createQuery("SELECT u FROM Utente u");
		Query q = em.createNamedQuery("Utente.findAll");
		return q.getResultList();
	}

}
