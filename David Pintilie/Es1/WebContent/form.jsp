<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Titolo bello</title>
</head>
<body>
	<form action="http://localhost:8080/Es1/Es1"method="post">
	Nome<input name="nome" type="text" placeholder="Inserire nome della persona">
	Cognome<input name="cognome" type="text" placeholder="Inserire cognome della persona">
	Eta<input name="eta" type="text" placeholder="Inserire eta della persona">
	Citta<input name="citta" type="text" placeholder="Inserire citta della persona">
	Via<input name="via" type="text" placeholder="Inserire via della persona">
	Email<input name="email" type="text" placeholder="Inserire email della persona">
	<input type="submit" value="Invia dati">
	</form>
	
</body>
</html>