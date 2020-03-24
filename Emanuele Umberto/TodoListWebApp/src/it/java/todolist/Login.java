package it.java.todolist;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private Utente utente;
	private ArrayList<Utente> listaUtenti;
       
    public Login() {
        super();
    }

	@Override
	public void init() throws ServletException {
		//utente = new Utente("Mario", "Rossi", "mariorossi@gmail.com", "12345");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/login.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		this.listaUtenti = 
				session.getAttribute("listaUtenti") != null ? (ArrayList<Utente>) session.getAttribute("listaUtenti") : new ArrayList<Utente>();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		for (Utente utente : listaUtenti) {
			if(utente.getEmail().equals(email) && utente.getPassword().equals(password)) {
				//request.setAttribute("utente_loggato", utente);
				
				session.setAttribute("utente_loggato", utente);
				response.sendRedirect("todolist");
				System.out.println("login");
			}
		}
		
		System.out.println("Errore");
		doGet(request, response);
		
		
	}

}
