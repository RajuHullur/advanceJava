<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Waterpurifier</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" 
integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
crossorigin="anonymous">

<script 
  src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
  integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" 
  crossorigin="anonymous">
</script>
</head>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
     src = "‪‪C:\Users\HP\Pictures\f0b79380-0e5d-4b05-b2a0-36e7e6bc1159.jpg"
     alt = "" width = "80" height = "48" class = "d-line-block align-text-top" > 
 </a>
 <a href = "index.jsp"> Home </a>

 </div>
 </nav>
 
 <h1> Waterpurifier saved operation </h1>
 
 <form action = "water" method = "Post">
 <pre> 
 Name<input type = "text" name = "Name"/>
 Brand <input type = "text" name = "Brand"/>
 Color <input type = "text" name = "Color"/>
 Material <input type="text" name="Material">  
capacity <input type = "text" name = "capacity"/>
<input type = "submit" value = "Send"/>
</pre>
</form>
</body>
</html>