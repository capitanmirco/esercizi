<%@page import="java.util.ArrayList"%>
<%@page import="it.corso.java.Utente"%>

<br>
<div class="container">
	<table class="table table-dark">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
				<th></th>
			</tr>
		</thead>
		<tbody>

			<%
				ArrayList<Utente> lista = (ArrayList<Utente>) request.getAttribute("listaUtenti");
				for (Utente u : lista) {
			%>
			<tr>
				<td><%=u.getUtente_id()%></td>
				<td><%=u.getNome()%></td>
				<td><%=u.getCognome()%></td>
				<td><%=u.getEmail()%></td>
				<td><%=u.getPassword()%></td>
				<td><a href="?method=delete&id=<%=u.getEmail()%>"
					type="button" class="btn btn-danger">Cancella</a></td>
			</tr>

			<%
				}
			%>
		</tbody>
	</table>
</div>