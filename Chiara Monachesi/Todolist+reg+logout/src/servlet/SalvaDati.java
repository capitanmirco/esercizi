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

@WebServlet(name="salva", urlPatterns={"/salva"})
public class SalvaDati extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

    public SalvaDati() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session = request.getSession();
		ArrayList<Item> lista = (ArrayList<Item>)request.getAttribute("lista");
			       
		if (request.getParameter("text") != null)
		{
			String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

			lista.add(new Item(request.getParameter("text"), date, (Utente) session.getAttribute("utente")));
		} 
		else if (request.getParameter("delete") != null)
		{
			int id = Integer.parseInt(request.getParameter("delete"));
			lista.remove(id);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
