package it.corso.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Es1
 */
@WebServlet("/Es1")
public class Es1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cognome;
	private Integer eta;
	private String citta;
	private String via;
	private String email;
	Persona p=new Persona(nome, cognome, eta, citta, via, email);
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Es1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		nome=request.getParameter("nome");
		cognome=request.getParameter("cognome");
		try {
		eta=Integer.valueOf(request.getParameter("eta"));
		}catch(NumberFormatException E) {
			response.getWriter().append("Hai Scritto lettere al posto di un numero co......");
		}
		citta=request.getParameter("citta");
		via=request.getParameter("via");
		email=request.getParameter("email");
		p.setNome(nome);
		p.setCognome(cognome);
		p.setEta(eta);
		p.setCitta(citta);
		p.setEmail(email);
		p.insertPersona(p);
		response.getWriter().append(p.toString());
	}

}
