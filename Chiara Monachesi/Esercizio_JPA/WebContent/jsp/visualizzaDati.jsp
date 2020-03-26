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
				<th scope="col"></th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody class="text-center">
	<%
	   GestioneCRUD db = new GestioneCRUD();
	   List<Utente> lista = (List<Utente>) db.getUtenteAll();
		
	   for (Utente u : lista){
	%>
			<tr>
				<th scope="row">
					<% out.print(u.getNome()); %>
				</th>
				<td>
					<% out.print(u.getCognome()); %>
				</td>
				<td>
					<% out.print(u.getEmail()); %>
				</td>
				<td>
					<% out.print(u.getPassword()); %>
				</td>
				<td>
					<a href="gestione?method=delete&id=<% out.print(u.getUtenteId());%>&pagina=vis"
					type="submit" class="btn btn-outline-danger"> Rimuovi</a>
				</td>
				<td>
					<a href="disp?method=update&id=<% out.print(u.getUtenteId());%>"
					type="submit" class="btn btn-outline-danger"> Modifica</a>
				</td>
			</tr>
			<% } %>

		</tbody>
	</table>
</div>