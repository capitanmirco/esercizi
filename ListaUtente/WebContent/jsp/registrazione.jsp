<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>Web Application Java Generation 11</title>
  </head>
  <body>
    
    <div class="container">
    	<h1>Registrazione Utente</h1>
    	<form action="/ListaUtente/RegistraUtente" method="post">
		  <div class="form-group">
		    <label for="nome">Inserisci Nome</label>
		    <input type="text" class="form-control" id="nome" aria-describedby="nome" name="nome">
		  </div>
		  <div class="form-group">
		    <label for="cognome">Inserisci Cognome</label>
		    <input type="text" class="form-control" id="cognome" aria-describedby="cognome" name="cognome">
		  </div>
		  <div class="form-group">
		    <label for="eta">Inserisci Età</label>
		    <input type="number" class="form-control" id="eta" aria-describedby="eta" name="eta">
		  </div>
		  <div class="form-group">
		    <label for="citta">Inserisci Città</label>
		    <input type="text" class="form-control" id="citta" aria-describedby="citta" name="citta">
		  </div>
		  <div class="form-group">
		    <label for="via">Inserisci indirizzo</label>
		    <input type="text" class="form-control" id="via" aria-describedby="via" name="via">
		  </div>
		  <div class="form-group">
		    <label for="email">Inserisci E-mail</label>
		    <input type="email" class="form-control" id="email" aria-describedby="email" name="email">
		  </div>
		   <div class="form-group">
		    <label for="password">Inserisci Password</label>
		    <input type="password" class="form-control" id="password" aria-describedby="password" name="password">
		  </div>
		  <button type="submit" class="btn btn-primary">Registra Utente</button>
		</form>
    </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>