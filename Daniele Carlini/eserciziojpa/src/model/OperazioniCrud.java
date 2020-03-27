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


/**
 * Servlet implementation class OperazioniCrud
 */
@WebServlet(name="operazionicrud", urlPatterns = {"/operazionicrud"})
public class OperazioniCrud extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("eserciziojpa");
	EntityManager em = emf.createEntityManager();

    public OperazioniCrud() {
        super();

    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get all
		if(request.getParameter("crud") != null && request.getParameter("crud").equals("get")) {
			List<User> lista = getAllUser();
			request.setAttribute("lista", lista);
			request.getServletContext().getNamedDispatcher("visualizzalista").forward(request, response);
		} 
		if(request.getParameter("call") != null && request.getParameter("call").equals("mod")) {
			User u = getUser(Integer.parseInt(request.getParameter("id")));
			request.setAttribute("utente", u);
			request.getServletContext().getNamedDispatcher("modificautente").forward(request, response);
		}
		
		//delete dal DB
		if(request.getParameter("crud") != null && request.getParameter("crud").equals("delete")) {
			User u = getUser(Integer.parseInt(request.getParameter("id")));
			removeUser(u);
			response.sendRedirect("/eserciziojpa/operazionicrud?crud=get");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//add in database
		if(request.getParameter("crud") != null && request.getParameter("crud").equals("add")) {
			User u = new User();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			u.setNome(request.getParameter("nome"));
			u.setCognome(request.getParameter("cognome"));
			if(isUserExist(u)) {
				request.getSession().setAttribute("error", u.getEmail());
			}else {
				request.getSession().removeAttribute("error");
				this.addUser(u);
			}
			response.sendRedirect("gestionegrafica");
		}
		
		//modifica dati dal DB
		if(request.getParameter("crud") != null && request.getParameter("crud").equals("mod")) {
			User u = getUser(Integer.parseInt(request.getParameter("id")));
			if(request.getParameter("nome") != null && !request.getParameter("nome").trim().equals("")) {
				u.setNome(request.getParameter("nome"));
			}else if(request.getParameter("cognome") != null && !request.getParameter("cognome").trim().equals("")){
				u.setCognome(request.getParameter("cognome"));
			}else if(request.getParameter("email") != null && !request.getParameter("email").trim().equals("")){
				u.setEmail(request.getParameter("email"));
			}
			
			updateUser(u);

			response.sendRedirect("/eserciziojpa/operazionicrud?crud=get");
		}
		
		
		
	}
	
	/*metodi per il database*/
	
	/**
	 * Aggiunge un utente passato al DB
	 * @param u
	 */
	public void addUser(User u){
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
			System.out.println("User added");
	}

	//controllo esistenza utente
	public boolean isUserExist(User u) {
		boolean exist = false;
		List<User> lista = getAllUser();
		for(User user : lista) {
			if(user.getEmail().equals(u.getEmail())) {
				exist = true;
				break;
			}
		}
		return exist;
	}
	
	/**
	 * 
	 * @param utente_id
	 * @return un utente con l'id specificato
	 */
	public User getUser(int utente_id) {
		em.getTransaction().begin();
		User u = em.find(User.class, utente_id);
		em.getTransaction().commit();
		System.out.println(u.getCognome());
		return u;
		
	}
	
	/**
	 * Rimuove un utente dal Database in base all'id
	 * @param u
	 */
	public void removeUser(User u) {
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("User Removed");
	}
	
	/**
	 * 
	 * @return una List di tutte gli User
	 */
	public List<User> getAllUser(){
		em.getTransaction();
		Query q = em.createNamedQuery("User.findAll");
		System.out.println("Utenti caricati");
		return q.getResultList();
	}
	
	/**
	 * aggiorna dati utente
	 * @param u
	 */
	public void updateUser(User u) {
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("utente aggiornato"); 
	}

}
