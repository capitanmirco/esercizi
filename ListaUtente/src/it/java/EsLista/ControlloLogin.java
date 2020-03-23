package it.java.EsLista;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ControlloLogin")
public class ControlloLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ControlloLogin() {
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String email = request.getParameter("email");
		 String password = request.getParameter("password");
		 
		 if(request.getParameter("email").equals("MarioRossi@gmail.com") && (request.getParameter("password").equals("ciao"))){
			 
			 response.sendRedirect("/ListaUtente/jsp/Lista.jsp");
			 
		 }
		 
		 else {
			 
			 response.getWriter().append("Credenziali non valide");
		 }
	}

}
