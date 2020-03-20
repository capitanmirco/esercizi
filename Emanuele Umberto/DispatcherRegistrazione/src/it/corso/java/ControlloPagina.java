package it.corso.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "controllopagina", urlPatterns = { "/controllopagina" })
public class ControlloPagina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ControlloPagina() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utente u = (Utente) request.getAttribute("utente");
		//System.out.println(u);
		if(u != null) {
			//System.out.println(u.getNome());
			request.setAttribute("utente", u);
		}
		
		if(request.getParameter("id") != null) {
			if(request.getParameter("id").equals("l") ) {
				request.getServletContext().getRequestDispatcher("/jsp/login.jsp").include(request, response);
			} else if(request.getParameter("id").equals("r")) {
				request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
			} else if(request.getParameter("id").equals("s")) {
				request.getServletContext().getRequestDispatcher("/jsp/saluta.jsp").include(request, response);
			} 
		}
		
		
	}


}
