<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="it.corso.java.Utente"%>
<%@page import="javax.servlet.http.HttpSession"%>
<div class="container">

	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col">Email</th>

				<th></th>
			</tr>
		</thead>
		<tbody>
			<%
				HttpSession s = request.getSession();
				ArrayList<Utente> listautenti = (ArrayList<Utente>) s.getAttribute("lista");
				for (Utente u : listautenti) {
					// if(utente.getUtente_id()!=0){
					out.println("<tr>");
					out.println("<th>" + u.getUtente_id() + "</th>");
					out.println("<td>" + u.getNome() + "</td>");
					out.println("<td>" + u.getCognome() + "</td>");
					out.println("<td>" + u.getEmail() + "</td>");
					out.println("<td>" + u.getPassword() + "</td>");
					out.print("<td><a href=\"listautenti?method=delete&es="+u.getUtente_id()+"\" type=\"button\" class=\"btn btn-danger\">Cancella</button></td>");
					out.println("</tr>");
					// }
				}
				//session.setAttribute("u",x);
				//+s.getUtente().getNome() +
				/*
				out.print("<td><a href=\"TodoList?method=delete&id="+(listaDaIterare.indexOf(s))+"\" type=\"button\" class=\"btn btn-danger\">Cancella</button></td>");
					out.print("</tr>");
					<th scope="col">Elimina</th>
				*/
				request.getSession().setAttribute("listaUtenti", listautenti);
			%>


		</tbody>
	</table>
</div>