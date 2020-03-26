<br>
<form action="/ProgettoDB/registrazione" method="post">
	<div class="container">
		<h1>Registrazione utente</h1>

		<div class="form-group">
			<label for="nome"> Inserisci nome </label> <input type="text"
				class="form-control" id="nome" aria-describedby="nome" name="nome">

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

		<%
			if (request.getAttribute("presente") != null && (boolean) request.getAttribute("presente")) {
		%>
		<div class="alert alert-danger" role="alert">
			Email
			<%=request.getParameter("email")%>
			gia' presente!
		</div>
		<%
			}
		%>

		<div class="form-group">
			<label for="exampleInputPassword1">Inserisci password</label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				name="password">
		</div>
		<button type="submit" class="btn btn-primary" name="id" value="r">
			Registrati</button>
		<a href="disp" style="float: right" class="btn btn-secondary"
			role="button" aria-pressed="true">Annulla</a>
	</div>
</form>
</div>