<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Save Employee</title>
<style type="text/css">
@import url(resources/css/main.css);
</style>
</head>
<body>
	<div id="global">
		<h1>List of Employees</h1>

		<table>
			<tr>
				<th>Name</th>
				<th>Address</th>
			</tr>

			<c:forEach var="employee" items="${employees}">
				<tr>
					<td>${employee.firstName}${employee.lastName}</td>
					<td><c:forEach var="address" items="${employee.addresses}">
							<c:out value="${address.city}" />
							<br>
						</c:forEach></td>
				</tr>
				<br>
			</c:forEach>
		</table>

		<form action="/SpringHibernateSole" method="get">
			<input id="submit" type="submit" value="JPA Associations">
		</form>
		
	</div>
</body>
</html>