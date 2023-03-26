<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 수정 페이지 입니다.</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"
	integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
	crossorigin="anonymous"></script>
<style>
<
style type ="text /css ">.input_wrap {
	padding: 5px 20px;
}

label {
	display: block;
	margin: 10px 0;
	font-size: 20px;
}

a {
	display: block;
	margin: 10px 0;
	font-size: 20px;
}

input {
	padding: 5px;
	font-size: 17px;
}

textarea {
	width: 800px;
	height: 200px;
	font-size: 15px;
	padding: 10px;
}

.btn {
	display: inline-block;
	font-size: 22px;
	padding: 6px 12px;
	background-color: #fff;
	border: 1px solid #ddd;
	font-weight: 600;
	width: 140px;
	height: 41px;
	line-height: 39px;
	text-align: center;
	margin-left: 30px;
	cursor: pointer;
}

.btn_wrap {
	padding-left: 80px;
	margin-top: 50px;
}

#div_update {
	cursor: pointer;
}
</style>
</head>
<body>
	<h1>수정 페이지 입니다</h1>
	<div class="input_wrap">
		<label>게시판 번호</label> <input name="input_bno" id="input_bno">
	</div>

	<div class="input_wrap">
		<label>게시판 제목</label> <input name="input_title" id="input_title">
	</div>

	<div class="input_wrap">
		<label>게시판 내용</label>
		<textarea rows="3" cols="" name="" id="input_content"></textarea>
	</div>

	<div class="input_wrap">
		<label>게시판 작성자</label> <input name="input_writer" id="input_writer">
	</div>

	<div class="input_wrap">
		<label>게시판 등록일</label> <input name="input_regdate" id="input_regdate">
	</div>

	<div class="input_wrap">
		<label>게시판 수정일</label> <input name="input_updatedate" id="input_updatedate">
	</div>

	<a class="input_wrap" href="/board/list">게시판 목록으로</a>
	<button onclick="update();">수정</button>
	<button onclick="del_board();">삭제</button>
</body>
</html>
<script type="text/javascript">

//	주소창 파라미터 값 가져오는 함수.
const urlParams = new URL(location.href).searchParams;
const bno = urlParams.get('bno');

// 수정 페이지 해당 게시판 데이터 가져오는 함수 (AJax 통신)
	$(function(result){
		console.log("bno : " + bno);
		$.ajax({
			type : "post",
			url : "/board/updatePage",
			dataType : "json",
			data : {
				"bno" : bno
			},
			success : function(result) {
				let b_result = result.list[0];
				// each문으로 반복문 돌리고 key,value 값 추출 해 해당 key값에 맞는 value 값을 넣었음 !
				$.each(b_result, function(key, value) {
					$("#input_"+key).val(value);
					
				});
			}
		});
		
	});
	
// 게시글 삭제 버튼 함수z	
function del_board(){
	$.ajax({
		type : "post",
		url : "/board/del_board",
		dataType : "json",
		data : {
			"bno" : bno
		},
		success : function(result) {
			
		}
	});
}
	

// 게시글 업데이트 버튼 함수
	function update() {
		let bno = $("#hidden_bno").val();
		alert(bno);
	}
</script>