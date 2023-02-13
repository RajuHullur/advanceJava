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
						area-label="Search">


				</form>
			</div>
		</nav>
	</div>
	<br>

	<div class=container>

		<h1>Save Details of Bakary</h1>
		
		<form action="save" method="get">
		
		<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label">Bakary_Name </label> 
					<input type="text" class="form-control"
					id="formGroupExampleInput" placeholder="Enter Bakary Name"
					name="bakary_Name" />
			</div>
			
			<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label"> Owner_Name</label> 
				<input type="text" class="form-control" id="formGroupExampleInput" placeholder="Enter Owner Name"
					name="owner_Name" />
			</div>
			
			<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label"> Wife_Name</label> <input type="text" class="form-control"
					id="formGroupExampleInput" placeholder="Enter Wife Name"
					name="owner_Wife_Name" />
			</div>
			
			<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label"> Owner_Married</label> 
				Yes : <input type="radio" name="owner_Married" value="true" /> 
				No : <input type="radio" name="owner_Married" value="false" /> 
			</div>
			
			<div class="mb-3">
				<label for="floatingTextarea">Bakary_Famous_For</label>
				<textarea class="form-control"
					id="floatingTextarea" name="famous_For"> </textarea>

			</div>
			<div class="mb-3">
				<label for="formGroupExampleInput" class="form-label">
					Bakary_Since </label> <input type="text" class="form-control"
					id="formGroupExampleInput" placeholder="Enter Since" name="bakary_Since" />
			</div>
			
			<input type="submit" value="Save" class="btn btn-dark" />
			
		</form>
	</div>


</body>
</html>