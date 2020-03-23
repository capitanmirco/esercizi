package it.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet(name = "login", urlPatterns = { "/login"})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Utente> utentiRegistrati;
       

    public Login() {
        super();
    }
    
    
    //metodo che viene invocato quando viene generata la servlet. utilizzando questo metodo 
    //quando viene istanziato sul servlet container la servlet in automatico verra richiamato il metodo
    //init e verranno effettuate tutte le operazioni dette nell'init()
    @Override
	public void init() throws ServletException {
    	utentiRegistrati = new ArrayList<Utente>();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/navbar.jsp").include(request,response);
		request.getServletContext().getRequestDispatcher("/jsp/login.jsp").include(request, response);
		
		if(request.getParameter("signin") != null && request.getParameter("signin").equals("true")) {
			response.sendRedirect("signin");
			System.out.println("vai al signin");
		}	
				
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		HttpSession session = request.getSession();
		utentiRegistrati = (ArrayList<Utente>) session.getAttribute("utenti_registrati");
		if(utentiRegistrati != null && utentiRegistrati.size() > 0) {
			System.out.println("utenti registrati: " + utentiRegistrati.size());
			for(Utente utente : utentiRegistrati) {
				if(utente.getEmail().equals(email) && utente.getPassword().equals(password)) {
					//request.setAttribute("utente_loggato", utente);
					session.setAttribute("utente_loggato", utente);
					System.out.println("Login effettuato");
					response.sendRedirect("todolist");	
				}else {
					//chiamata al doget perchè se non si logga presenta quello che è contenuto nel doGet
					System.out.println("credenziali errate");
					doGet(request, response);
				}
			}
		}else {
			doGet(request, response);
		}
	}


}
