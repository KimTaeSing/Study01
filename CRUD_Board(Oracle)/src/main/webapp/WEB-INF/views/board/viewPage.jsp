<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세 페이지 입니다.</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
  <style>
<style type="text/css">
.input_wrap{
	padding: 5px 20px;
}
label{
    display: block;
    margin: 10px 0;
    font-size: 20px;	
}

a{
    display: block;
    margin: 10px 0;
    font-size: 20px;	
}
input{
	padding: 5px;
    font-size: 17px;
}
textarea{
	width: 800px;
    height: 200px;
    font-size: 15px;
    padding: 10px;
}
.btn{
  	display: inline-block;
    font-size: 22px;
    padding: 6px 12px;
    background-color: #fff;
    border: 1px solid #ddd;
    font-weight: 600;
    width: 140px;
    height: 41px;
    line-height: 39px;
    text-align : center;
    margin-left : 30px;
    cursor : pointer;
}
.btn_wrap{
	padding-left : 80px;
	margin-top : 50px;
}

#div_update {
	cursor: pointer;
}
</style>
</head>
<body>
	<h1>뷰 페이지 입니다</h1>

	<div class="input_wrap">
		<label>게시판 번호</label> <input readonly id="div_bno" value='<c:out value="${getInfo.bno }"/>'/>
	</div>

	<div class="input_wrap">
		<label>게시판 제목</label> <input readonly value='<c:out value="${getInfo.title }"/>'/>
	</div>

	<div class="input_wrap">
		<label>게시판 내용</label> <textarea rows="3" cols="" readonly><c:out value="${getInfo.content}"/></textarea>
	</div>

	<div class="input_wrap">
		<label>게시판 작성자</label> <input readonly value='<c:out value="${getInfo.writer }"/>'/>
	</div>

	<div class="input_wrap">
		<label>게시판 등록일</label> <input readonly value='<c:out value="${getInfo.regdate }"/>'/>
	</div>

	<div class="input_wrap">
		<label>게시판 수정일</label> <input readonly value='<c:out value="${getInfo.updatedate }"/>'/>
	</div>
	
	<a class="input_wrap" href="/board/list">게시판 목록으로</a>
	<a class="input_wrap" href='/board/updatePage?bno=<c:out value="${getInfo.bno}"/>'>게시판 수정 페이지</a>
</body>
</html>
<script type="text/javascript">


</script>