<%@page import="it.todo.java.ToDo"%>
<%@page import="java.util.ArrayList"%>

<div class="container">


	<table class="table table-dark">
		<thead>
			<tr>
				<th scope="col">Numero lista</th>
				<th scope="col">Data</th>
				<th scope="col">Todo</th>
				<th scope="col">Utente</th>
			</tr>
		</thead>
		<tbody>
		<%
			ArrayList<ToDo> listaDaIterare = (ArrayList <ToDo>) request.getAttribute("listaTodo");
				  for (ToDo todo : listaDaIterare){
					   
					  out.println("<tr>");
					  out.println("<th>"+ (listaDaIterare.indexOf(todo)+1) +"</th>");
					  out.println("<td>"+ todo.getTimestamp() +"</td>");
					  out.println("<td>"+ todo.getDato() +"</td>");
					  out.println("<td>"+todo.getUtente().getCognome()+" "+todo.getUtente().getNome()+"</td>");
					  out.println("<td> <a href=\"http://localhost:8080/TodolistUmberto/todolist?method=delete&id="+ listaDaIterare.indexOf(todo)+ " \" type=\"button\" class=\"btn btn-danger\">X</a> </td>");
					  out.println("</tr>");
				  }
		%>
			
		</tbody>
	</table>


</div>