<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Service.*, Model.*, java.util.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="PanelCss.css">
 <script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
</head>
<body>
<%@ include file="AdminPanel.jsp" %>

<%!
 EmployeeService employeeService =new EmployeeServiceImpl();
%>


<section class="maintaskpage">
  <table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.no</th>
      <th scope="col">First</th>
      <th scope="col">Last</th>
      <th scope="col">email</th>
      <th scope="col">contact</th>
      <th scope="col">Address</th>
      <th scope="col">UserName</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
   <%
   List<EmployeeModel> list=employeeService.getAllEmployee();
   int count=0;
   for(EmployeeModel employeeModel:list)
   {
   	
	    %>
	    <tr>
	      <th scope="row"><%=++count%></th>
	      <td><%= employeeModel.getFirstName()%></td>
	        <td><%= employeeModel.getLastName()%></td>
	      <td><%= employeeModel.getEmail()%></td>
	      <td><%= employeeModel.getContact()%></td>
	      <td><%= employeeModel.getAddress()%></td>
	      <td><%= employeeModel.getUsername() %></td>
	      <td><a href='EmployeeDelete?EId=<%=employeeModel.getEId()%>'><i class="fa-solid fa-trash"></a></i></td>
	      <td><a href='EmployeeUpdate.jsp?EId=<%=employeeModel.getEId()%>&FirstName=<%=employeeModel.getFirstName()%>&LastName=<%=employeeModel.getLastName()%>&Email=<%=employeeModel.getEmail()%>&Contact=<%=employeeModel.getContact()%>&Address=<%=employeeModel.getAddress()%>&Username=<%=employeeModel.getUsername()%>'><i class="fa-solid fa-pen"></i></a></td>
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