<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/simplex/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-cRAmF0wErT4D9dEBc36qB6pVu+KmLh516IoGWD/Gfm6FicBbyDuHgS4jmkQB8u1a"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/bmi">
		<div class="form-group">
			<select class="custom-select">
				<c:forEach var="c" items="${ countries }">
					<option value="${c.getLabel()}" name="pickles">${c.getDisplay()}</option>
				</c:forEach>
			</select> <input type="submit" Value="Enter." class="btnbtn-primary"></input>
		</div>
	</form>



</body>
</html>