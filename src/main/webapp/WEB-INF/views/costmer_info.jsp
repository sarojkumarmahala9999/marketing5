<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Costmer Information</title>
</head>
<body>
	<h2>Costmer Info..</h2>
		First Name : ${cost.firstName}<br/>
		Last Name : ${cost.lastName}<br/>
		Email : ${cost.email}<br/>
		Mobile : ${cost.mobile}<br/>
		Source : ${cost.source}<br/>
		
		<form action="sendEmail" method="post">
			<input type = "hidden" name = "email" value = "${cost.email}">
			<input type = "submit" value = "SEND EMAIL"/>
		</form>
</body>
</html>