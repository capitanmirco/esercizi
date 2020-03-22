package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="remove", urlPatterns= {"/remove"})
public class RemoveItem extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    public RemoveItem() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		List<String> list = (List<String>)request.getSession().getAttribute("lista");
		int n = Integer.parseInt(request.getParameter("n"));
		list.remove(n);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
