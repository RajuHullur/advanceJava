<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Please Register</title>
</head>
<body>
<h1>Send Details for your favourite person</h1>
<form action="friend" method="POST">
<pre>

 First Name<input type="text" name="fname"/>
Last Name  <input type="text" name="lname"/>
Gender  Male   <input type="radio" name="gender" id="male"  value="male"/>
       Female  <input type="radio" name="gender" id="female"  value="female"/>
       Other   <input type="radio" name="gender" id="other"   value="other"/>
 
   reason   <textarea rows="5" cols="15" name="reason"  placeholder="reason"></textarea> 
  address   <textarea rows="5" cols="15" name="address"placeholder="address" ></textarea>
        
   
<input type="submit" value="send" />
</pre>
</form>

</body>
</html>