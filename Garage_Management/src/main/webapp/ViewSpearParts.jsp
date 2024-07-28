<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@ page import="Service.*, Model.*, java.util.* " %>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Spear Parts</title>
<link rel="stylesheet" href="PanelCss.css">

 <script src="https://kit.fontawesome.com/014ca51276.js" crossorigin="anonymous"></script>
</head>
<body>

<%@include file="AdminPanel.jsp"%>

<%!
InventoryService inventoryService =new InventoryServiceImpl();
%>


<section class="maintaskpage" >
<input style="color:black;" type="text" value="" placeholder="Enter Spear Part Name Here To Search..." onkeyup="searchSpearPartsByName(this.value)" />
<div id="table1">
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
    List<InventoryModel> list=inventoryService.getAllSparePartDetails();
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
</div>
</section>
</div>
<script type="text/javascript">

function searchSpearPartsByName(partName){
	let xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange=function(){
		if(this.readyState==4&&this.status==200){
			document.getElementById("table1").innerHTML=this.responseText;
		}
	};
	xhttp.open("Get","SearchSpearPartsByName.jsp?spearPartName="+partName,true);
	xhttp.send();
}

</script>
</body>
</html>