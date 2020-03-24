package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "reg", urlPatterns = "/reg")
public class Registra extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private boolean presente = false;
	private Database db;

	public Registra() {
		super();
	}

	@Override
	public void init() throws ServletException 
	{
		try 
		{ 
			db = new Database();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/nav.jsp").include(request, response);

		if (request.getParameter("pagina") != null && request.getParameter("pagina").equals("vis"))
		{
			if(request.getParameter("delete") != null)
			{
				try {
					db.delete(request.getParameter("delete"));
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			request.getServletContext().getRequestDispatcher("/jsp/visualizzaDati.jsp").include(request, response);
		}
		else 
		{
			request.getServletContext().getRequestDispatcher("/jsp/registrati.jsp").include(request, response);
			if (presente)
			{
				request.getServletContext().getRequestDispatcher("/jsp/alert.jsp").include(request, response);
				presente = false;
			}
		}

		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(!request.getParameter("nome").equals("") && !request.getParameter("cognome").equals("") 
				&& !request.getParameter("email").equals("") && !request.getParameter("password").equals(""))
		{
			try 
			{
				if(db.verificaEsistenza(request.getParameter("email")))
				{
					System.out.println("utente già esistente");
					request.setAttribute("alert", "Email esistente, usane una diversa");
					this.presente = true;
					
					doGet(request, response);
				} else {

					db.insertUtente(new Utente(db.contaUtenti(), 
							request.getParameter("nome"), 
							request.getParameter("cognome"),
							request.getParameter("email"), 
							request.getParameter("password")));

					request.setAttribute("alert", "Utente registrato");
					this.presente = true;
					doGet(request, response);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
		else 
		{
			this.presente = true;
			request.setAttribute("alert", "Hai lasciato un campo vuoto.");
			System.out.println("hai lasciato un campo vuoto");
			doGet(request, response);
		}
	}
}
