package it.java.EsLista;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.java.Utente.Utente;


@WebServlet("/RegistraUtente")
public class RegistraUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RegistraUtente() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome= request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		int eta = Integer.parseInt(request.getParameter("eta"));
		String citta = request.getParameter("citta");
		String indirizzo = request.getParameter("indirizzo");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		response.sendRedirect("/ListaUtente/jsp/EffettuaLogin.jsp");
		
		
}
}
