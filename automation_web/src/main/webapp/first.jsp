<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String add= request.getParameter("add");

out.print(add);

%>
<form action="two.jsp" method="get">
<label>enter your name </label>

<input type="text" name="uname"><br><br> 


<label>enter your email </label>

<input type="email" name="uemail"><br><br> 

<input type="submit" value="submit">

</form>

</body>
</html>