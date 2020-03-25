<%@page import="it.corso.java.Utente"%>
<%@page import="java.util.ArrayList"%>
<div class="container">
	<table class="table table-striped table-dark">
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
	  	ArrayList<Utente> listautenti = (ArrayList<Utente>) request.getAttribute("lista");
	  	for(Utente utente : listautenti){
	  %>
	  	<tr>
	  		<th><%= utente.getUtente_id() %></th>
	  		<td><%= utente.getNome() %></td>
	  		<td><%= utente.getCognome() %></td>
	  		<td><%= utente.getEmail() %></td>
	  		<td><a href="cancellautenti?delete=<%= utente.getUtente_id() %>" type="button" class="btn btn-danger">Cancella</a></td>
	  	</tr>
	  <%
	  	}
	  %>
	  
	  </tbody>
	</table>
</div>