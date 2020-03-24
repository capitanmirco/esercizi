package it.todo.java;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@WebServlet(name = "gestione", urlPatterns = {"/gestione"})
public class Gestione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Gestione() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<ToDo> lista = (ArrayList<ToDo>) request.getAttribute("listaTodo");
		if (request.getParameter("input")!= null) {
		String input = request.getParameter("input");
		String timestamp = LocalDateTime.now().toString();
		
		Utente utente = (Utente) session.getAttribute("utente_loggato");
		ToDo t = new ToDo(input, timestamp, utente);
		
		lista.add(t);
		request.setAttribute("listaTodo", lista);
		} else if (request.getParameter("method")!= null){
			int id = Integer.parseInt(request.getParameter("id"));
			lista.remove(id);
			request.setAttribute("listaTodo", lista);
		}
	}

	

}
