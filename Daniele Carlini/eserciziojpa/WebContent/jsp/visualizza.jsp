<%@page import="model.User"%>
<%@page import="java.util.List"%>
<br><br><br>
<div class="container">
<h1>Elementi Inseriti</h1>

<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nome</th>
      <th scope="col">Cognome</th>
      <th scope="col">Email</th>
      <th scope="col"></th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
  
  <% 
  	List<User> lista = (List<User>)request.getAttribute("lista");
  	for( User u : lista){
  %>
  
    <tr>
      <th scope="row"><%= u.getUserId() %></th>
      <td><%= u.getNome() %></td>
      <td><%= u.getCognome() %></td>
      <td><%= u.getEmail() %></td>
      <td><a href="?crud=delete&id=<%=u.getUserId() %>" type="button" class="btn btn-outline-danger">Elimina</button></td>
      <td><a href="?call=mod&id=<%=u.getUserId() %>" type="button" class="btn btn-outline-success">Modifica</button></td>
    </tr>
 
 <%} %>
 
  </tbody>
</table>
</div>