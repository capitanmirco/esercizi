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

/**
 * Servlet implementation class GestioneUtenti
 */
@WebServlet(name="GestioneUtenti",urlPatterns="/GestioneUtenti")
public class GestioneUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Database db;
    Utente u=null;
    private ArrayList<Utente> listautenti;
    public GestioneUtenti() {
        super();
        listautenti=new ArrayList<Utente>();
    }
    
	@Override
	public void init() throws ServletException {
		try {
			db=new Database();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);		
		request.getServletContext().getRequestDispatcher("/jsp/registrazione.jsp").include(request, response);
		session.setAttribute("lista",listautenti);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		try {
			listautenti=db.Search();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome=request.getParameter("nome");;
		String cognome=request.getParameter("cognome");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		u=new Utente(0,nome,cognome,email,password);
		listautenti.add(u);
		
		try {
			db.insertUser(u);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("GestioneUtenti");
		
	}

}
