<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
		<h2 align="center">Formulario</h2>
		<form action="./KRegister" method="get"
			class="form-horizontal">

			
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Correo: </label>
				<div class="col-sm-10">
					<input type="email" name="email" class="form-control">
				</div>
			</div>
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="password">Contraseña: </label>
				<div class="col-sm-10">
					<input type="password" name="password" class="form-control">
				</div>
			</div>
			
		
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Registrars</button>
				</div>
			</div>
			
			
		</form>
	
	</div>


</body>
</html>