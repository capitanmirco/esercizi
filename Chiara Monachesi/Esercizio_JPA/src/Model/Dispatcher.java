package Model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="disp", urlPatterns = {"/disp"})
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Dispatcher() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
    	request.getServletContext().getRequestDispatcher("/jsp/nav.jsp").include(request, response);
    	
    	if(request.getParameter("pagina") != null && request.getParameter("pagina").equals("vis"))
    	{
        	request.getServletContext().getRequestDispatcher("/jsp/visualizzaDati.jsp").include(request, response);
    	}
    	else if (request.getParameter("method")!= null && request.getParameter("method").equals("update"))
		{
        	request.getServletContext().getRequestDispatcher("/jsp/modifica.jsp").include(request, response);
		}
    	else
    	{
        	request.getServletContext().getRequestDispatcher("/jsp/registrati.jsp").include(request, response);
    	}
    	
    	request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
