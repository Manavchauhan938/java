<%@ page import="com.dao.dao3" %>
<jsp:useBean id="a" class="com.pojo.pojo3"></jsp:useBean>
<jsp:setProperty property="*" name="a"/>

<% 

dao3.datainsert(a);

%>