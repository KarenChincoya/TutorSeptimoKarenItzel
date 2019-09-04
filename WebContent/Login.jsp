<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

<!-- usuario y contrasena -->
<div class="container">
		<h2 align="center">LOGIN</h2>
		<form action="/Karen1/LoginController" method="get"
			class="form-horizontal">
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="user">Usuario: </label>
				<div class="col-sm-10">
					<input type="text" name="user" class="form-control">
				</div>
			</div>


			<div class="form-group">
				<label class="control-label col-sm-2" for="password">Contraseña:</label>
				<div class="col-sm-10">
					<input type="password" name="password" class="form-control">
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Enviar</button>
				</div>
			</div>

		</form>
	</div>
	
</body>
</html>