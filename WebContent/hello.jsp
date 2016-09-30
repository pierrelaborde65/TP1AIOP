<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HELLO JSP</title>
</head>
<body>
	<% 
	String Name = request.getParameter("name");
	out.println("Hello " + Name);
	%>
	<FORM Method="POST" Action="http://localhost:8080/jee-aiop/Hello">
		
		Name : <INPUT type=text size=20 name=name><BR>
			   <INPUT type=submit value=Submit>
	</FORM>	
</body>
</html>