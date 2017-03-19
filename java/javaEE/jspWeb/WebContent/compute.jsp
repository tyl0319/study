<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String value1 = request.getParameter("value1");
    String value2 = request.getParameter("value2");
%>
<%
  if( request.getParameter("compute").equals("division") ){
%>
<jsp:include page="divide.jsp" flush="true">
 <jsp:param name="v1" value="<%= value1 %>"/>
 <jsp:param name="v2" value="<%= value2 %>"/>
</jsp:include>
<% } else {%>
<%//@ include file="multiply.jsp" %>
<%} %>
</body>
</html>