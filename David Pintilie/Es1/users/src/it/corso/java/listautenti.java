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
 * Servlet implementation class listautenti
 */
@WebServlet("/listautenti")
public class listautenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
      Database db;
      ArrayList<Utente> listautenti;

    public listautenti() throws SQLException {
        super();
        db=new Database();
        listautenti=new ArrayList<Utente>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x = 0;
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);		
		request.getServletContext().getRequestDispatcher("/jsp/lista.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		HttpSession session=request.getSession();
		ArrayList<Utente> listautenti1=(ArrayList<Utente>) session.getAttribute("lista");
		Utente u=new Utente(0, "", "", "", "");
		session.setAttribute("lista", listautenti1);
		if(request.getParameter("method")!=null) {
		x=Integer.parseInt(request.getParameter("es"));
		}
		for (Utente utente : listautenti1) {
			if(utente.getUtente_id()==x) {
				u=utente;
			}
		}
		listautenti1.remove(u);
		try {
			db.remove(x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listautenti.clear();
		/*try {
			
			listautenti1.remove(d);
			}catch(IndexOutOfBoundsException e) {
				listautenti.clear();
			}*/
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("listautenti");
	}

}
