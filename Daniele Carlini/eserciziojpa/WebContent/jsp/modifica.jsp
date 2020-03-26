<%@page import="model.User"%>
<br><br><br>
<% User u = (User)request.getAttribute("utente");%>
<div class="container">
<h1>Utente Selezionato</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nome</th>
      <th scope="col">Cognome</th>
      <th scope="col">Email</th>
    </tr>
  </thead>
  <tbody>
  
    <tr>
      <th scope="row"><%= u.getUserId() %></th>
      <td><%= u.getNome() %></td>
      <td><%= u.getCognome() %></td>
      <td><%= u.getEmail() %></td>
    </tr>
   
  </tbody>
</table>

<br><br><br>
<h2>Modifica Campi</h2>
<form action="/eserciziojpa/operazionicrud" method="POST">
	<div class="form-group col-md-6">
      <input type="hidden" class="form-control" id="hidden" name="crud" value="mod">
    </div>
    <div class="form-group col-md-6">
      <input type="hidden" class="form-control" id="hidden" name="id" value="<%=u.getUserId()%>">
    </div>
  <div class="form-row align-items-center">
    <div class="col-auto">
      <label class="sr-only" for="inlineFormInput">Modifica Nome</label>
      <input type="text" class="form-control mb-2" id="inlineFormInput" placeholder="<%=u.getNome()%>" name="nome">
    </div>
	<div class="col-auto">
      <label class="sr-only" for="inlineFormInput">Modifica Cognome</label>
      <input type="text" class="form-control mb-2" id="inlineFormInput" placeholder="<%=u.getCognome()%>" name="cognome">
    </div>
    <div class="col-auto">
      <label class="sr-only" for="inlineFormInput">Modifica Email</label>
      <input type="text" class="form-control mb-2" id="inlineFormInput" placeholder="<%=u.getEmail()%>" name="email">
    </div>
    <div class="col-auto">
    <label class="sr-only" for="inlineFormInput">Conferma Modifica</label>
      <button type="submit" class="btn btn-outline-success" id="inlineFormInput">Conferma Modifica</button>
    </div>
  </div>
</form>
</div>