package Model;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.RollbackException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gestione")
public class GestioneCRUD extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA2"); // deve essere lo stesso che ho scritto sul persistance.xml
	EntityManager em = emf.createEntityManager();
  
    public GestioneCRUD() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
    	
//    	gestione?method=get&id=valore
    		if(request.getParameter("method")!= null && request.getParameter("method").equals("get")) 
    		{	
    			Utente u = getUtenteById(Integer.parseInt(request.getParameter("id")));
    			System.out.println(u.toString());
    			request.getServletContext().getNamedDispatcher("disp").forward(request, response);
    		}
    		
    		//	gestione?method=delete&id=valore
    		if(request.getParameter("method")!= null && request.getParameter("method").equals("delete")) 
    		{	
    			Utente u = getUtenteById(Integer.parseInt(request.getParameter("id")));
    			System.out.println(request.getParameter("id"));
    			deleteUtente(u);
    			request.getServletContext().getNamedDispatcher("disp").forward(request, response);
    		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//	gestione?method=add
		if(request.getParameter("method")!= null && request.getParameter("method").equals("add")) 
		{
			Utente u = new Utente();
			u.setNome(request.getParameter("nome"));
			u.setCognome(request.getParameter("cognome"));
			u.setPassword(request.getParameter("password"));
			u.setEmail(request.getParameter("email"));
			addUtente(u);
			//request.getServletContext().getNamedDispatcher("disp").forward(request, response);
			response.sendRedirect("disp?pagina=vis");
		}
		
		
		//	gestione?method=getAll
		if(request.getParameter("method")!= null && request.getParameter("method").equals("getAll")) 
		{
			List<Utente> utenti = getUtenteAll();
			for (Utente u : utenti)
			{
				System.out.println("Ciao " + u.getNome() + " "  + u.getCognome());
			}
		}
		
		//	gestione?method=update&id=valore
		if(request.getParameter("method")!= null && request.getParameter("method").equals("update")) 
		{
			
			Utente u = getUtenteById(Integer.parseInt(request.getParameter("id")));
			if(request.getParameter("email") != "")
			{
				u.setEmail(request.getParameter("email"));
			}
			if(request.getParameter("nome") != "")
			{
				u.setNome(request.getParameter("nome"));
			}
			if(request.getParameter("cognome") != "")
			{
				u.setCognome(request.getParameter("cognome"));
			}
			if(request.getParameter("password") != "")
			{
				u.setPassword(request.getParameter("password"));
			}
			response.sendRedirect("disp?pagina=vis");
		}
	}

	public void addUtente(Utente u)
	{
		em.getTransaction().begin();
		em.persist(u);	//sarebbe l'insert into
		em.getTransaction().commit();
		System.out.println("utente aggiunto");
	}
	
	public Utente getUtenteById(int id)
	{
		em.getTransaction().begin();
		Utente u = em.find(Utente.class, id); // select * from utente where utente_id=id
		em.getTransaction().commit();
		System.out.println("utente letto");
		
		return u;
	}
	
	public void deleteUtente(Utente u)
	{
		em.getTransaction().begin();
		em.remove(u);
		em.getTransaction().commit();
		System.out.println("utente cancellato");
	}
	
	public void updateUtente(Utente u)
	{
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		System.out.println("utente modificato");
	}
	
	public List<Utente> getUtenteAll()
	{
		//Query q = em.createQuery("select u from utenti u");
		Query q = em.createNamedQuery("Utente.findAll");
		return q.getResultList();
	}

}
