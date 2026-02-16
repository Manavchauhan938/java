<%@ page  import="com.dao.dao"%>
<jsp:useBean id="d" class="com.pojo.pojo"></jsp:useBean>
<jsp:setProperty property="*" name="d"/>

<%

dao.datainsert(d);
%>
