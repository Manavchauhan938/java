<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

retrive information

<%
String name = request.getParameter("uname");
String email = request.getParameter("uemail");

out.print(name+" "+email);

%>

<form action="ten.jsp" method="get">

<label>enter your address </label>
<input type="text" name="uadd"><br> <br>

<input type="submit" name="submit">

</form>

</body>
</html>