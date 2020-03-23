package it.java.todolist;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "gestione", urlPatterns = { "/gestione" })
public class Gestione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Gestione() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<ToDo> lista =  (ArrayList<ToDo>) request.getAttribute("listaTodo");
		if(request.getParameter("input") != null) {
			String input = request.getParameter("input");
			String timestamp = LocalDateTime.now().toString();
			Utente utente = (Utente) session.getAttribute("utente_loggato");
			ToDo t = new ToDo(input, timestamp, utente);
			lista.add(t);
			request.setAttribute("listaTodo", lista);
		} else if(request.getParameter("delete") != null){
			int id = Integer.parseInt(request.getParameter("delete"));
			lista.remove(id);
			request.setAttribute("listaTodo", lista);
		}
		
		
		
	}


}
