<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
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
			<a href="Search.jsp">Serach By Id</a>
			<a href="index.jsp">home Page</a>
		</div>


	</nav>
    <form action="aeroplane" method="post"  class="container col-12 col-sm-6 col-md-3 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">
	
	<table>
	
	    <c:forEach items="${erros}" var="a">
		<span style="color:red">${a.message}</span><br>
		</c:forEach>
	
	<tr><td>name :</td><td><input type="text" name="name"></td></tr>
	
	<tr><td>Company :</td><td><input type="text" name="company"></td></tr>
	
	
	<tr><td>Cost :</td><td><input type="text" name="cost"></td></tr>
	
	 <tr><td> 
           TYPE :</td><td> <select name="type">
          <option value="">SELECT</option>
          <c:forEach items="${type}" var="p">
          <option value="${p}">${p}</option>
          </c:forEach>
          </select>
          </td></tr>
	
	 <tr><td> 
           country</td><td> <select name="country">
          <option value="">SELECT</option>
          <c:forEach items="${country}" var="a">
          <option value="${a}">${a}</option>
          </c:forEach>
          </select>
          </td></tr>
	
	
	  <tr><td><input type="submit" value="save"/></td></tr>
         
	</table>
	</form>
</body>
</html>