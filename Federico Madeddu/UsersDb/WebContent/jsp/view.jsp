<%@page import="it.corso.java.Utente"%>
<%@page import="it.corso.java.Database"%>
<div class="container">

	<form>

		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th>#</th>
					<th scope="col">Nome</th>
					<th scope="col">Cognome</th>
					<th scope="col">Email</th>
					<th scope="col">Password</th>
					<th></th>
				</tr>
			</thead>
			<tbody>

				<%
					Database db = new Database();
					for (Utente u : db.getUtente()) {
				%>

				<tr>
					<th><%=u.getUtente_id()%></th>
					<td><%=u.getNome()%></td>
					<td><%=u.getCognome()%></td>
					<td><%=u.getEmail()%></td>
					<td><%=u.getPassword()%></td>
					<td><a
						href="/UsersDb/GestioneUtenti?method=delete&id=<%out.print(u.getUtente_id());%>"
						type="button" class="btn btn-danger">Remove</a></td>
				</tr>

				<%
					}
				%>

			</tbody>
		</table>

	</form>

</div>
