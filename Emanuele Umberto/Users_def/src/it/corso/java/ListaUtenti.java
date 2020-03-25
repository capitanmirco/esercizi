package it.corso.java;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listautenti")
public class ListaUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<Utente> listaUtenti;
       
    public ListaUtenti() {
        super();
        listaUtenti = new ArrayList<Utente>();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		
		try {
			Database db = new Database();
			listaUtenti = db.leggiUtenti();
			request.setAttribute("lista", listaUtenti);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getServletContext().getRequestDispatcher("/jsp/lista.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
