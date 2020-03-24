package it.todo.java;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/RegistraUtente")
public class RegistraUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private ArrayList<Utente> listaUtenti;

	public RegistraUtente() {
		super();
	


	}
	public void init() throws ServletException {
		listaUtenti = new ArrayList<Utente>();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    HttpSession session = request.getSession();

		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/registrautente.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
         request.getSession().setAttribute("listaUsers", listaUtenti);
		     if (!request.getParameter("nome").equals("") 
				&& !request.getParameter("cognome").equals("")
				&& !request.getParameter("email").equals("")
				&& !request.getParameter("password").equals("")) {

			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			Utente u = new Utente(nome, cognome, email, password);
			listaUtenti.add(u);
			session.setAttribute("listaUsers",listaUtenti);
			//request.setAttribute( "listaUsers",listaUtenti);
			response.sendRedirect("login");
		}else {
			System.out.println("USER UNKNOW");




		}
	}
}
