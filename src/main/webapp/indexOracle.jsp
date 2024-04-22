<%@page import="JavaDAO.InstitutoDao"%>
<%@page import="Java.Instituto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Oracle Daydos</title>
<link rel="stylesheet" href="CSS/index.css">
</head>
<body>

<h1>Texto de prueba</h1>

<% Instituto institutojsp = new Instituto (); 

	InstitutoDao institutoDao = new InstitutoDao();
	String id ="1108A";
	institutojsp = institutoDao.getInstituto(id);
	
	out.print("datos test" + id);
	
	
	
	%>

</body>
</html>