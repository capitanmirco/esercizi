package it.java.todolist;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Utente utente;
       
    public Login() {
        super();
    }

	@Override
	public void init() throws ServletException {
		utente = new Utente("Mario", "Rossi", "mariorossi@gmail.com", "12345");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/login.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(utente.getEmail().equals(email) && utente.getPassword().equals(password)) {
			//request.setAttribute("utente_loggato", utente);
			HttpSession session = request.getSession();
			session.setAttribute("utente_loggato", utente);
			response.sendRedirect("todolist");
			System.out.println("login");
		} else {
			System.out.println("Errore");
			doGet(request, response);
		}
		
	}

}
