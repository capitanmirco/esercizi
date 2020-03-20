package it.corso.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "registrautente", urlPatterns = { "/registrautente" })
public class registraUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public registraUtente() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("eta") != null) {
			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			int eta = Integer.parseInt(request.getParameter("eta")); 
			String citta = request.getParameter("citta");
			String indirizzo = request.getParameter("via");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			Utente u = new Utente(nome, cognome, eta, citta, indirizzo, email, password);
			
			request.setAttribute("utente", u);
		}
		
	}

}
