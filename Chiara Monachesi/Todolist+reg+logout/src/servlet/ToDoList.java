package servlet;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import classi.Item;
import classi.Utente;

@WebServlet("/todolist")
public class ToDoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Item> lista;
       
	
    @Override
	public void init() throws ServletException
    {
    	lista = new ArrayList<Item>(); 	
		super.init();
	}

	public ToDoList() 
	{
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		System.out.println(request.getParameter("action"));
		if(request.getParameter("action") != null && request.getParameter("action").equals("logout"))
		{
			request.getSession().removeAttribute("utente"); 
		}
		if(request.getSession().getAttribute("utente") == null)
		{
			response.sendRedirect("login");
		}

		request.setAttribute("lista", lista);	
		
		request.getServletContext().getRequestDispatcher("/jsp/header.jsp").include(request, response);
		request.getServletContext().getRequestDispatcher("/jsp/input.jsp").include(request, response);
		
		request.getServletContext().getNamedDispatcher("salva").include(request, response);
		
		request.getServletContext().getRequestDispatcher("/jsp/lista.jsp").include(request, response);	
		request.getServletContext().getRequestDispatcher("/jsp/footer.jsp").include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
