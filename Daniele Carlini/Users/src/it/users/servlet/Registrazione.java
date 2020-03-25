package it.users.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.users.classi.Utente;

/**
 * Servlet implementation class Registrazione
 */
@WebServlet(name = "registrazione", urlPatterns = { "/registrazione"})
public class Registrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Registrazione() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);	
		request.getServletContext().getRequestDispatcher("/jsp/navbar.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
		
		
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("email") != null && request.getParameter("password") != null &&
				!request.getParameter("email").trim().equals("") && !request.getParameter("password").trim().equals("")) {
			
			request.setAttribute("utente_aggiunto", new Utente(request.getParameter("nome"), request.getParameter("cognome"), request.getParameter("email"), request.getParameter("password"))); 
			
			System.out.println("mi sposto in gestione utenti");
			request.getServletContext().getNamedDispatcher("gestioneutenti").forward(request, response);
		}else {
			response.sendRedirect("registrazione");
		}
	}

}
