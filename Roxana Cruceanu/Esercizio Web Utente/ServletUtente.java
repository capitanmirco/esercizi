package it.corso.java;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletutente")
public class ServletUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletUtente() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer eta = Integer.parseInt(request.getParameter("eta"));
		Utente u = new Utente(request.getParameter("nome"), request.getParameter("cognome"), eta, request.getParameter("citta"), request.getParameter("via"), request.getParameter("email"));
		ArrayList<Utente> utenti = new ArrayList<Utente>();
		utenti.add(u);
		
		for(Utente c : utenti) {
			System.out.println(c.toString());
			response.getWriter().append("Ciao " + request.getParameter("nome") + " " + request.getParameter("cognome") + "<br>");
		}

	}

}
