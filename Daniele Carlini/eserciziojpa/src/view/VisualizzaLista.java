package view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisualizzaLista
 */
@WebServlet(name="visualizzalista", urlPatterns = {"/visualizzalista"})
public class VisualizzaLista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public VisualizzaLista() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/navbar.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/visualizza.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
		//se crud=delete
		if(request.getParameter("crud") != null && request.getParameter("crud").equals("delete")) {
			request.getServletContext().getNamedDispatcher("operazionicrud").include(request, response);
		}
		
		//se crud=mod
		if(request.getParameter("crud") != null && request.getParameter("crud").equals("mod")) {
			request.getServletContext().getNamedDispatcher("operazionicrud").forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
