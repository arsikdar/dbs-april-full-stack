<!DOCTYPE html>
<html>
<head>
	<title>News Page</title>
</head>
<body>
	<%
		String result = (String) request.getAttribute("BREAKING-NEWS");
	%>
	<h1>Breaking News -  <%= result %></h1>
</body>
</html>