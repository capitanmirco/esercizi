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

@WebServlet("/gestione")
public class GestioneUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneUtenti");
	EntityManager em = emf.createEntityManager();

    public GestioneUtente() {
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String method = request.getParameter("method") != null ? request.getParameter("method") : "";		// così non mi dà errore quando lancio questa servlet
		
		if(method.equals("get")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Utente u = getUtenteById(id);
			System.out.println("ciao "+ u.getNome());
		}
		
		if(method.equals("update")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Utente u = getUtenteById(id);
			HttpSession sessionEdit = request.getSession();
			String newNome = (String) sessionEdit.getAttribute("newNome");
			String newCognome = (String) sessionEdit.getAttribute("newCognome");
			String newEmail = (String) sessionEdit.getAttribute("newEmail");
			String newPassword = (String) sessionEdit.getAttribute("newPassword");
			u.setNome(newNome);
			u.setCognome(newCognome);
			u.setEmail(newEmail);
			u.setPassword(newPassword);
			updateUtente(u);
			response.sendRedirect("/GestioneUtentiDB/main?id=v");
		}
			
		if(method.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			Utente u = getUtenteById(id);
			deleteUtente(u);
			response.sendRedirect("/GestioneUtentiDB/main?id=v");
		}
		
		if(method.equals("getall")) {
			List<Utente> utenti = getUtenti();
			for (Utente u : utenti) {
				System.out.println("ciao "+ u.getNome());
			}
		}
		
	}
	
	private void addUtente(Utente u) {
		em.getTransaction().begin();
		em.persist(u);										// INSERT INTO utenti (nome, cognome, email, password) VALUES (u.getNome, u.getCognome, u.getEmail. u.getPassword)
		em.getTransaction().commit();
		System.out.println("Utente aggiunto al Db");
	}
	
	private Utente getUtenteById(int id) {
		em.getTransaction().begin();
		Utente u = em.find(Utente.class, id);				// SELECT * FROM utenti WHERE utente_id = id
		em.getTransaction().commit();
		return u;
	}
	
	private void updateUtente(Utente u) {
		em.getTransaction().begin();
		em.merge(u);										// UPDATE utente SET email = u.getEmail
		em.getTransaction().commit();
		System.out.println("Utente aggiornato");
	}
	
	private void deleteUtente(Utente u) {
		em.getTransaction().begin();
		em.remove(u);										// DELETE FROM utente WHERE utente_id = u.getUtente_Id
		em.getTransaction().commit();
		System.out.println("Utente eliminato");
	}

	public List<Utente> getUtenti() {
		Query q = em.createQuery("SELECT u FROM Utente u");
		return q.getResultList();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getParameter("method") != null ? request.getParameter("method") : "";		// così non mi dà errore quando lancio questa servlet
		
		if(method.equals("add")){
			Utente u = new Utente();
			u.setNome(request.getParameter("nome"));
			u.setCognome(request.getParameter("cognome"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			addUtente(u);
			response.sendRedirect("/GestioneUtentiDB/main?id=r");
		}
		
	}
}
