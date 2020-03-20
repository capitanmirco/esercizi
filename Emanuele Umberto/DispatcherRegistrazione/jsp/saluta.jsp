<%@page import="it.corso.java.Utente"%>

<div class="container">

	<%
		Utente u = (Utente) request.getAttribute("utente");
	%>

	<h1>Ciao <% out.print(u.getNome()); %> <% out.print(u.getCognome()); %></h1>

</div>