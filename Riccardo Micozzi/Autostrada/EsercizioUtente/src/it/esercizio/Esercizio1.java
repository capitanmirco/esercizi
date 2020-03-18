package it.esercizio;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Esercizio1")
public class Esercizio1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Esercizio1() {
        super();
    } 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Utente> listaUtenti=new ArrayList<Utente>();
		String nome=request.getParameter("nome");
		String cognome=request.getParameter("cognome");
		int eta = new Integer(request.getParameter("eta"));
		String citta=request.getParameter("citta");
		String via=request.getParameter("via");
		String email=request.getParameter("email");
		Utente u=new Utente(nome,cognome,eta,citta,via,email);
		listaUtenti.add(u);
		for (Utente utente : listaUtenti) {
			System.out.println(utente.toString());
		}
		
	}
	
	public ArrayList<Utente> creaUtente(String nome,String cognome,int eta,String citta,String via,String email) {
		
		Utente u=new Utente(nome,cognome,eta,citta,via,email);
		ArrayList<Utente> listaUtenti=new ArrayList<Utente>();
		listaUtenti.add(u);
		return listaUtenti;
	}

}
