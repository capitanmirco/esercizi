package it.java.EsLista;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/VisualizzaLista")
public class VisualizzaLista extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public VisualizzaLista() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String lista = request.getParameter("lista");
	
	response.getWriter().append(lista);
	
	}

}
