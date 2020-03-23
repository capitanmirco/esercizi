<%@page import="classi.Item"%>
<%@page import="java.util.ArrayList"%>
<table class="table table-striped table-dark">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Data</th>
	      <th scope="col">Testo</th>
	      <th scope="col">Nome utente</th>
	      <th scope="col"></th>
	    </tr>
	  </thead>
	  <tbody>
	   <%
	   ArrayList<Item> lista = (ArrayList<Item>)request.getAttribute("lista");
	   for(Item item : lista)
	   {
	   %> <tr>
		      <th scope="row"> <% out.print(lista.indexOf(item)+1); %> </th>
		      <td> <% out.print(item.getTimestamp()); %> </td>
		      <td> <% out.print(item.getTesto()); %> </td>
		      <td> <% out.print(item.getUtente().getNome()); %> </td>
		      <td> <a href="todolist?delete=<%out.print(lista.indexOf(item));%>" type="submit" class="btn btn-outline-danger"> Rimuovi</a> </td>
		  </tr>
	    <% } %>
	    
	  </tbody>
	</table>
	<a href="todolist?action=logout" type="submit" class="btn btn-outline-dark">Log out</a>
</div>