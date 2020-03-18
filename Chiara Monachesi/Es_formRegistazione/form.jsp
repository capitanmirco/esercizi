<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/Es_formRegistrazione/formserv" method=POST>
	Nome <input type="text" name="nome"> <br>
	Cognome <input type="text" name="cognome"> <br>
	Età <input type="text" name="eta"> <br>
	Città <input type="text" name="citta"> <br>
	Via <input type="text" name="via"> <br>
	Email <input type="text" name="email"> <br>
	
	<input type="submit" value="Invia">
</form>

</body>
</html>