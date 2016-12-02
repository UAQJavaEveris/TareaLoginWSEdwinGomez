<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="funciones.js"></script>
</head>
<body>
	<h1>Iniciar Sesión</h1>
		<form method="POST" action="ValidacionLogin" onsubmit="return validarInputLogin()" id="frmLogin">
			<input type="text" name="user" required><br><br>
			<input type="password" name="pw" required><br><br>
			<input type="submit" name="login" value="Entrar">
			<p id="loginMsj"></p>
		</form>
</body>
</html>