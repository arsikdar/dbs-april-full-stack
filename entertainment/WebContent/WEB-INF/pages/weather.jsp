<!DOCTYPE html>
<html>
<head>
	<title>Weather Page</title>
</head>
<body>
	<%
		String result = "30 degree";
		
		if(request.getAttribute("WEATHER") != null ){
			result = (String) request.getAttribute("WEATHER");
		}
	%>
	<h1>Todays Weather -  <%= result %></h1>
</body>
</html>