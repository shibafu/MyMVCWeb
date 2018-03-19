<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
	<style>
		body { font-size:14pt; color:#666; }
		h1 { font-size:70pt; color:#aaa; margin:-15px 0px;}
	</style>
		<h1>Index Page</h1>
		<p>Welcome to Spring MVC !</p>
		
		<p>${msg}</p>
		
		<form action="./msg" method="post">
			<input type="text" name="title">
			<textarea name="content"></textarea>
			<input type="submit" value="送信！">
		</form>
	</body>
</html>
