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
 * Servlet implementation class CancellaUtente
 */
@WebServlet(name = "cancellautente", urlPatterns = { "/cancellautente"})
public class CancellaUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Database db;

    public CancellaUtente() {
        super();
    }
    
	@Override
	public void init() throws ServletException {
		try {
			db = new Database();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		if(session.getAttribute("listaUtenti") != null) {
			ArrayList<Utente> listautenti;
			try {
				//listautenti = db.readUtente();
				int idUtente = Integer.parseInt((String) session.getAttribute("email_cancellare")); 
				//System.out.println(db.emailUtente(idUtente));
				db.cancellaUtente(db.emailUtente(idUtente));
				//System.out.println("utenti cancellati");
				session.removeAttribute("email_cancellare");
				listautenti = db.readUtente();
				session.setAttribute("listaUtenti", listautenti);
				response.sendRedirect("visualizzadatabase");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}else {
			ArrayList<Utente> listautenti = new ArrayList<Utente>();
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
