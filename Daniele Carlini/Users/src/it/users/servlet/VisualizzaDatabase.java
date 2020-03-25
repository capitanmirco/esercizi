package it.users.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.users.classi.Database;
import it.users.classi.Utente;

/**
 * Servlet implementation class VisualizzaDatabase
 */
@WebServlet(name = "visualizzadatabase", urlPatterns = { "/visualizzadatabase"})
public class VisualizzaDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ArrayList<Utente> listaUtenti;
	Database db;

    public VisualizzaDatabase() {
        super();
    }
    
	@Override
	public void init() throws ServletException {
		listaUtenti = new ArrayList<Utente>();
		try {
			db = new Database();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/navbar.jsp").include(request, response);
		
		try {
			listaUtenti = db.readUtente();
			session.setAttribute("listaUtenti", listaUtenti);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(request.getParameter("delete")!=null) {
			System.out.println(request.getParameter("delete"));
			session.setAttribute("email_cancellare", request.getParameter("delete"));
			//System.out.println("mi sposto in cancellautente");
			request.getServletContext().getNamedDispatcher("cancellautente").include(request, response);
		}
		
		request.getServletContext().getRequestDispatcher("/jsp/visualizzadatabase.jsp").include(request, response);		
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
