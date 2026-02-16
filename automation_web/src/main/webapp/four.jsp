<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
get you friend name

<%

String fri=  request.getParameter("fri");

out.print(fri);

%>

<form action="first.jsp" method="get">

<label>enter your address </label>

<input type="text" name="add"><br><br> 


<input type="submit" value="submit">

</form>

</body>
</html>