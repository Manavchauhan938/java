<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
your education is

<%

String edu =request.getParameter("edu");

out.print(edu);

%>

<form action="five.jsp" method="get">

<label> enter your add</label>
<input type = "text" name=  "add"> <br> <br>


<input type = "submit" value=  "submit">
</body>
</html>