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

@WebServlet("/todolist")
public class TodoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ToDo> lista;
       
    public TodoList() {
        super();
        lista = new ArrayList<ToDo>();
    }

	@Override
	public void init() throws ServletException {
		//Controllo		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("utente_loggato") != null) {
			System.out.println("tutto ok");
		} else {
			System.out.println("nessun utente loggato");
			response.sendRedirect("login");
		}
		request.setAttribute("listaTodo", lista);
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/input.jsp").include(request, response);
		
		request.getServletContext().getNamedDispatcher("gestione").include(request, response);
		
		request.getServletContext().getRequestDispatcher("/jsp/lista.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
