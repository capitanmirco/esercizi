package it.todo.java;


import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Todolist
 */
@WebServlet("/todolist")
public class Todolist extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
     private ArrayList<ToDo> lista;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Todolist() {
    	// UN OGGETTO SI ISTANZIA CON IL COSTRUTTORE 
        super();
        lista = new ArrayList<ToDo>();
    }
    

	@Override
	public void init() throws ServletException {
		// SE HO BISOGNO DI STANZIARLI DOPO CHE L'OGETTO E STATO CERATO POSSO FARLO NELL'INIT
		//vengono richiamati i costruttori quando la servlet viene caricata 
		//dopo devo usare doget dopost 
		// istruzioni
		
		
	
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          // vado a leggere la sessione    		
		HttpSession session = request.getSession();
		// vado a vedere se c'e un user loggato
		if(session.getAttribute("utente_loggato") != null) {
			//se esiste tutto ok
		System.out.println("tutto oki rozzi");
		}else {
			//sinno no 
			response.sendRedirect("login");
			System.out.println("not obj logn");
		}
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/input.jsp").include(request, response);
		request.setAttribute("listaTodo", lista);
	    request.getServletContext().getNamedDispatcher("gestione").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/lista.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
	    
		
	
	}

}
