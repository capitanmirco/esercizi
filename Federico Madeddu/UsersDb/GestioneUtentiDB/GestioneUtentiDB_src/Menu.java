package model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "menu", urlPatterns = { "/menu" })
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Menu() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("id") != null) {
			if(request.getParameter("id").equals("r")) {
				request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
			}
			else if(request.getParameter("id").equals("v")) {
				request.getServletContext().getRequestDispatcher("/jsp/view.jsp").include(request, response);
			}
			else if(request.getParameter("id").equals("e")) {
				request.getServletContext().getRequestDispatcher("/jsp/edit.jsp").include(request, response);
			}
			else if(request.getParameter("id").equals("v2")) {
				request.getServletContext().getRequestDispatcher("/jsp/view2.jsp").include(request, response);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
