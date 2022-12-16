<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!doctype html>
<head>
    <title>Error JSP</title>
</head>

<h2>Well, life goes on ... </h2>

<h2><%= request.getAttribute("javax.servlet.error.message")%> </h2>

<h2><%= new String("123123") %> </h2>

<h2><c:out value="${request.getAttribute('javax.servlet.error.message')}" /></h2>

<jsp:scriplet>
    out.println("213");
</jsp:scriplet>


</body>
</html>