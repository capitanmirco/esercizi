package it.corso.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.corso.web.Utente;

/**
 * Servlet implementation class ProvaServlet
 */
@WebServlet("/provaservlet")
public class ProvaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProvaServlet() {
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utente u = new Utente(request.getParameter("nome"), request.getParameter("cognome"), request.getParameter("eta"), request.getParameter("citta"), request.getParameter("via"), request.getParameter("email"));
		response.getWriter().append("Inserito correttamente l'utente ").append(u.info());		
	}

}
