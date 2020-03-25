package it.java.todolist;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/signup")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ArrayList<Utente> listaUtenti;
	private boolean presente = false;

	public SignUp() {
		super();
		listaUtenti = new ArrayList<Utente>();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
		/*if(presente) {
			request.getServletContext().getRequestDispatcher("/jsp/alert.jsp").include(request, response);
		}*/
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		//this.presente = false;
		request.setAttribute("presente", false);
		this.listaUtenti = 
				session.getAttribute("listaUtenti") != null ? (ArrayList<Utente>) session.getAttribute("listaUtenti") : new ArrayList<Utente>();

				for (Utente utente : listaUtenti) {
					if(utente.getEmail().equals(request.getParameter("email"))) {
						//this.presente = true;
						request.setAttribute("presente", true);
						System.out.println("email già presente");
						doGet(request, response);
						break;
					}
				}

				//if(!this.presente) {
				if(!(boolean) request.getAttribute("presente")) {
					String nome = request.getParameter("nome");
					String cognome = request.getParameter("cognome");
					String email = request.getParameter("email");
					String password = request.getParameter("password");

					Utente u = new Utente(nome, cognome, email, password);
					listaUtenti.add(u);

					session.setAttribute("listaUtenti", listaUtenti);
					response.sendRedirect("login");
				} 

	}

}