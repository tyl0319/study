<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#FFFFFF">
<center>
<H1>
<%
 try{
	 float dividend = Float.parseFloat(request.getParameter("v1"));
	 float divisor = Float.parseFloat(request.getParameter("v2"));
	 double  result = dividend/divisor;
	 out.println(result);
 }
catch(Exception ex)
{
out.println("not invalid");	
}
%>
</H1>
</center>>
</body>
</html>