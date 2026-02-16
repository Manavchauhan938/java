<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

okay get you data

<%
String name= request.getParameter("uname");
String email= request.getParameter("uemail");

out.print(name +" "+ email);

%>

<form action="three.jsp" method="get">
<label>enter your edu </label>

<input type="text" name="edu"><br><br> 


<input type="submit" value="submit">

</form>
</body>
</html>