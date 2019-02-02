

<!DOCTYPE html>
<%@ page errorPage="error.jsp" %>
<html>
<head>
<title>Update Share Details</title>
<link href="css/insert-style.css" rel="stylesheet" type="text/css"/>
</head>
<body background="images/homeImg.jpg">

<%@include file="Header2.jsp" %>

<div id="form-main">
  <div id="form-div">
    <form class="form" id="form1" action="UpdateShareServlet" method="post">
      
      <p class="name">
        <input name="numberOfShares" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="Number of Shares" id="name" />
      </p>
      
       <p class="name">
        <input name="priceOfShare" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="Share price" id="name" />
      </p>
      
      <p class="name">
        <input name="companyId" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="Company ID" id="name" />
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
