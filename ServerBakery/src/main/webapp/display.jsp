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
	<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid" hight="80px" width="80px">

				<form class="d-flex">
					<input class="form-control me-3" type="search" placeholder="Search"
						aria-label="Search"> <a class="btn btn-outline-primary"
						href="index.jsp">HOME_Page</a>

				</form>
			</div>
		</nav>
	</div>
	<div>
		<h1>Bakery detailes are</h1>
		<label>Bakery Name : ${bakery.bakary_Name}</label> </br> 
		<label>Bakery Owner Name : ${bakery.owner_Name}</label></br> 
		<label>Bakery Wife Name : ${bakery.owner_Wife_Name}</label> </br> 
		<label>Bakery Married : ${bakery.owner_Married}</label></br> 
		<label>Bakery Famous For : ${bakery.famous_For}</label> </br> 
		<label>Bakery Since : ${bakery.bakary_Since}</label>

	</div>

</body>
</html>