<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>login.jsp</h1>
		<form method="post">
			ID : <input type="text" name="userid"> <br>
			PW : <input type="text" name="userpw"> <br>
			<input type="button" value="회원가입" onclick="location.href='/member/join';">
			<input type="submit" value="Login"> <br>
		</form>
	</body>
</html>