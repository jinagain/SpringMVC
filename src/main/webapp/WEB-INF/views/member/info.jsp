<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>info.jsp</h1>
		
		<h2> model 객체에서 전달된 정보를 꺼내서 사용</h2>
		${memberVO }
		
		<hr>
		<h3>id : ${memberVO.userid }</h3>
		<h3>pw : ${memberVO.userpw }</h3>
		<h3>name : ${memberVO.username }</h3>
		<h3>mail : ${memberVO.useremail }</h3>
		<h3>regdate : ${memberVO.regdate }</h3>
		<h3>updatedate : ${memberVO.updatedate }</h3>
		
		<h2><a href="/member/main">메인페이지로</a> </h2>
	</body>
</html>