<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1> JSP Declarations</H1>
<%-- jsp  注释--%>
<%-- jsp 声明全局变量--%>
<%!
 int accessCount = 0;
%>
<%-- jsp 声明局部变量--%>

<%
int accessCount2=0;
%>
<H2> Access to page server reboot</H2>
<%-- jsp 输出语句，类似于out.println--%>

<%= ++accessCount %>
<br>
<%= ++accessCount2 %>


</body>
</html>