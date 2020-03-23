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
 * Servlet implementation class SignIn
 */
@WebServlet(name="signin", urlPatterns = { "/signin"})
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Utente> utentiRegistrati;
       

    public SignIn() {
        super();
    }

	@Override
	public void init() throws ServletException {
		utentiRegistrati = new ArrayList<Utente>();
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/navbar.jsp").include(request, response);
		
		request.getServletContext().getRequestDispatcher("/jsp/signin.jsp").include(request, response);
		
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		utentiRegistrati.add(new Utente(nome, cognome, email, password));
		session.setAttribute("utenti_registrati", utentiRegistrati);
		response.sendRedirect("login");
		System.out.println("registrazione effettuata");
	}

}
