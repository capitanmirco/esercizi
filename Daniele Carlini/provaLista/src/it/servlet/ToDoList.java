package it.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ToDoList
 */
@WebServlet(name = "todolist", urlPatterns = { "/todolist"})
public class ToDoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ArrayList<ToDo> lista;
       

    public ToDoList() {
        super();
        lista = new ArrayList<ToDo>();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if(session.getAttribute("utente_loggato") != null) {
			System.out.println("ok");
		}else {
			System.out.println("nessun utente loggato");
			response.sendRedirect("login");
		}
		request.setAttribute("listaToDo", lista);	
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/input.jsp").include(request, response);		
		
		request.getServletContext().getNamedDispatcher("gestione").include(request, response);
		
		request.getServletContext().getRequestDispatcher("/jsp/lista.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/logout.jsp").include(request, response);
		
		if(request.getParameter("logout") != null && request.getParameter("logout").equals("true")) {
			System.out.println("Logout premuto");
			request.getServletContext().getNamedDispatcher("logout").forward(request, response);
		}
		
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
