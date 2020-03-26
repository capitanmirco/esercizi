package model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "gestione", urlPatterns = { "/gestione" })
public class Gestione extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Gestione() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);

		if (request.getQueryString() != null && request.getParameter("id").equals("s")) {
			request.getServletContext().getNamedDispatcher("registrazione").include(request, response);
		}

		else if (request.getQueryString() != null && request.getParameter("id").equals("l")) {
			request.getServletContext().getNamedDispatcher("listautenti").include(request, response);
		}

		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}

}
