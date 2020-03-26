<div class="container">

<h1> Registrazione utente </h1>

	<form action="/GestioneUtentiDB/gestione?method=add" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">Nome</label> <input type="text"
				name="nome" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Cognome</label> <input type="text"
				name="cognome" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Email</label> <input type="email"
				name="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" name="password" class="form-control"
				id="exampleInputPassword1">
		</div>
		<button type="submit" class="btn btn-primary">Registra</button>
	</form>

</div>
