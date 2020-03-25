<%@page import="it.corso.java.Utente"%>
<%@page import="java.util.ArrayList"%>

<div class="container">
	<table class="table table-bordered table-dark">
	  <thead>
	    <tr>
	      <th scope="col">Id</th>
	      <th scope="col">Nome</th>
	      <th scope="col">Cognome</th>
	      <th scope="col">Email</th>
	      <th scope="col">Password</th>
	    </tr>
	  </thead>
	  <tbody>
 
	  <%
	  	ArrayList<Utente> listaDaIterare = (ArrayList<Utente>) request.getAttribute("utenti");
	  	for(Utente u : listaDaIterare){
	  		out.println("<tr>");
	  		out.println("<th>" + u.getUtente_id() + "</th>");
	  		out.println("<td>" + u.getNome() + "</td>");
	  		out.println("<td>" + u.getCognome() + "</td>");
	  		out.println("<td>" + u.getEmail()  + "</td>");
	  		out.println("<td>" + u.getPassword()  + "</td>");
	  		out.println("<td><a href=\"/Users/registrazione?method=delete&id=" + u.getUtente_id() + " \" type=\"button\" class=\"btn btn-danger\">Elimina</button></td>");
	  		out.println("</tr>");
	  	}
	  %>
 
	  </tbody>
	</table>
</div>