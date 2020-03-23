/*package it.java.EsLista;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Dispatcher")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Dispatcher() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
		request.getServletContext().getNamedDispatcher("RegistraUtente").include(request,response);
		
		request.getServletContext().getRequestDispatcher("/jsp/EffettuaLogin.jsp").include(request,response);
		
		request.getServletContext().getNamedDispatcher("ControlloLogin").include(request,response);
		
		{
			
			
			
			
			
		}
		
	}

}*/
