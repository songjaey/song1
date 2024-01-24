<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" --%>
<%--@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" --%>
<%--@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" --%>
<%--@ taglib prefix="x"   uri="http://java.sun.com/jsp/jstl/xml" --%>
<%
	String part = "main";
	if( request.getAttribute("part") != null ){
		part = (String)request.getAttribute("part");
	}
%>    

<c:set var="part" value="main" scope="page" />
<c:if test="${prt != null}" >
	<c:set var="part" value="${prt}"/>
</c:if>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 애플반 </title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<link rel="stylesheet" href="http://localhost:8080/static/css/default.css">
<script src="http://localhost:8080/static/js/init.js"></script>

<link rel="stylesheet" href="http://localhost:8080/static/css/${part }.css">
<script src="http://localhost:8080/static/js/${part }.js"></script>


</head>
<body>
	<div id="wrap">
		<%@ include file="header.jsp" %>
		
		<div id="main">
			<c:import url="${part }.jsp" charEncoding="UTF-8"/>
		</div>
		
		<%@ include file="footer.jsp" %>
	</div>
</body>
</html>





<!-- 
	회원가입 - 로그인
	게시판 - 목록, 글쓰기, 수정, 삭제, 댓글
		
	jstl - jsp standard tag library	
	
		core - 변수, 조건문, 반복문
			
 -->