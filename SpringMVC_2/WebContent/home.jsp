<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>


	<a href="http://localhost:8080/SpringMVC_2/T1/index_">http://localhost:8080/SpringMVC_2/index_</a>
	<br />
	<form action="http://localhost:8080/SpringMVC_2/T1/index_">
		<input type="submit" value="提交" />
	</form>
	
	<!--  -->
	<h1>发送PUT请求</h1>
	<form action="http://localhost:8080/SpringMVC_2/student/100" method="POST">
		<!-- PUT请求 -->
		<input type="hidden" name="_method" value="put" />
		<br />
		<input type="submit" value="提交" />
	</form>
</body>
</html>