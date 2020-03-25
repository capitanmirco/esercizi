package it.corso.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "avvio", urlPatterns = { "/avvio" })
public class Avvio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Avvio() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/menu.jsp").include(request, response);
		request.getServletContext().getNamedDispatcher("menu").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}