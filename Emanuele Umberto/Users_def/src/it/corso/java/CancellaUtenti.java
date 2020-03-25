package it.corso.java;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cancellautenti")
public class CancellaUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CancellaUtenti() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int id =  Integer.parseInt(request.getParameter("delete"));
		 try {
			Database db = new Database();
			db.cancellaUtente(id);
			response.sendRedirect("listautenti");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
