<%@page import="Model.GestioneCRUD"%>
<%@page import="java.util.List"%>
<%@page import="Model.Utente"%>
<div class="container">
	<table class="table mt-3" border=1>
		<thead class="thead-dark text-center">
			<tr>

				<th scope="col ">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
			</tr>
		</thead>
		<tbody class="text-center">
	<%
	   GestioneCRUD db = new GestioneCRUD();
	   Utente u = db.getUtenteById(Integer.parseInt(request.getParameter("id")));
	%>
			<tr>
				<td scope="row">
					<% out.print(u.getNome()); %>
				</td>
				<td scope="row">
					<% out.print(u.getCognome()); %>
				</td>
				<td scope="row">
					<% out.print(u.getEmail()); %>
				</td>
				<td scope="row">
					<% out.print(u.getPassword()); %>
				</td>
			</tr>

		</tbody>
	</table>
	
	<form method=POST action="gestione?method=update&id=<%out.print(request.getParameter("id"));%>">
		 <div class="form-group">
    		<label for="nome">Nome</label>
    		<input type="text" name="nome" class="form-control">
  		</div>
  		<div class="form-group">
    		<label for="cognome">Cognome</label>
    		<input type="text" name="cognome" class="form-control">
  		</div>
  		<div class="form-group">
   			<label for="email">Email address</label>
   			<input type="email" name="email" class="form-control">
  		</div>
  		<div class="form-group">
    		<label for="password">Password</label>
    		<input type="password" name="password" class="form-control">
  		</div>
 		 <button type="submit" class="btn btn-outline-primary">Submit</button>
	</form>
	
	