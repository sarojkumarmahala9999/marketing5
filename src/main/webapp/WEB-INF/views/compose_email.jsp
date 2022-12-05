<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Sending</title>
</head>
<body>
	<form action="SendEmailBody" method="post">
	<pre>
		To <input type = "text" name = "to" value = "${email}"/>
		Subject <input type = "text" name = "subject"/>
		<textarea name="emailBody" rows="5" cols="50">
			
		</textarea>
		<input type = "Submit" value = "Send"/>
	</pre>
	</form>
	
</body>
</html>