package it.corso.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DispApp")
public class DispApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DispApp() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/navbar.jsp").include(request, response);
		request.getServletContext().getNamedDispatcher("registrautente").include(request, response);
		
		request.getServletContext().getNamedDispatcher("controllopagina").include(request, response);
		
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
	}


}
