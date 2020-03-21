package it.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CancellaRow
 */
@WebServlet(name = "cancellarow", urlPatterns = {"/cancellarow"})
public class CancellaRow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CancellaRow() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//cancellazione di un selemento della lista
		ArrayList<String> l = (ArrayList<String>) request.getSession().getAttribute("lista");
		l.remove(request.getParameter("cancella"));
		request.setAttribute("lista", l);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
