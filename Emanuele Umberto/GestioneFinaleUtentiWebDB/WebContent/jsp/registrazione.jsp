<%@page import="model.Utente"%>

<%
	Utente m = (Utente) request.getAttribute("utente");	
%>


<div class="container">
	<h1>Register Page</h1>
	<form method="post">
	  <div class="form-group">
	    <label for="exampleInputEmail1">Nome</label>
	    <input type="text" name="nome" class="form-control" id="exampleInputEmail1" value="<%= m != null ? m.getNome() : "" %>">
	  	<input type="hidden" name="id" value="<%= m != null ? m.getUtenteId() : "" %>">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputEmail1">Cognome</label>
	    <input type="text" name="cognome" class="form-control" id="exampleInputEmail1" value="<%= m != null ? m.getCognome() : "" %>">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputEmail1">Citta</label>
	    <input type="text" name="citta" class="form-control" id="exampleInputEmail1" value="<%= m != null ? m.getCitta() : "" %>">
	  </div>
	  <div class="form-group">
	    <label for="exampleInputPassword1">Telefono</label>
	    <input type="text" name="telefono" class="form-control" id="exampleInputPassword1" value="<%= m != null ? m.getTelefono() : "" %>">
	  </div>
	  <button type="submit" class="btn btn-primary">Invia</button>
	</form>
	<% if(request.getAttribute("ok") != null) { 
		Utente u = (Utente) request.getAttribute("ok");
	%>
	<div class="alert alert-success" role="alert">
	  Utente <%= u.getNome() + " " + u.getCognome() %> aggiunto con successo!!
	</div>
	<% } %>
</div>