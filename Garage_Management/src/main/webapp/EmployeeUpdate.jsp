<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="Model.*" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<link rel="stylesheet" href="AdminUpdateCss.css"/>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<%@include file="AdminPanel.jsp"%>

<section class="vh-100 maintask">
  
  <div class="mask d-flex align-items-center h-100">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-8">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body  p-5" style="border-radius: 15px;">
              <h2 class="text-uppercase text-center mb-5">Employee <span>Update</span></h2>
              
              <%
              int EId=Integer.parseInt(request.getParameter("EId"));
              String FirstName=request.getParameter("FirstName");
              String LastName=request.getParameter("LastName");
              String Email=request.getParameter("Email");
              String Contact=request.getParameter("Contact");
              String Address=request.getParameter("Address");
              String Username=request.getParameter("Username");
          
              %>
              <%
              String Status=(String)request.getAttribute("Status");
              if(Status!=null&&!Status.isEmpty()){
            	 %>
            	 <h2><%=Status %></h2>
            	 <%
              }
              %>
             
              <h3>Employee Id : <%=EId %></h3>
              <form name="frm" action="EmployeeUpdate" method="post" >

                <div data-mdb-input-init class="form-outline d-flex mb-4">
                <input type="hidden" name="EId" value="<%=EId%>"/>
                  <input type="text" name="FirstName" id="form3Example1cg" class="form-control form-control-lg" value="<%=FirstName %>" placeholder="Enter First Name" required />
               	  <input type="text" name="LastName" id="form3Example1cg" class="form-control form-control-lg" value="<%=LastName %>" placeholder="Enter Last Name" required />
                 <!--  <label class="form-label" for="form3Example1cg">Your Name</label> -->
                </div>
                
                <div data-mdb-input-init class="form-outline d-flex mb-4">
                  <input type="email" name="Email" id="form3Example1cg" class="form-control form-control-lg" value="<%=Email %>" placeholder="Enter Email" required />
               	  <input type="text" name="Contact" id="form3Example1cg" class="form-control form-control-lg" value="<%=Contact %>" placeholder="Enter contact" required />
                 <!--  <label class="form-label" for="form3Example1cg">Your Name</label> -->
                </div>

                <div data-mdb-input-init class="form-outline d-flex mb-4">
                  <input type="text" name="Username" id="form3Example1cg" class="form-control form-control-lg" value="<%=Username %>" placeholder="Enter UserName" required />
               	  <input type="password" name="Oldpassword" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder="Enter Old password" required />
                 <!--  <label class="form-label" for="form3Example1cg">Your Name</label> -->
                </div>
                
                <div data-mdb-input-init class="form-outline d-flex mb-4">
                  <input type="password" name="Newpassword" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder="Enter New password" required />
               	  <input type="password" name="Confirmpassword" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder=" confirm password" required />
                 <!--  <label class="form-label" for="form3Example1cg">Your Name</label> -->
                </div>
                 
                  <div data-mdb-input-init class="form-outline d-flex mb-4">
                  <input type="text" name="Address" id="form5Example1cga" class="form-control " value="<%=Address %>" placeholder="Enter Address" required />
               	 
                </div>
                 
                  
                 
                <div class="form-check d-flex justify-content-center mb-5" >
                  <div class="d-flex justify-content-center" style="width:60%;">
                  <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3cg" style="position:absolute; margin-right:300px;" />
                  <label class="form-check-label" for="form2Example3g" style="">
                    I agree all<a href="#!" class="text-body"><u>Terms & Conditions of Services</u></a>
                  </label>
                  </div>
                </div>

                <div class="d-flex justify-content-center">
                  <button type="submit"
                    data-mdb-button-init data-mdb-ripple-init class="btn btn-danger btn-block btn-lg text-body" value="Submit">Submit</button>
                </div>

                
              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

	</div>
</body>
</html>