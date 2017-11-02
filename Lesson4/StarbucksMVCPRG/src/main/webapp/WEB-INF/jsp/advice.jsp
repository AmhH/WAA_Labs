<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
<title>Starbuck's</title>
</head>
<body>
<c:choose>
	<c:when test="${user eq null }">
		You need to login to get Strabuck's Advice
		<form action="login" method="get">
			<label><input type="submit" value="Login" /></label>
		</form>
	</c:when>
	<c:otherwise>
		<h4>Hi ${user.name }</h4>
		<h2>Ask for advice about your favorite roast:</h2>

		<p />
		<form action = "advice" method="post">
			<select name="roastKey"   >
				<option>--Select Roast--</option>
			  		<c:forEach var="roast" items="${roasts}">
			    		<option value="${roast.key}" > ${roast.value}</option>
					</c:forEach>
		
			</select>
		
		<p><input type="submit" value = "Submit"/></p>
		</form>
		<form action="logout" method="get">
			<label><input type="submit" value="Logout" /></label>
		</form>
	</c:otherwise>
</c:choose>

  
 </body>
</html>