package it.corso.java;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VisualizzaDati
 */
@WebServlet("/VisualizzaDati")
public class VisualizzaDati extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       public ArrayList <Utente> VisualizzaUtenti = new ArrayList<Utente>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzaDati() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getServletContext().getRequestDispatcher("/jsp/head.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/vedidati.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}



}
