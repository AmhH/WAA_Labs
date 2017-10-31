<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<div>
	<c:if test="${errors != null}">
		Errors!
			<ul>
				<c:forEach var="error" items="${errors}">
					<li>${error}</li>
				</c:forEach>
			</ul>
	</c:if>
	
	<form action="calcSave" method="post">
		<input type="text" name="add1" size="2" value="${calculator.add1}" />+ 
		<input	type="text" name="add2" value="${calculator.add2}" size="2" />=
		<input type="text" name="sum" value="${calculator.sum}" size="2" readonly /><br /> 
		<input type="text" name="mult1" value="${calculator.mult1}" size="2" />* 
		<input type="text" name="mult2" value="${calculator.mult2}" size="2" />=
		<input type="text" name="product" value="${calculator.product}" size="2" readonly /><br /> 
		<input type="submit" value="Submit" />
	</form>
	</div>
</body>
</html>