<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
okay get the address data

<%

String address = request.getParameter("uadd");

out.print(address);
%>


</body>
</html>