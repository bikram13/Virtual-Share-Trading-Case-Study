<!DOCTYPE html>
<%@ page errorPage="error.jsp" %>
<html>
<head>
<!-- <link href="css/background.css" rel="stylesheet" type="text/css"/> -->
<title>Update Share Details</title>
<link href="css/insert-style.css" rel="stylesheet" type="text/css"/>
</head>
<body background="images/homeImg.jpg">
<!-- <div class="container" >
	<section id="content">
<img src="images/5.jpg" width="200" height="200" align="bottom" border="10" style="border-color: orange; ;">
<img src="images/7.jpg" width="200" height="200" align="right" border="10" style="border-color:white; ;">
<h2 align="center">PURCHASE!</h2>

<form action="PurchaseShareServlet" method="get" style="border:1px solid #ccc">
  <div class="container" align="center">
    
    
    <input class="w3-input" type="text" placeholder="Enter Company Id" name="companyId" required style="width: 210px; "><br>
    
    
    <input class="w3-input" type="text" placeholder="Enter Number Of Shares" name="numberOfShares" required style="width: 210px; "><br>
    
    <div class="clearfix">
      <button class="w3-button w3-light-grey w3-block">Purchase</button><br>
      
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
    <form class="form" id="form1" action="PurchaseShareServlet" method="get">
      
      <p class="name">
        <input name="companyId" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="Company Id" id="name" />
      </p>
      
       <p class="name">
        <input name="numberOfShares" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="Number of Shares" id="name" />
      </p>
      <div class="submit">
        <input type="submit" value="Purchase Shares" id="button-blue"/>
        <div class="ease"></div>
      </div>
      
      <!-- <div class="submit">
        <input type="submit" value="Cancel" id="button-blue" formaction="UserHome.jsp"/>
        <div class="ease"></div>
      </div> -->
    </form>
  </div></div>
  
  <footer>
<p>Copyright&copy 2017 <a href="index.jsp" target="_blank" class="link">ShareCHACHA</a></p></footer>
</body>
</html>
