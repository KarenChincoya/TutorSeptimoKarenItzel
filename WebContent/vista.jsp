<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VISTA</title>
</head>
<body bgcolor="#FDFEEE">

	<center>
		<h1>Registrar Empleados</h1>		
		<form action="./servlet/EmpleadoControlador">

			Nombre: <input type="text" name="nombre"><br> 
			Id: <input type="text" name="id"><br> 
			<input
				type="checkbox" name="activo" value="true">¿Activo?<br>
			<center>
				<input type="submit" value="Enviar">
			</center>

		</form>
	</center>

</body>
</html>