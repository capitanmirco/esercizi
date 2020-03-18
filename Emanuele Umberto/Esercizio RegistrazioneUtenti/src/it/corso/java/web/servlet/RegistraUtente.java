package it.corso.java.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.corso.java.web.classi.Utente;

@WebServlet("/registrautente")
public class RegistraUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Utente> listaUtente;
       
    public RegistraUtente() {
        super();
        listaUtente = new ArrayList<Utente>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		int eta = Integer.parseInt(request.getParameter("eta"));
		String citta = request.getParameter("citta");
		String via = request.getParameter("via");
		String email = request.getParameter("email");
		
		Utente u = new Utente(nome, cognome, eta, citta, via, email);
		//System.out.println(u.info());
		listaUtente.add(u);
		
		for (Utente utente : listaUtente) {
			response.getWriter().append(utente.info() + " | ");
		}
		
	}

}
