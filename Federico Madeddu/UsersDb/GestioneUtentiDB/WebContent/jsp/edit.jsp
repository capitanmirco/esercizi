<%@page import="model.Utente"%>
<%@page import="model.GestioneUtente"%>
<div class="container">

<h1> Registrazione nuovo utente </h1>

	<form action="/GestioneUtentiDB/salvadati" method="post">
		<div class="form-row">
			<div class="form-group col md-6">
				<label for="exampleInputEmail1">Nome</label> <input type="text"
					name="newNome" class="form-control" id="newNome"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group col md-6">
				<label for="exampleInputEmail1">Cognome</label> <input type="text"
					name="newCognome" class="form-control" id="newCognome"
					aria-describedby="emailHelp">
			</div>
		</div>
		<div class="form-row">
			<div class="form-group col md-6">
				<label for="exampleInputEmail1">Email</label> <input type="email"
					name="newEmail" class="form-control" id="newEmail"
					aria-describedby="emailHelp">
			</div>
			<div class="form-group col md-6">
				<label for="exampleInputPassword1">Password</label> <input type="password" 
					name="newPassword" class="form-control"
					id="newPassword">
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Modifica</button>
	</form>

</div>