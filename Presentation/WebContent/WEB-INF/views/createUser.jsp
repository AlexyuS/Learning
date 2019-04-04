<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />

</head>
<body>
	<form:form id="mainForm" modelAttribute="employee" action="/Presentation"
		method="GET">
		<div>
			<div>
				<p>
					<form:label path="username">Username</form:label>
					<form:input path="username"></form:input>
				<p>
					<form:label path="username">Password</form:label>
					<form:password path="username"></form:password>
				<p>
					<form:label path="jobType">JobType</form:label>
					<form:select path="jobType">
						<form:options items="${jobType}"></form:options>
					</form:select>
				<p>
					<form:label path="firstName">FirstName</form:label>
					<form:input path="firstName"></form:input>
				<p>
					<form:label path="surename">Surename</form:label>
					<form:input path="surename"></form:input>
				<p>
					<form:label path="age">Age</form:label>
					<form:input path="age"></form:input>
				<p>
					<form:label path="gender">Gender</form:label>
					<form:select path="gender">
						<form:options items="${genderList}"></form:options>
					</form:select>
				<p>
					<label>Role</label>
					<form:select path="" id="role">
						<form:options items="${roleList}"></form:options>
					</form:select>
			</div>
		</div>
		<div>
			<form:button class="createUser">Create</form:button>
			<form:button class="back">Back</form:button>
		</div>





	</form:form>
</body>
<footer>
	<script src="resources/js/libs/jquery-3.3.1.min.js"></script>
	<script src="resources/js/libs/jquery.serializeObject.js"></script>
	<script src="resources/js/script.js"></script>

</footer>
</html>