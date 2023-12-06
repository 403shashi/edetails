<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Details</title>
</head>
<body bgcolor=green>
<c:if test="${result==1}">
 BOOK DATA INSERTED SUCCESSFULLY
 <a href="Home.html">Click here for HomePage</a>
</c:if>
<c:if test="${result==0}">
DATA INSERTION IS FAILED..TRY AGAIN
<jsp:include page="Savebook.html"></jsp:include>
</c:if>
</body>
</html>