<%@page import="model.Utente"%>
<%@page import="model.GestioneUtente"%>
<div class="container">

	<form>

		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th>#</th>
					<th scope="col">Nome</th>
					<th scope="col">Cognome</th>
					<th scope="col">Email</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>

				<%
					GestioneUtente gu = new GestioneUtente();
					for (Utente u : gu.getUtenti()) {
				%>

				<tr>
					<th><%=u.getUtenti_Id()%></th>
					<td><%=u.getNome()%></td>
					<td><%=u.getCognome()%></td>
					<td><%=u.getEmail()%></td>
					<td><a
						href="/GestioneUtentiDB/gestione?method=update&id=<%out.print(u.getUtenti_Id());%>"
						type="button" class="btn btn-danger">Edit </a></td>
					<td><a
						href="/GestioneUtentiDB/gestione?method=delete&id=<%out.print(u.getUtenti_Id());%>"
						type="button" class="btn btn-danger">Remove </a></td>
				</tr>

				<%
					}
				%>

			</tbody>
		</table>

	</form>

</div>
