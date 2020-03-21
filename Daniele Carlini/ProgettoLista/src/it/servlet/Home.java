package it.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet(name = "home", urlPatterns = {"/home"})
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Home() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		
		//la pagina mostra il login finche non ci si logga
		if(request.getParameter("id") == null && request.getQueryString() == null) {
			request.getServletContext().getRequestDispatcher("/jsp/login.jsp").include(request, response);
		}
		//controllo username e password se errati, redirect verso la pagina principale con nuovo login
		if(request.getParameter("username") != null && request.getParameter("password") != null) {
			if(request.getParameter("username").equals("user") && request.getParameter("password").equals("psw")) {
				request.setAttribute("login", true);
				request.getServletContext().getNamedDispatcher("gestiscipage").include(request, response);
			}else {
				response.sendRedirect("/ProgettoToDo/home");
			}
		}

		
		//aggiunta valore alla lista else if cancella valore dalla lista
		if(request.getParameter("id") != null && request.getParameter("id").equals("list")) {
			request.getServletContext().getNamedDispatcher("aggiungirow").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/viewlista.jsp").include(request, response);
		} else if(request.getQueryString() != null && request.getQueryString().startsWith("cancella")) {
			//request.setAttribute("cancella", request.getParameter("cancella"));
			request.getServletContext().getNamedDispatcher("cancellarow").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/viewlista.jsp").include(request, response);
		}
		
		
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
	}

}
