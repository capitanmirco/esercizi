<%@page import="it.users.classi.Utente"%>
<%@page import="java.util.ArrayList"%>
<br><br><br>
<div class="container">
<h1>Lista Utenti Inseriti</h1>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">Nome</th>
      <th scope="col">Cognome</th>
      <th scope="col"></th>
    </tr>
  </thead>
  
  <% ArrayList<Utente> listaUtenti = (ArrayList<Utente>)request.getSession().getAttribute("listaUtenti"); %>
  
  <% for(Utente u : listaUtenti){ %>
  <tbody>
    <tr>
      <th scope="row"><%= u.getUtente_id() %></th>
      <td><%= u.getEmail() %></td>
      <td><%= u.getPassword() %></td>
      <td><%= u.getNome() %></td>
      <td><%= u.getCognome() %></td>
      <td><a href="?delete=<%= u.getUtente_id() %>" type="button" class="btn btn-outline-danger">Cancella</a></td>
    </tr>
  </tbody>
  
  <%}
  request.getSession().setAttribute("listaUtenti", listaUtenti);%>
</table>


</div>