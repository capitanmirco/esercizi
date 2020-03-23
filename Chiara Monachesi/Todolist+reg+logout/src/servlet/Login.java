package servlet;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classi.Utente;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Utente> lista_utenti;

    public Login() {
        super();
        lista_utenti = new ArrayList<Utente>();
    }

	@Override
	public void init() throws ServletException {
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		request.getSession().setAttribute("lista_utenti", lista_utenti);
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/login.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean flag = true;
		for (Utente u : lista_utenti) 
		{
			if(u.getEmail().equals(email) && u.getPassword().equals(password))
			{
				flag = false;
				HttpSession session = request.getSession();
				session.setAttribute("utente", u);
				response.sendRedirect("todolist");
			}
		}
		
		if(flag)
		{
			System.out.println("credenziali sbagliate");
			doGet(request, response);
		}
	}

}
