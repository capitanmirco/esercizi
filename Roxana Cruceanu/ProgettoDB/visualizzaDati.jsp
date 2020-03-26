<%@page import="java.util.List"%>
<%@page import="model.Utente"%>

<br>
<div class="container">
	<table class="table table-dark">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col">Email</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<%
				List<Utente> lista = (List<Utente>) request.getAttribute("lista");
				for (Utente u : lista) {
			%>
			<tr>
				<th><%=u.getUtenteId()%></th>
				<td><%=u.getNome()%></td>
				<td><%=u.getCognome()%></td>
				<td><%=u.getEmail()%></td>
				<td><a href="cancellautente?delete=<%=u.getUtenteId()%> "
					type="button" class="btn btn-danger"> Cancella </a></td>
				<td><a href="modificautente?update=<%=u.getUtenteId()%> "
					type="button" class="btn btn-primary"> Modifica </a></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
</div>