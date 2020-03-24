<%@page import="java.util.ArrayList"%>
<%@page import="servlet.Utente"%>
<%@page import="servlet.Database"%>
<div class="container">
	<table class="table mt-3" border=1>
		<thead class="thead-dark text-center">
			<tr>

				<th scope="col ">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody class="text-center">
			<%
	   Database db = new Database();
	   for (Utente u : db.selectUtenti()){
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
				<td><a
					href="reg?pagina=vis&delete=<% out.print(u.getEmail()); %>"
					type="submit" class="btn btn-outline-danger"> Rimuovi</a></td>
			</tr>
			<% } %>

		</tbody>
	</table>
</div>