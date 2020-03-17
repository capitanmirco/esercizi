package it.corso.web;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv")
public class ProvaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProvaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*System.out.println(request.getMethod());
		response.getWriter().append("Method Request: " + request.getMethod());
		response.getWriter().append(" User-Agent: " + request.getHeader("User-Agent"));
		
		request.getHeader("User-Agent");
		
		Enumeration<String> listaNames =  request.getHeaderNames();
		
		while (listaNames.hasMoreElements()) {
			String s = listaNames.nextElement();
			System.out.println(s + ": " + request.getHeader(s));
		}*/
		
		
		if(request.getQueryString() != null) {
			//response.getWriter().append(request.getQueryString());
			response.getWriter().append("Ciao " + request.getParameter("nome") + " " + request.getParameter("cognome"));
		} else {
			response.getWriter().append("Non ci sono valori");
		}
		
	}

}
