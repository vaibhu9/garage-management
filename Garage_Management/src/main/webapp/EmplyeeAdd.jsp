<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="Addemploye.css">
</head>
<body>
<div class="wrapper" id="Addemploye">
  <h1>Add<span>Employee</span></h1>
<form name="frm" action="EmployeeRegister" method="post" >
<div class="input-box">
<input type="text" value="" name="FirstName" placeholder="Pratik" required  >
<input type="text"  value="" name="LastName"  placeholder="Rindhe"   required id="rindhe">
<input type="email" value="" name="email"    placeholder="pratikrindhe02@gmail.com" required id="rindhe">
<input type="contact" value=""  name="contact" placeholder="9146238476" required id="rindhe">
<input type="address" value="" name="address" placeholder="Pune" required id="rindhe">
<input type="username" value="" name="username" placeholder="Urername" requiredid="rindhe" >
<input type="password" value="" name="password" placeholder="password" required id="rindhe">
<input type="password" value="" name="confirmpassword" placeholder="Confourmpassword" required id="rindhe">
</div>
<div class="input-box">
</div>
<button type="submit" id=btn>Submit</button>
</form>
</div>
</body>
</html>