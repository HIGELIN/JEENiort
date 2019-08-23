<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Secondaire</title>
</head>
<body style="color:${couleurChoisie}">
<%@ include file="WEB-INF/jsp/header.html"%>
<p>Une jsp pas très utile</p>
<jsp:include page="WEB-INF/jsp/footer.jsp">
	<jsp:param value="JspBidon" name="filename"/>
</jsp:include>
</body>
</html>