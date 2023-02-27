<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Waterpurifier </title>
<!-- <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1"> -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="C:\Users\HP\Pictures\0b6b38bb-4f67-416f-983d-61faaf6d95bb.jpg"
				height="80" width="60"> </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a href="index.jsp">home Page</a>

		</div>


	</nav>
	
	<form action="searchbyId" method="get" class="container col-12 col-sm-6
	 col-md-3 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg m-5 pb-5 bg-info">
	
<per>
Serach By Id <input type="search" name="id">
<input type="submit" value="search"><br>
<h1>Result of searching</h1><br>
<h3>Name :${dto.name}</h3><br>
<h3>Brand:${dto.brand}</h3><br>
<h3>color:${dto.color}</h3><br>
<h3>Material :${dto.material}</h3><br>
<h3>Capacity :${dto.capacity}</h3><br>
</per>
</form>

</body>
</html>