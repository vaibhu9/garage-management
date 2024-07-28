<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="Service.*,Model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SearchSpearPartsByName</title>
</head>
<body>
<%!
InventoryService inventoryService =new InventoryServiceImpl();
%>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Sr.no</th>
      <th scope="col">Spear Part Name</th>
      <th scope="col">Spear Part Price</th>
      <th scope="col">Total Quantity Available</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody id="table1">
    <%
    String partName=request.getParameter("spearPartName");
    List<InventoryModel> list=inventoryService.searchAllSparePartDetailsByName(partName);
    int count=0;
    for(InventoryModel inventoryModel:list)
    {
    	
    %>
    <tr>
      <th scope="row"><%=++count%></th>
      <td><%= inventoryModel.getPartName() %></td>
        <td><%= inventoryModel.getPrice() %></td>
      <td><%= inventoryModel.getQuantity() %></td>
      <td><a href='SpearPartDelete?PId=<%=inventoryModel.getPId() %>'><i class="fa-solid fa-trash"></a></i></td>
      <td><a href='SpearPartUpdate.jsp?spearPartId=<%=inventoryModel.getPId() %>'><i class="fa-solid fa-pen"></i></a></td>
    </tr>
    <% 
    }
    list.clear(); 
    	
    	  
    %>
    
  </tbody>
</table>
</body>
</html>