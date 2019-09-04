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
		<h2 align="center">Shows disponibles</h2>
		<form action="./servlet/TodosParametros" method="post"
			class="form-horizontal">

			<div class="form-group">
				<label class="control-label col-sm-2" for="show">: </label>
				<div class="col-sm-10">
					<input type="text" name="id" class="form-control">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for=""></label>
			</div>


			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">De</button>
				</div>
			</div>

		</form>
	</div>
</body>
</html>

</body>
</html>