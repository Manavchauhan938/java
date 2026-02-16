<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

youe edu is nice

<%

String edu = request.getParameter("edu");

out.print(edu);

%>

<form action="four.jsp" method="get">

<label>enter your friend </label>

<input type="text" name="fri"><br><br> 


<input type="submit" value="submit">

</form>
</body>
</html>