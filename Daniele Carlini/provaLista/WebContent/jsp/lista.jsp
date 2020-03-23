<%@page import="it.servlet.ToDo"%>
<%@page import="java.util.ArrayList"%>
<div class="container">
<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Data</th>
      <th scope="col">ToDo</th>
      <th scope="col">Utente</th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
  
  <%
  ArrayList<ToDo>listaDaIterare = (ArrayList<ToDo>)request.getAttribute("listaToDo");
  
  for(ToDo todo : listaDaIterare){
	  out.print("<tr>"
      	+ "<th scope=\"row\">" + (listaDaIterare.indexOf(todo)+1) + "</th>"
      	+ "<td>" + todo.getTimeStamp() + "</td>"
      	+ "<td>" + todo.getDato() + "</td>"
      	+ "<td>" + todo.getUtente().getCognome() + " " + todo.getUtente().getNome() + "</td>"
      	+ "<td><a href=\"todolist?method=delete&id=" + listaDaIterare.indexOf(todo) + "\" type=\"button\" class=\"btn btn-danger\">Cancella</a></td>"
    	+ "</tr>"
    	+ "<tr>");
  }
  
  %>
  
  </tbody>
</table>
</div>