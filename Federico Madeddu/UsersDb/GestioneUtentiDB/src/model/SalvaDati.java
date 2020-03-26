package model;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "salvadati", urlPatterns = { "/salvadati" })
public class SalvaDati extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SalvaDati() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessionEdit = request.getSession();
		
		String newNome = request.getParameter("newNome");
		String newCognome = request.getParameter("newCognome");
		String newEmail = request.getParameter("newEmail");
		String newPassword = request.getParameter("newPassword");
		
		sessionEdit.setAttribute("newNome", newNome);
		sessionEdit.setAttribute("newCognome", newCognome);
		sessionEdit.setAttribute("newEmail", newEmail);
		sessionEdit.setAttribute("newPassword", newPassword);
		
		response.sendRedirect("/GestioneUtentiDB/main?id=v2");
		
	}

}
