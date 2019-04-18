<jsp:forward page="cal.jsp" />
<!-- JSP Directive -->
<%@ page import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<title>Hello World Page</title>
</head>
<body>
	<jsp:include page="header.html" />

	<div>I am a Div</div>
	<p>I am a beautiful paragraph</p>
	<p>I am a also beautiful paragraph</p>
	<h1>I am dancing heading H1</h1>
	<h1>
		Current Time :
		<!-- JSP Scriplet  -->
		<%
			out.println(LocalDateTime.now());
		%>
	</h1>
	<jsp:include page="footer.html" />

</body>
</html>