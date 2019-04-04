<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />

</head>
<body>
	<form:form id="mainForm" modelAttribute="modelDTO" method="POST"
		action="/Presentation/">
		<table id="userTable">
			<tr>
				<th><label>Role</label></th>
				<th><label>ID</label></th>
				<th><label>First Name</label></th>
				<th><label>Surename</label></th>
				<th><label>Age</label></th>
				<th><label>Gender</label></th>
				<th><label>Creation At</label></th>
				<th><label>Created By</label></th>
				<th><label>Last Modified At</label></th>
				<th><label>Last Modified By</label></th>
				<th><label>User Name</label></th>
				<th><label>Job Type</label></th>
				<th><label>Delete</label></th>
				<th><label>Edit</label></th>
			<tr>
				<c:forEach var="employee" items="${modelDTO.employee}"
					varStatus="status">
					<tr>
						<td><div class="${employee.roleName}Icon"></div></td>
						<td><label id="id[${status.index}]"></label>${employee.id}</td>
						<td><label id="firstName[${status.index}]">${employee.firstName}</label></td>
						<td><label id="surename[${status.index}]">${employee.surename}</label></td>
						<td><label id="age[${status.index}]">${employee.age}</label></td>
						<td><label id="gender[${status.index}]">${employee.gender}</label></td>
						<td><label id="createdAt[${status.index}]">${employee.createdAt}</label></td>
						<td><label id="createdBy[${status.index}]">${employee.createdBy}</label></td>
						<td><label id="modifiedAt[${status.index}]">${employee.lastModifiedAt}</label></td>
						<td><label id="modifiedBy[${status.index}]">${employee.lastModifiedBy}</label></td>
						<td><label id="username[${status.index}]">${employee.username}</label></td>
						<td><label id="jobType[${status.index}]">${employee.jobType}</label></td>
						<td><form:button class="deleteButton" id="${employee.id}"></form:button>
						<td><form:button class="editButton" id="${employee.id}"></form:button>
				</c:forEach>
		</table>
		<form:button>Back</form:button>
	</form:form>
</body>
<footer>
	<script src="resources/js/libs/jquery-3.3.1.min.js"></script>
	<script src="resources/js/script.js"></script>
</footer>
</html>