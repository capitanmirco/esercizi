<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/EsercizioWebUtente/servletutente" method="post">
	Nome <input name="nome" type="text" placeholder="Inserisci nome"> <br>
	Cognome <input name="cognome" type="text" placeholder="Inserisci cognome"> <br>
	Eta <input name="eta" type="number" placeholder="Inserisci età"> <br>
	Citta <input name="citta" type="text" placeholder="Inserisci città"> <br>
	Via <input name="via" type="text" placeholder="Inserisci via"> <br>
	Email <input name="email" type="text" placeholder="Inserisci e-mail"> <br>		
	
	<input type="submit" value="Invia">
    <input type="reset" value="Resetta pagina">

	</form>
</body>
</html>