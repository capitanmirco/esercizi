package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classi.Utente;

@WebServlet(name="registra", urlPatterns={"/registra"})
public class Registrati extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Registrati() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/registrati.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if(!request.getParameter("nome").equals("") && !request.getParameter("cognome").equals("") 
				&& !request.getParameter("email").equals("") && !request.getParameter("password").equals(""))
		{
			ArrayList<Utente> lista_utente = (ArrayList<Utente>) request.getSession().getAttribute("lista_utenti");
			
			if(lista_utente != null)
			{
				for(Utente u : lista_utente)
				{
					if(request.getParameter("email").equals(u.getEmail()))
					{
						System.out.println("utente già esistente");
						doGet(request, response);
					}
				}
			}
			
			
			lista_utente.add(new Utente(request.getParameter("nome"), 
					request.getParameter("cognome"), 
					request.getParameter("email"), 
					request.getParameter("password")));
			
			response.sendRedirect("login");
			
			for(Utente u : lista_utente)
			{
				System.out.println(u.toString());
			}
		} 
		else 
		{

			System.out.println("hai lasciato un campo vuoto");
			doGet(request, response);
		}

	}

}
