package it.corso.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistraUtente
 */
@WebServlet("/RegistraUtente")
public class RegistraUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DataBase db;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistraUtente() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	    response.setContentType("text/html");
	    String nome, cognome, email, password;
	    nome = request.getParameter("nome");
	    cognome = request.getParameter("cognome");
	    email = request.getParameter("email");
	    password = request.getParameter("password");
	    
		request.getServletContext().getRequestDispatcher("/jsp/head.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/registrautente.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		try {
			 db = new DataBase();
			 db.insertUser(new Utente(0, nome, cognome, email, password));
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
	}

}
