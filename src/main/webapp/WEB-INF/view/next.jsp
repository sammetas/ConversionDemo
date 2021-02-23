<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<body>
	<div>
		<div>
			<h1>Result page</h1>
			<h2>Hello ${message}</h2>

			 <c:forEach items="${listMap}" var="xchangeRate">
                         ${xchangeRate.key} ${xchangeRate.value}
                   </c:forEach>
			<br><br>
			Click on this <strong><a href="/">link</a></strong> to visit previous page.
		</div>
	</div>
</body>
</html>
