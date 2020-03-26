<div class="container">
<br><br><br>
<h1>Registra Utente</h1>
<form action="/eserciziojpa/operazionicrud" method="POST">
    <div class="form-group col-md-6">
      <input type="hidden" class="form-control" id="hidden" name="crud" value="add">
    </div>
        <%if(request.getSession().getAttribute("error") != null){ %>
   		<div class="alert alert-danger" role="alert">
  			Attenzione hai inserito una mail duplicata, <a href="#" class="alert-link"><%=request.getSession().getAttribute("error")%></a> e' gia' stata inserita.
		</div>
    <%
    	request.getSession().removeAttribute("error");
    } 
    
    %>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Email</label>
      <input type="email" class="form-control" id="inputEmail4" name="email">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Password</label>
      <input type="password" class="form-control" id="inputPassword4" name="password">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Nome</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="Inserisci il tuo Nome" name="nome">
  </div>
  <div class="form-group">
    <label for="inputAddress2">Cognome</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Inserisci il tuo Cognome" name="cognome">
  </div>
  <button type="submit" class="btn btn-primary">Aggiungi</button>
</form>

</div>