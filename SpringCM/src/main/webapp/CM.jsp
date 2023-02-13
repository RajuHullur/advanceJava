<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" />
</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<!-- Navbar content -->
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> </a> <a href="index.jsp">Home</a>

		</div>

	</nav>
	        <h1>welcome to CM Info application</h1>
	<form action="cm" method="post">
		<pre>
           CM Name<input type="text" name="name" />
  
           Party Name<select name="party">
  <option value="">Select</option>
<option>BJP</option>
<option>Congress</option>
<option>JDS</option>
<option>AAP</option>
<option>KJP</option> 
  </select>
           State<select name="state">
  <option value="">Select</option>
  <option>KA</option>
  <option>AP</option>
  <option>TN</option>
  <option>MH</option>
  <option>JK</option>
  <option>DL</option>
  <option>UP</option>
  <option>HR</option>
  <option>HM</option>
  <option>TL</option>
  <option>PH</option>
  <option>RJ</option>

   
            
             <option>DL</option> <option>DL</option>
  </select>

           Tenure<select name="tenure">
 <option value="">Select</option>
 <option>1</option>
 <option>2</option>
 <option>3</option>
 <option>4</option>
 <option>5</option>
  </select>
           PortFolio<textarea rows="5" cols="20" name="portFolio"></textarea>
  </pre>
		                    <input type="submit" value="save" class="btn btn-primary" />
	</form>
</body>
</html>