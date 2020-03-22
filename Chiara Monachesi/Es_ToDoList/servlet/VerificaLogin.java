package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="verifica", urlPatterns= {"/verifica"})
public class VerificaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public VerificaLogin() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		if (request.getParameter("email").equals("i@gmail.it") && request.getParameter("password").equals("1234"))
		{
			request.getSession().setAttribute("autorizzato", "si");
			//request.getSession().setMaxInactiveInterval(60);
			request.getServletContext().getNamedDispatcher("disp").forward(request, response);
		} 
		else
		{
			request.getSession().setAttribute("autorizzato", "no");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
