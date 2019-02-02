<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/btn.css" rel="stylesheet" type="text/css"/>
<!-- <link href="css/background.css" rel="stylesheet" type="text/css"/> -->
<title>Welcome <%=session.getAttribute("regid") %></title>
</head>
<body background="images/homeImg.jpg">
<!-- <div class="container" align="center">
	<section id="content">
<h1 text align='center'>welcome to user page!!!</h1>
<a href="displayservletuser" class="w3-bar-item w3-button" style="color: red;"><h3>display</h3></a><br><br>
<a href="viewshare" class="w3-bar-item w3-button" style="color: red;"><h3>sell</h3></a><br><br>
<a href="displayusershareservlet" class="w3-bar-item w3-button" style="color: red;"><h3>purchase</h3></a><br><br>
<a href="logout" class="w3-bar-item w3-button" style="color: red;">logout</a>
</section></div> -->

<%@include file="Header2.jsp" %>

<h1>Choose the Option</h1>

<div id="buttons">
  <a href="DisplayServletUser" class="btn blue">DISPLAY</a>
  <a href="ViewShare" class="btn green">SELL</a>
  <a href="DisplayUserShareServlet" class="btn red">PURCHASE</a>
  
  
</div>
<footer>
<p>Copyright&copy 2017 <a href="index.jsp" target="_blank" class="link">ShareCHACHA</a></p></footer>
</body>
</html>