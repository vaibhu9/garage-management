<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Service.*, Model.*, java.util.* " %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Appointment</title>
<link rel="Stylesheet" href="PanelCss.css">
 <script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
</head>
<body>
<%@ include file="AdminPanel.jsp" %>

<%!
 AppointmentService appointmentService =new AppointmentServiceImpl();
CustomerService customerService=new CustomerServiceImpl();
VehicleService vehicleService=new VehicleServiceImpl();
EmployeeService employeeService=new EmployeeServiceImpl();
%>


<section class="maintaskpage">
  <table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.no</th>
      <th scope="col">Appointment Id</th>
      <th scope="col">Customer Name</th>
      <th scope="col">Vehicle Number</th>
      <th scope="col">Appointment Date</th>
      <th scope="col">Service Employee Name</th>
      <th scope="col">Appointment Status</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
   <%
   List<AppointmentModel> list=appointmentService.getAllAppointment();
   int count=0;
   for(AppointmentModel appointmentModel:list)
   {
   	
	    %>
	    <tr>
	      <th scope="row"><%=++count%></th>
	      <td><%= appointmentModel.getAId()%></td>
	        <td><%= customerService.getCustomerNameByCId(vehicleService.getCustomerIdByVId(appointmentModel.getVId()))%></td>
	      <td><%= vehicleService.getVehicleNumberByVId(appointmentModel.getVId())%></td>
	      <td><%= appointmentModel.getAppointment_Date()%></td>
	      <td><%= employeeService.getEmployeeNameByEId(appointmentModel.getEId()) %></td>
	      <td><%=appointmentModel.getStatus() %>
	      <td><a href='AppointmentDelete?AId=<%=appointmentModel.getAId()%>'><i class="fa-solid fa-trash"></a></i></td>
	      <td><a href='AppointmentUpdate.jsp?AId=<%=appointmentModel.getAId()%>'><i class="fa-solid fa-pen"></i></a></td>
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