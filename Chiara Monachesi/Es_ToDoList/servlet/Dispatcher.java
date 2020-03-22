package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;


@WebServlet(name="disp", urlPatterns= {"/disp"})
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Dispatcher() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		request.getServletContext().getRequestDispatcher("/header.jsp").include(request, response);
		
		if (request.getSession().getAttribute("autorizzato") != null && request.getSession().getAttribute("autorizzato").equals("si"))
		{
			request.getServletContext().getRequestDispatcher("/aggiungi.jsp").include(request, response);
			
			if(request.getParameter("textAtt") != null)
			{
				request.getServletContext().getNamedDispatcher("add").include(request, response);
			} 
			else if(request.getParameter("n") != null)
			{
				request.getServletContext().getNamedDispatcher("remove").include(request, response);
			} 
			else 
			{
				request.getServletContext().getNamedDispatcher("create").include(request, response);
			}
			request.getServletContext().getRequestDispatcher("/listItem.jsp").include(request, response);
			
		}
		else
		{

			if(request.getParameter("email") != null && request.getParameter("password") != null)
			{
				request.getServletContext().getNamedDispatcher("verifica").include(request, response);
			}

			request.getServletContext().getRequestDispatcher("/login.jsp").include(request, response);
		} 
		
		request.getServletContext().getRequestDispatcher("/footer.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
