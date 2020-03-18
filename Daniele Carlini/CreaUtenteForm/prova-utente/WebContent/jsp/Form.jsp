<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Utente</title>
</head>
<body>

<form action="/prova-utente/provaservlet" method="post">
	<table>
		<tr>
			<td>Nome</td>
			<td><input type="text" name="nome"></td>
		</tr>
		<tr>
			<td>Cognome</td>
			<td><input type="text" name="cognome"></td>
		</tr>
		<tr>
			<td>Eta'</td>
			<td><input type="number" name="eta"></td>
		</tr>
		<tr>
			<td>Citta'</td>
			<td><input type="text" name="citta"></td>
		</tr>
		<tr>
			<td>Via</td>
			<td><input type="text" name="via"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td><input type="submit" values="Iscriviti"></td>
		</tr>	
	</table>
</form>
</body>
</html>