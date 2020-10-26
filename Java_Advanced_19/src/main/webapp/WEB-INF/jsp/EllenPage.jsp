<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Ellen Page

	<form enctype='multipart/form-data' method="post" id="uploadForm"
		name="uploadForm" action="/register">
		<input id="fileUploadInput" type="file" name="photo" required /><br> <label>Name<input
			type="text" name="name"></label> <br> <label>Surname<input
			type="text" name="surname"></label> <br> <label>Age<input
			type="text" name="age"></label> <br> 
		<button type="submit">Submit</button>
	</form>

</body>
</html>