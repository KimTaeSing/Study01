<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>게시판 등록</h1>

	<form action="/board/enroll" method="post">
		<div>
			<label>title</label> <input type="text" name="title">
		</div>
		<div>
			<label>content</label> <input type="text" name="content">
		</div>
		<div>
			<label>writer</label> <input type="text" name="writer">
		</div>
		<button>전송</button>
	</form>

</body>
</html>