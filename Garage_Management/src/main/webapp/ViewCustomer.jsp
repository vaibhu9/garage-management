<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@ page import="Service.*, Model.*, java.util.* " %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Customer Details</title>
<link rel="stylesheet" href="PanelCss.css">
 <script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
</head>
<body>

<%@include file="AdminPanel.jsp"%>

<%!
CustomerService customerService =new CustomerServiceImpl();
%>


<section class="maintaskpage">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.no</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Contact</th>
      <th scope="col">Address</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
    <%
    List<CustomerModel> list=customerService.getAllCustomer();
    int count=0;
    for(CustomerModel customerModel:list)
    {
    	
    %>
    <tr>
      <th scope="row"><%=++count%></th>
      <td><%= customerModel.getFirstName()+" "+customerModel.getLastName()%></td>
      <td><%= customerModel.getEmail()%></td>
      <td><%=customerModel.getContact() %></td>
      <td><%= customerModel.getAddress() %></td>
      <td><a href='CustomerDelete?CId=<%=customerModel.getCId()%>'><i class="fa-solid fa-trash"></a></i></td>
      <td><a href='CustomerUpdate.jsp?customerId=<%=customerModel.getCId()%>'><i class="fa-solid fa-pen"></i></a></td>
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