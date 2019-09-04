<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Empleado form</title>
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2 align="center">Ejemplo de FORMULARIO usando POST</h2>
		<form action="./servlet/EmpleadoServlet" method="get"
			class="form-horizontal">

			<div class="form-group">
				<label class="control-label col-sm-2" for="name">Nombre: </label>
				<div class="col-sm-10">
					<input type="text" name="name" class="form-control">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="id">Id: </label>
				<div class="col-sm-10">
					<input type="text" name="id" class="form-control">
				</div>
			</div>



			<div class="form-group">
				<label class="control-label col-sm-2" for="numHijos">Número
					de hijos: </label>
				<div class="col-sm-10">
					<input type="text" name="numHijos" class="form-control">
				</div>
			</div>


			<div class="form-group">

				<label class="control-label col-sm-2" for="numTdc">¿Casado?
				</label>

				<div class="col-sm-10">
					<div class="checkbox">
						<label><input type="radio" name="casado" value="false"></label>
					</div>
				</div>

				<!--  
				<div class="col-sm-10">
					<input type="password" name="numTdc" class="form-control">
				</div>
				-->
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