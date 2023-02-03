<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h2>This is food item page</h2>
	<form action="food" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Food name</label> <input
				type="text" class="form-control" name="foodname" id="formFile"
				placeholder="Enter your food name" />
		</div>
		Select your food type <select class="form-select"
			aria-label="Default select example" name="type">
			<option selected>Select your type of food</option>
			<option value="1">Veg</option>
			<option value="2">Non_Veg</option>
			<option value="3">Both</option>
		</select>
		<div>
			<label for="customRange2" class="form-label">Quantity</label> <input
				type="range" class="form-range" min="0" max="10" name="quantity"
				id="customRange2">
		</div>
		<div class="mb-3">
			<label for="formFile" class="food">Price</label> <input
				class="form-control" name="price" type="text" id="foodname"
				placeholder="Enter your food Price" name="price">
		</div>
		<input type="submit" value="send" class="btn btn-dark">
	</form>

</body>
</html>