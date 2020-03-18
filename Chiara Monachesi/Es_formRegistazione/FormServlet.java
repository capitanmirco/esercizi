

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/formserv")
public class FormServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public FormServlet() 
    {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int eta = new Integer(request.getParameter("eta"));
		
		Utente u = new Utente(request.getParameter("nome"), 
							request.getParameter("cognome"),
							eta,
							request.getParameter("citta"),
							request.getParameter("via"),
							request.getParameter("email"));
		
		ArrayList<Utente> utenti = new ArrayList<Utente>();
		
		utenti.add(u);
		
		response.getWriter().append("I tuoi dati\n");
		
		response.getWriter().append("Nome: " + utenti.get(0).getNome() + "\n");
		response.getWriter().append("Cognome: " + utenti.get(0).getCognome() + "\n");
		response.getWriter().append("Eta: " + utenti.get(0).getEta() + "\n");
		response.getWriter().append("Città: " + utenti.get(0).getCitta() + "\n");
		response.getWriter().append("Via: " + utenti.get(0).getVia() + "\n");
		response.getWriter().append("Email: " + utenti.get(0).getEmail() + "\n");
	}
		
		
}


