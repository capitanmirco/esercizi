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

@WebServlet("/disp_modificaUtente")
public class disp_modificaUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneFinaleUtentiWebDB");
	EntityManager em = emf.createEntityManager();
       
    public disp_modificaUtente() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("mod"));
		Utente u = getUtenteById(id);

		request.setAttribute("utente", u);
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/navbar.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String citta = request.getParameter("citta");
		String telefono = request.getParameter("telefono");
		
		Utente u = new Utente();
		u.setUtenteId(id);
		u.setNome(nome);
		u.setCognome(cognome);
		u.setCitta(citta);
		u.setTelefono(telefono);
		
		
		em.getTransaction().begin();
		em.merge(u);
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
