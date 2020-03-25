package it.corso.java;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="registrazione", urlPatterns= {"/registrazione"})
public class Registrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Database db;
	//ArrayList<Utente> users = new ArrayList<Utente>();
	int c=0;
	
	public Registrazione() {
    }
    
    @Override
    public void init() throws ServletException{
    	try {
			db = new Database();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("id") != null) {
			try {
				db.removeUser(Integer.parseInt(request.getParameter("id")));
				request.setAttribute("id", null);
				request.setAttribute("chiamata", "doget");
				doPost(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else {
			request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
			request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String cognome= request.getParameter("cognome");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Utente u = new Utente(c++, nome, cognome, email, password);
		
		try {
			if(request.getAttribute("chiamata") != "doget")
				db.insertUser(u);
			request.setAttribute("chiamata", null);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			request.setAttribute("utenti", db.readUsers());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/stampa.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
	}
}