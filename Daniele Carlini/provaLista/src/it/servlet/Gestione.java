package it.servlet;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Gestione
 */
@WebServlet(name = "gestione", urlPatterns = { "/gestione"})
public class Gestione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Gestione() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<ToDo> lista = (ArrayList<ToDo>)request.getAttribute("listaToDo");
		
		//in questo punto abbiamo i dati ricevuti da input e siamo pronti per passarli a lista
				if(request.getParameter("input") != null ) {
					String input = request.getParameter("input");
					String timeStamp = LocalDateTime.now().toString();//trasforma la data in stringa
					Utente utente = (Utente)session.getAttribute("utente_loggato");
					ToDo t = new ToDo(input, timeStamp, utente);					
					
					lista.add(t);
					request.setAttribute("listaToDo", lista);
				} else if(request.getParameter("method") != null) {
					int id = Integer.parseInt(request.getParameter("id"));
					lista.remove(id);
					request.setAttribute("listaToDo", lista);
				}
				
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
