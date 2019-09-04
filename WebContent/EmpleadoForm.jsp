<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario de empleado</title>
</head>
<body bgcolor="#FDFEEE">

	<center>
		<h1>Registro de datos relacionados al empleado</h1>		
		<form action="./servlet/EmpleadoServlet">
			Nombre: <input type="text" name="name"><br> Empleado id:
			<input type="text" name="employeeID"><br> Número de
			hijos: <input type="text" name="numChildren"><br> <input
				type="checkbox" name="married" value="true">¿Casado?<br>
			<center>
				<input type="submit" value="Enviar">
			</center>
		</form>
	</center>

</body>
</html>