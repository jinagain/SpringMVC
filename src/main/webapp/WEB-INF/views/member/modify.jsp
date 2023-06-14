<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>modify.jsp</h1>
		<h2>http://localhost:8088/member/join</h2>
		
		<fieldset>
			<form action="" method="post">
				아이디 : <input type="text" name="userid" value="${memberVO.userid }" readonly> <br>
				비밀번호 : <input type="password" name="userpw" placeholder="insert Password"> <br>
				이름 : <input type="text" name="username" value="${memberVO.username }"> <br>
				이메일 : <input type="text" name="useremail" value="${memberVO.useremail }"> <br>
				<input type="submit" value="수정">
			</form>		
		</fieldset>
	</body>
</html>