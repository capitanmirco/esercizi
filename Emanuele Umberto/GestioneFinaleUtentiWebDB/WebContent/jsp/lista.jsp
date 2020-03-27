
<%@page import="model.Utente"%>
<%@page import="java.util.List"%>
<div class="container">
	<table class="table table-striped table-dark">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Nome</th>
	      <th scope="col">Cognome</th>
	      <th scope="col">Citta</th>
	      <th scope="col">Telefono</th>
	      <th></th>
	    </tr>
	  </thead>
	  <tbody>
	  <% 
	  	List<Utente> listaUtentiJsp = (List<Utente>) request.getAttribute("listaUtenti");
	  	for(Utente utente : listaUtentiJsp) {
	  %>
	  
	  <tr>
	      <th><%= utente.getUtenteId() %></th>
	      <th><%= utente.getNome() %></th>
	      <th><%= utente.getCognome() %></th>
	      <th><%= utente.getCitta() %></th>
	      <th><%= utente.getTelefono() %></th>
	      <th>
	      	<a href="cancellautenti?del=<%= utente.getUtenteId() %>" type="button" class="btn btn-danger">Cancella</a>
	      	<a href="disp_modificaUtente?mod=<%= utente.getUtenteId() %>" type="button" class="btn btn-warning">Modifica</a>
	      </th>
	    </tr>
	 
	  <% } %>
	  </tbody>
	</table>
</div>