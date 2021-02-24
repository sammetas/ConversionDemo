<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<body>
	<div>
		<div>
			<h1>Result page</h1>
			<h2> </h2>

			 <c:forEach items="${listMap}" var="xchangeRate">
                         ${xchangeRate.key} :  <b>${xchangeRate.value}</b>
                   </c:forEach>
			<br><br><br>
			Click on this <strong><a href="/">link</a></strong> to visit previous page.
		</div>
	</div>
</body>
</html>
