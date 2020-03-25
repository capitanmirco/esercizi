<%@page import="it.java.todolist.ToDo"%>
<%@page import="java.util.ArrayList"%>

<div class="container">
	<table class="table table-striped table-dark">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Data</th>
				<th scope="col">Todo</th>
				<th scope="col">Utente</th>
				<th></th>
			</tr>
		</thead>
		<tbody>

			<%
	  	ArrayList<ToDo> listaDaIterare = (ArrayList<ToDo>) request.getAttribute("listaTodo");
	  	for(ToDo todo : listaDaIterare){	  		
	  		/*out.println("<tr>");
	  		out.println("<th>" + (listaDaIterare.indexOf(todo)+1) + "</th>");
	  		out.println("<td>" + todo.getTimestamp() + "</td>");
	  		out.println("<td>" + todo.getDato() + "</td>");
	  		out.println("<td>" + todo.getUtente().getCognome() + " " + todo.getUtente().getNome() + "</td>");
	  		out.println("<td><a href=\"todolist?delete="+ listaDaIterare.indexOf(todo) +" \" type=\"button\" class=\"btn btn-danger\">Cancella</a></td>");
	  		out.println("</tr>");
	  	}*/
	  %>

			<tr>
				<td><%= (listaDaIterare.indexOf(todo)+1) %></td>
				<td><%= todo.getTimestamp() %></td>
				<td><%= todo.getDato() %></td>
				<td><%= todo.getUtente().getCognome() + " " + todo.getUtente().getNome() %></td>
				<td><a href="todolist?delete="
					<%= listaDaIterare.indexOf(todo) %> " type="button"
					class="btn btn-danger">Cancella</a></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</div>