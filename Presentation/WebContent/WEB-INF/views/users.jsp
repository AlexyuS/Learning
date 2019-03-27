<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />

</head>
<body>
	<form:form id="mainForm" modelAttribute="userDTO" method="GET">
		<table id="userTable">
			<tr>
				<th><label>ID</label></th>
				<th><label>First Name</label></th>
				<th><label>Surename</label></th>
				<th><label>Age</label></th>
				<th><label>Gender</label></th>
				<th><label>Role</label></th>
				<th><label>Delete</label></th>
			<tr>
				<c:forEach var="user" items="${userDTO.users}" varStatus="status">
					<tr>
						<td><form:input id="id[${status.index}]" path="users[${status.index}].id"></form:input></td>
						<td><form:input id="firstName[${status.index}]" path="users[${status.index}].firstName"></form:input></td>
						<td><form:input id="surename[${status.index}]" path="users[${status.index}].surename"></form:input></td>
						<td><form:input id="age[${status.index}]" path="users[${status.index}].age"></form:input></td>
						<td><form:input id="gender[${status.index}]" path="users[${status.index}].gender"></form:input></td>
						<td><form:input id="role[${status.index}]" path="users[${status.index}].role"></form:input></td>
						<td><form:button  class="deleteButton" id="${user.id}"></form:button>
				</c:forEach>
		</table>
		<form:button class="addUserButton" onclick="window.location.href='/createUser'">AddUser</form:button>

	</form:form>
</body>
<footer>
	<script src="resources/js/libs/jquery-3.3.1.min.js"></script>
	<script src="resources/js/script.js"></script>
</footer>
</html>