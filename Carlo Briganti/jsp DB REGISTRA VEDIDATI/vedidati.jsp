<%@page import="java.util.ArrayList"%>
<%@page import="it.corso.java.Utente"%>
<%@page import="it.corso.java.DataBase"%>
<div class="container">
	<table class="table mt-3" border=1>
		<thead class="thead-dark text-center">
			<tr>

				<th scope="col">Nome</th>
				<th scope="col">Cognome</th>
				<th scope="col">Email</th>
				<th scope="col">Password</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody class="text-center">
			<%
				DataBase db = new DataBase();
				for (Utente u : db.selectUtenti()) {
			%>
			<tr>
				<th>
					<%
						out.print(u.getNome());
					%>
				</th>
				<td>
					<%
						out.print(u.getCognome());
					%>
				</td>
				<td>
					<%
						out.print(u.getEmail());
					%>
				</td>
				<td>
					<%
						out.print(u.getPassword());
					%>
				</td>
				<td>
			</tr>
			<%
				}
			%>

		</tbody>
	</table>
</div>