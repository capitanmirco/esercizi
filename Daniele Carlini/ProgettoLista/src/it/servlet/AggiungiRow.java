package it.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.classi.Lista;

/**
 * Servlet implementation class AggiungiRaw
 */
@WebServlet(name = "aggiungirow", urlPatterns = {"/aggiungirow"})
public class AggiungiRow extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<String> lista = new ArrayList<String>();
	      

    public AggiungiRow() {
        super();

    }
    
    public ArrayList<String> getLista(){
		return this.lista;
	}

    //aggiunta di un nuovo elemento alla lista
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		lista.add(request.getParameter("lista"));
		if(lista.size() != 0) {
			request.setAttribute("lista", lista);
		}else {
			System.out.println("non inserito");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
