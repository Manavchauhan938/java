<%@ page import="com.dao.dao1" %>
<jsp:useBean id="m" class="com.pojo.pojo1"></jsp:useBean>
<jsp:setProperty property="*" name="m"/>

<%
dao1.datainsert(m);
%>