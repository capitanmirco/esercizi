package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class GestioneUtente
 */
@WebServlet("/gestione")
public class GestioneUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public GestioneUtente() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);		
		request.getServletContext().getRequestDispatcher("/jsp/form.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		String method=request.getParameter("add")!=null ? request.getParameter("add"):" ";
		// /gestione?method=add
		//if(method.equals("add")){
		String nome=request.getParameter("nome");
		String cognome=request.getParameter("cognome");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
			utenti u=new utenti();
			if(nome!=null&&cognome!=null&&email!=null&&password!=null) {
			u.setNome(nome);
			u.setCognome(cognome);
			u.setEmail(email);
			u.setPassword(password);
			addUtente(u);
			}
			
		//}
		//gestione?method=get&id=valore
		/*if(method.equals("get")) {
			int id=Integer.parseInt(request.getParameter("id"));
			utenti u=getUtente(id);
		}
		
		//gestione?method=update&id=valore
		if(method.equals("update")) {
			int id=Integer.parseInt(request.getParameter("id"));
			utenti u=getUtente(id);
			u.setEmail("email.modificata@abc.com");
			updateUtente(u);
			
		}
		//gestione?method=delete&id=valore
		if(method.equals("delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
			utenti u=getUtente(id);
			updateUtente(u);
			removeUtente(u);
			
		}
		
		/*if(method.equals("getAll")) {
			List<utenti> utenti=getUtenteall();
			for (utenti u : utenti) {
				System.out.println("Ciao "+u.getNome()+" "+u.getCognome());
			}
		}*/


	}
	/*private void removeUtente(utenti u) {
		em.getTransaction().begin();
		em.getTransaction();
		em.remove(u);//DELETE FROM utenti WHERE utenti=u.getutenteig()
		em.getTransaction().commit();
		System.out.println("Utente cancellato");
	}*/


	private void addUtente(utenti u) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("GestioneUtentiiDB");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.getTransaction();
		em.persist(u);//SELECT * INTO utenti(...) VALUES(u.getNome(),u.getCognome(),u.getEmail(),u.getPassword())
		em.getTransaction().commit();
		System.out.println("Utente aggiunto");
		
	}
	/*private utenti getUtente(int id)
	{
		em.getTransaction().begin();
		utenti u=em.find(utenti.class, id);//SELECT * FROM utenti WHERE utenti_id=id;
		em.getTransaction().commit();
		System.out.println("Ciao"+" "+u.getNome()+" "+u.getCognome());
		return u;
		
	}
	private void updateUtente(utenti u) {
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("Ciao utente modificato");
	}*/
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
