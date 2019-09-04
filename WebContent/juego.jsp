<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Juego</title>
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">

		<h2 align="center">Cuadro mágico</h2>
		<h4>Instrucciones:</h4>
		<p>Ingresa los números del 1 al 9, de forma que la suma de las diagonales, sea la misma que los renglones y las columnas.</p>
		
		<form action="./JuegoServlet" method="get"
			class="form-horizontal">
			
			<div class="form-group">
				<div class="col-sm-2">
					<input type="text" name="0" class="form-control">
				</div>
				<div class="col-sm-2">
					<input type="text" name="1" class="form-control">
				</div>
				<div class="col-sm-2">
					<input type="text" name="2" class="form-control">
				</div>
				<div class="col-sm-6">
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-2">
					<input type="text" name="3" class="form-control">
				</div>
				<div class="col-sm-2">
					<input type="text" name="4" class="form-control">
				</div>
				<div class="col-sm-2">
					<input type="text" name="5" class="form-control">
				</div>
				<div class="col-sm-6">
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-2">
					<input type="text" name="6" class="form-control">
				</div>
				<div class="col-sm-2">
					<input type="text" name="7" class="form-control">
				</div>
				<div class="col-sm-2">
					<input type="text" name="8" class="form-control">
				</div>
				<div class="col-sm-6">
				</div>
			</div>
			
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Evaluar</button>
				</div>
			</div>
			
			
		</form>
	
	</div>

</body>
</html>