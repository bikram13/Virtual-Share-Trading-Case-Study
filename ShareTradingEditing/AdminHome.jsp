<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/btn.css" rel="stylesheet" type="text/css"/>
<title>Welcome</title>
</head>
<body background="images/homeImg.jpg">
<%@include file="Header2.jsp" %>

<h1>Choose the Option</h1>

<div id="buttons">
  <a href="DisplayServlet" class="btn blue">DISPLAY</a>
  <a href="InsertShare.jsp" class="btn green">INSERT</a>
  <a href="UpdateShare.jsp" class="btn red">UPDATE</a>
  <a href="UpdateUserDetails.jsp" class="btn purple">UPDATE USER DETAILS</a>
  
</div>
<footer>
<p>Copyright&copy 2017 <a href="index.jsp" target="_blank" class="link">ShareCHACHA</a></p></footer>
</body>
</html>