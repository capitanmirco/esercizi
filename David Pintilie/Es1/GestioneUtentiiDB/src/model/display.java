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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class display
 */
@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("GestioneUtentiiDB");
	EntityManager em=emf.createEntityManager();
	List<utenti> utenti;
	
    public display() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("l", utenti);
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		utenti=getUtenteall();
		request.setAttribute("lista", utenti);
		request.getServletContext().getRequestDispatcher("/jsp/lista.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		//response.sendRedirect("display");
		
		
	}
	public void Search() {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private List<utenti> getUtenteall(){
		//Query q=(Query) em.createQuery("SELECT u FROM utenti u");
		Query q= em.createQuery("SELECT u FROM utenti u");
		return q.getResultList();
	}
}
