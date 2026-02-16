<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 your details is
<%

String name = request.getParameter("name");
String email = request.getParameter("email");
String password = request.getParameter("pass");

 out.print(name+" "+email +" "+password);

%>

<form action="seven.jsp" method="get">

<label> enter your edu</label>
<input type = "text" name=  "edu"> <br> <br>


<input type = "submit" value=  "submit">


</form>
</body>
</html>