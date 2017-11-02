<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
<h2>${param.greeting}</h2>
<h2>Calculator Results</h2>
	<form action="calculator" method="get">
		<input type="text" name="add1" readonly value="${calculator.add1}" />+ 
		<input	type="text" name="add2" readonly value="${calculator.add2}" />=
		<input type="text" name="sum" readonly value="${calculator.sum}" /><br /> 
		<input type="text" name="mult1" readonly value="${calculator.mult1}" />* 
		<input type="text" name="mult2" readonly value="${calculator.mult2}"  />=
		<input type="text" name="product" value="${calculator.product}" readonly /><br /> 
		
		<input type="submit" value="Try Again" />
	</form>

</body>
</html>