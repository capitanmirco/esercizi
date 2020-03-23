package it.java.todolist;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/todolist")
public class TodoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodoList() {
        super();
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
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
