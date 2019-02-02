<!DOCTYPE html>
<%@ page errorPage="error.jsp" %>
<html>
<head>
<title>Update Share Details</title>
<link href="css/insert-style.css" rel="stylesheet" type="text/css"/>
</head>
<body background="images/homeImg.jpg">
<!-- <div class="container" > -->
<!-- <h2 align="center">REGISTER HERE!</h2>
	<section id="content">
	<div align="center">
	<img src="8.jpg" width="200" height="200" border="10" style="border-color:skyblue; ;">
	</div>

<br><br>
<form action="UpdateUserDetailsServlet" method="get" style="border:1px solid #ccc">
  <div class="container" align="center">
    
    
    <input type="text" class="w3-input" placeholder="Enter Registration Id" name="regId" required style="width: 210px; "><br>
    
    
    
    <input type="text" class="w3-input" placeholder="Enter New Status" name="status" required style="width: 210px; "><br>


    
    <input type="password" class="w3-input" placeholder="Enter New Password" name="password" required style="width: 210px; "><br>

    <div class="clearfix">
    
      <button class="w3-button w3-light-grey w3-block">Update</button><br>
     
    </div>
  </div>
</form>
<form action="HomePage.jsp">
<button class="w3-button w3-light-grey w3-block">Cancel</button><br>
</form>
</div> -->

<%@include file="Header2.jsp" %>

<div id="form-main">
  <div id="form-div">
    <form class="form" id="form1" action="UpdateUserDetailsServlet" method="post">
      
      <p class="name">
        <input name="regId" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="Registration Id" id="name" />
      </p>
      
       <p class="name">
        <input name="status" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="New Status" id="name" />
      </p>
      
      <p class="name">
        <input name="password" type="password" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="New Password" id="name" />
      </p>
      
      
      <div class="submit">
        <input type="submit" value="UPDATE" id="button-blue"/>
        <div class="ease"></div>
      </div>
    </form>
  </div></div>
  
  <footer>
<p>Copyright&copy 2017 <a href="index.jsp" target="_blank" class="link">ShareCHACHA</a></p></footer>
</body>
</html>
