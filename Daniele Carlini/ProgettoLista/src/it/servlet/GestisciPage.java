package it.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GestisciPage
 */
@WebServlet(name = "gestiscipage", urlPatterns = { "/gestiscipage"})
public class GestisciPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private boolean login = false;

    public GestisciPage() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//visualizzazione della lista con username e password corretti
		if(request.getParameter("username") != null && request.getParameter("password") != null) {
			if(request.getParameter("username").equals("user") && request.getParameter("password").equals("psw")) {
				request.setAttribute("login", true);
				if((boolean)request.getAttribute("login")) {
					request.getServletContext().getRequestDispatcher("/jsp/viewlista.jsp").include(request, response);		
				}
			}else {
				response.sendRedirect("/ProgettoToDo/home");
			}
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
