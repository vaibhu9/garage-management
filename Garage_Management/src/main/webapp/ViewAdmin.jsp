<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@ page import="Service.*, Model.*, java.util.* " %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Admin Details</title>
<link rel="stylesheet" href="PanelCss.css">
 <script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
</head>
<body>

<%@include file="AdminPanel.jsp"%>

<%!
AdminService adminService =new AdminServiceImpl();
%>


<section class="maintaskpage">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.no</th>
      <th scope="col">FirstName</th>
      <th scope="col">LastName</th>
      <th scope="col">Email</th>
      <th scope="col">Contact</th>
      <th scope="col">Username</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
    <%
    List<AdminModel> list=adminService.getAllAdmin();
    int count=0;
    for(AdminModel adminModel:list)
    {
    	
    %>
    <tr>
      <th scope="row"><%=++count%></th>
      <td><%= adminModel.getFirstName()%></td>
        <td><%= adminModel.getLastName()%></td>
      <td><%= adminModel.getEmail()%></td>
      <td><%=adminModel.getContact() %></td>
      <td><%= adminModel.getUsername() %></td>
      <td><a href='AdminDelete?Ad_Id=<%=adminModel.getAd_Id()%>'><i class="fa-solid fa-trash"></a></i></td>
      <td><a href='AdminUpdate.jsp?adminId=<%=adminModel.getAd_Id()%>&FirstName=<%=adminModel.getFirstName()%>&LastName=<%=adminModel.getLastName()%>&Email=<%=adminModel.getEmail()%>&Contact=<%=adminModel.getContact() %>&Username=<%=adminModel.getUsername()%>'><i class="fa-solid fa-pen"></i></a></td>
    </tr>
    <% 
    }
    list.clear(); 
    	
    	  
    %>
    
  </tbody>
</table>
</section>
</div>
</body>
</html>