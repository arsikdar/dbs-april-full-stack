<!DOCTYPE html>
<html>
<head>
<title>Calculator Page</title>
</head>
<body>
	<jsp:include page="header.html" />
	<h1>
		Unique Number :
		<%
		out.println(Math.random());
	%>
	</h1>
	<h1>
		Unique Number :
		<%=Math.random()%></h1>
	<h1>
		Multiply :
		<%=40 * 4%></h1>
	<h1>
		Result :
		<%
		response.setContentType("text/html");
		int i = Integer.parseInt(request.getParameter("valOne"));
		int j = Integer.parseInt(request.getParameter("valTwo"));
		int rs = i + j;
		out.println(rs);
	%>
	</h1>
	
	<h1>${Math.random()}</h1>
	<h1>${"Ritesh".toUpperCase()}</h1>
	<h1>${"Ritesh".toLowerCase()}</h1>
	<h1>SUM : ${12 + 4}</h1>
	<h1> SUM : <%= Integer.parseInt(request.getParameter("valOne"))+Integer.parseInt(request.getParameter("valTwo")) %></h1>
	<h1> SUM : <%= i+j %></h1>
	<h1> SUM : <%= rs %></h1>
	<jsp:include page="footer.html" />
</body>
</html>