<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>sari bidu</p>
<%! static  int pagecount=0; %>
<% 

if(request.getParameter("password").equals("123123") ) 
{pagecount++;
out.println("number of times you have been logged in:" + pagecount);
out.println(request.getParameter("name"));
out.println(request.getParameter("password"));
}
else
{out.println("login failed");

	}
%>
<form action="RequestDemo.jsp" >
<input type="submit">
</form>

</body>
</html>