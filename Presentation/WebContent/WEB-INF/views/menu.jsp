<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<link rel="stylesheet" href="resources/css/style.css" type="text/css" />

</head>
<body>
	<div>
		<div class="menuList">
			<p onclick="window.location.href='/Presentation/displayEmployees'">
				Display users
			</p>
			<p onclick="window.location.href='/Presentation/addEmployee'">
				Add user
			</p>
		</div>
	</div>
</body>
<footer>
	<script src="resources/js/libs/jquery-3.3.1.min.js"></script>
	<script src="resources/js/script.js"></script>
</footer>
</html>