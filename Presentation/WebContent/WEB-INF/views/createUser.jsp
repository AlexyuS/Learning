<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />

</head>
<body>
	<form:form id="mainForm" modelAttribute="user" method="PUT"
		action="/specialUsers">

		<form:label path="firstName"></form:label>
		<form:input path="firstName"></form:input>
		
		<form:label path="surename"></form:label>
		<form:input path="surename"></form:input>
		
		<form:label path="age"></form:label>
		<form:input path="age"></form:input>
		
		<form:label path="gender"></form:label>
		<form:input path="gender"></form:input>
		
		<form:label path="role"></form:label>
		<form:input path="role"></form:input>
		
		<form:button class="create"></form:button>
		<form:button class="back"></form:button>
		
	</form:form>
</body>
<footer>
	<script src="resources/js/libs/jquery-3.3.1.min.js"></script>
	<script src="resources/js/script.js"></script>
</footer>
</html>