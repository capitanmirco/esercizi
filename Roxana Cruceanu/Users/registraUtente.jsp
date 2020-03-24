<br>
<form action="/Users3/gestioneutente" method="post">
	<div class="container">
		<h1>Registrazione utente</h1>
		<%
			int i = 0;
			int n = i + 1;
		%>
		<div class="form-group">
			<label for="nome"> Inserisci nome </label> <input type="text"
				class="form-control" id="nome" aria-describedby="nome" name="nome">
			<input type="hidden" name="n" value="<%=n%>">
		</div>
		<div class="form-group">
			<label for="cognome"> Inserisci cognome </label> <input type="text"
				class="form-control" id="cognome" aria-describedby="cognome"
				name="cognome">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1"> Inserisci e-mail </label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="email"
				placeholder="es. mariorossi@gmail.com">
		</div>


		<div class="form-group">
			<label for="exampleInputPassword1">Inserisci password</label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				name="password">
		</div>
		<button type="submit" class="btn btn-primary" name="id" value="r">
			Registrati</button>

	</div>
</form>
</div>