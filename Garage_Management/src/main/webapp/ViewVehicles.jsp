<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@ page import="Service.*, Model.*, java.util.* " %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Vehicles Details</title>
<link rel="stylesheet" href="PanelCss.css">
 <script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
</head>
<body>

<%@include file="AdminPanel.jsp"%>

<%!
VehicleService vehicleService =new VehicleServiceImpl();
CustomerService customerService =new CustomerServiceImpl();
%>


<section class="maintaskpage">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.no</th>
      <th scope="col">Vehicle Number</th>
      <th scope="col">Model Name</th>
      <th scope="col">Model Year</th>
      <th scope="col">Vehicle Owner</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
    <%
    List<VehicleModel> list=vehicleService.getAllVehicle();
    int count=0;
    for(VehicleModel vehicleModel:list)
    {
    	
    %>
    <tr>
      <th scope="row"><%=++count%></th>
      <td><%= vehicleModel.getVehicle_Number()%></td>
      <td><%= vehicleModel.getModel()%></td>
      <td><%=vehicleModel.getYear() %></td>
      <td><%= customerService.getCustomerNameByCId(vehicleModel.getCId()) %></td>
      <td><a href='VehicleDelete?VId=<%=vehicleModel.getVId()%>'><i class="fa-solid fa-trash"></a></i></td>
      <td><a href='VehicleUpdate.jsp?vehicleId=<%=vehicleModel.getVId()%>'><i class="fa-solid fa-pen"></i></a></td>
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