<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="Adminlogincss.css">
</head>
<body>
<center>
<div class="wrapper" >
  <h1>Employee<span>Login</span></h1>
<form name="frm" action="EmployeeLogin" method="post">

<div class="input-box">
<input type="text" name="username"  placeholder="Username" required ><i class="fa-solid fa-user"></i>
</div>
<div class="input-box">
<input type="Password" name="password" placeholder="Password " required autofill="off">
<i class="fa-solid fa-lock"></i>
</div>

<button type="submit" id=btn>Submit</button>
</form>
</div>
</center>
</body>
</html>