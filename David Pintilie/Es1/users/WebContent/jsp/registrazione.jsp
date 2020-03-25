<div class="container">
    	<h1>Registrazione Utente</h1>
    	<form action="http://localhost:8080/users/GestioneUtenti"method="post">
		  <div class="form-group">
		    <label for="nome">Inserisci Nome</label>
		    <input type="text" class="form-control" id="nome" aria-describedby="nome" name="nome">
		  </div>
		  <div class="form-group">
		    <label for="cognome">Inserisci Cognome</label>
		    <input type="text" class="form-control" id="cognome" aria-describedby="cognome" name="cognome">
		  	<input type="hidden" name="id" value="s">
		  <div class="form-group">
		    <label for="email">Inserisci E-mail</label>
		    <input type="email" class="form-control" id="email" aria-describedby="email" name="email">
		  </div>
		  <div class="form-group">
		    <label for="password">Inserisci Password</label>
		    <input type="password" class="form-control" id="password" aria-describedby="password" name="password">
		  </div>
		  <button type="submit" class="btn btn-primary">Registra Utente</button>
		  <button type="button" class="btn btn-primary"onclick="location.href='http://localhost:8080/users/listautenti'">Clicca qui per accedere</button>
		</form>
    </div>