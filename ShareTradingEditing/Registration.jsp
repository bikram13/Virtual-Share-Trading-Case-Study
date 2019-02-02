<!DOCTYPE html>
<%@ page errorPage="error.jsp" %>
<html>

<head>
<link href="css/background.css" rel="stylesheet" type="text/css"/>
</head>
<body background="images/stock-market-invest.jpg">
<div class="container">
	<section id="content">
<h2 align="center">REGISTER HERE!</h2>

<div align="center">
<img src="images/register.jpg" width="300" height="250">
</div>
<br><br>
<form action="InsertUserServlet" method="post" style="border:1px solid #ccc">
  <div class="container" align="center">
    
    
    <input type="text" class="w3-input" placeholder="Enter Registration Id" name="regId" required style="width: 210px; " ><br>
    
    
    
    <input type="text" class="w3-input" placeholder="Enter Name" name="name" required style="width: 210px; "><br>
    
    
    <input type="text" class="w3-input" placeholder="Enter Mobile Number" name="mobileNo" required style="width: 210px; "><br>
    
  
   
    <input type="text" class="w3-input" placeholder="Enter Email" name="emailId" required style="width: 210px; "><br>

    
    <input type="password" class="w3-input" placeholder="Enter Password" name="password" required style="width: 210px; "><br><br>

    <div class="clearfix">
      <button class="w3-button w3-light-grey w3-block">Register</button><br>
      
    </div>
  </div>
</form>
<form action="HomePage.jsp">
<button class="w3-button w3-light-grey w3-block">Cancel</button><br>
</form>
</section></div>
</body>
</html>
