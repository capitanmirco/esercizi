package it.todo.java;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Dispatcher
 */
@WebServlet("/login")
public class LogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Utente utente;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogIn() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() throws ServletException {
		//utente = new Utente ("mario","rossi","mrossi@gmail.com","12345");


	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);	

		request.getServletContext().getRequestDispatcher("/jsp/login.jsp").include(request, response);

		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		@SuppressWarnings("unchecked")
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		ArrayList<Utente> listaUtenti = (ArrayList<Utente>) session.getAttribute("listaUsers");
		request.getAttribute("listaUsers");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		for(Utente utente : listaUtenti) {
			if(utente.getEmail().equals(email) && utente.getPassword().equals(password)) {

				//do smthg
				//request.setAttribute("utente_loggato", utente);<!--memorizzo in un ogetto rquest!!
				
				session.setAttribute("utente_loggato", utente); // o creo una sessione.!!-->
				//poi devo inoltrare l'utente sulla pagina todolist
				response.sendRedirect("todolist");
				System.out.println("login");
			}else {
				System.out.println("errore");
				doGet(request,response);
			}
		}
	}

}
