<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SHARECHACHA</title>
<link href="css/main-style.css" rel="stylesheet" type="text/css" />
<style type="text/css">
footer {
		position: absolute;
		right: 0;
		bottom: 0;
		left: 0;
		padding: 1rem;
	background-color: #444;
	text-align: center;
	height: 50px;
}
.link {
	text-decoration: none;
	color: #e16262;
	border-bottom: 2px dotted #55acee;
	transition: .3s;
	-webkit-transition: .3s;
	-moz-transition: .3s;
	-o-transition: .3s;
	cursor: url(http://cur.cursors-4u.net/symbols/sym-1/sym46.cur), auto;
}
</style>
</head>
<body background="images/homeImg.jpg">

	<%@include file="Header1.jsp"%>
	<div align="center" style="margin-top: 75px; width: 100%;">
		<iframe frameborder="0"
			src="http://www.indianotes.com/widgets/indices-ticker/index.php?type=indices-ticker&w=500"
			width="500" height="100" scrolling="no"></iframe>
	</div>
	<div id="wrapper" align="center">
		<div id="first">
			<iframe frameborder="0"
				src="http://www.indianotes.com/widgets/equity-reports/index.php?w=300&h=250"
				width="300" height="250"></iframe>
		</div>
		<div id="second">
			<iframe frameborder="0"
				src="http://www.indianotes.com/widgets/mutual-fund-reports/index.php?w=300&h=250"
				width="300" height="250"></iframe>
		</div>
		<div id="third">
			<iframe frameborder="0"
				src="http://www.indianotes.com/widgets/economy-reports/index.php?w=300&h=250"
				width="300" height="250"></iframe>
		</div>
	</div>
	<footer>
	<p>
		Copyright&copy 2017 <a href="index.jsp" target="_blank" class="link">ShareCHACHA</a>
	</p>
	</footer>
</body>
</html>