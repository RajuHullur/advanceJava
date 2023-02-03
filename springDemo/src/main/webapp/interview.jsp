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
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home_Page</a>
		</div>
	</nav>

	<h2>This is Interiew Details page</h2>
	<form action="attend" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Your_name</label> <input
				type="text" class="form-control" name="Your_name" id="formFile"
				placeholder="Enter Your_name " />
		</div>
		Select your Company Name <select class="form-select"
			aria-label="Default select example" name="company_Name">
			<option selected>Select Company</option>
			<option value="X-workz_BTM">X-workz_BTM</option>
			<option value="X-workz_Raj">X-workz_Raj</option>
			<option value="Both">Both</option>
		</select>
		<div class="mb-3">
			<label for="formFile" class="form-label">Your_Role</label> <input
				type="text" class="form-control" name="role" id="formFile"
				placeholder="Enter your Desired role" />
		</div>


		<input type="submit" value="send" class="btn btn-dark">
	</form>



</body>
</html>