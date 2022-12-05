<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Costmers</title>
</head>
<body>
	<h2>Create Costmer Here...</h2>
	<form action="saveCostmer" method="post">
		<pre>
			First Name <input type = "text" name = "firstName"/>
			Last Name <input type = "text" name = "lastName"/>
			Email <input type = "text" name = "email"/>
			Mobile <input type = "text" name = "mobile"/>
			Source : <select name="source" >
				  <option value="radio">Radio</option>
				  <option value="tv ads">TV Ads</option>
				  <option value="news paper">News Paper</option>
				  <option value="website">Web site</option>
				</select>
				<input type = "Submit" value = "Save">
		</pre>
	</form>
</body>
</html>