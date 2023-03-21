<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 목록</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
<body>
	<h1>게시글 목록 페이지입니다.</h1>
	<a href="/board/enroll">게시판 등록하러 가기</a>
</body>
</html>
<script>
	$(function(){
		let result = '<c:out value="${result}"/>';
		if(result === "success"){
			alert("게시글 등록 완료 !");
		}else{
			
		}
		
	})
</script>