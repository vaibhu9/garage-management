<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration Form</title>
<link rel="stylesheet" href="BookAppointment.css"/>
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
              <h2 class="text-uppercase text-center mb-5">Book Appointment</h2>
              
               <%
              String Status=(String)request.getAttribute("Status");
              if(Status!=null&&!Status.isEmpty()){
            	 %>
            	 <h2><%=Status %></h2>
            	 <%
              }
              %>

              <form name="frm" action="BookAppointment" method="post" >

                <h3>Customer Details</h3>
                <div data-mdb-input-init class="form-outline d-flex mb-4">
                  <input type="text" name="FirstName" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder="First Name" />
               	  <input type="text" name="LastName" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder="Last Name" />
                 <!--  <label class="form-label" for="form3Example1cg">Your Name</label> -->
                </div>

                <div data-mdb-input-init class="form-outline d-flex mb-4">
                  <input type="email" name="Email" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder="Email" />
               	  <input type="text" name="Contact" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder="contact" />
                 <!--  <label class="form-label" for="form3Example1cg">Your Name</label> -->
                </div>
                
                <div data-mdb-input-init class="form-outline mb-4">
                  <input type="text" name="Address" id="form3Example3cg" class="form-control form-control-lg" value="" placeholder="Address" />
                  <!-- <label class="form-label" for="form3Example3cg">Your Email</label> -->
                </div>
                  <hr>
                  <h3>Vehicle Details</h3>
                 <div data-mdb-input-init class="form-outline mb-4">
                  <input type="text" name="Vehicle_Number" id="form3Example3cg" class="form-control form-control-lg" value="" placeholder="Vehicle Number" />
                  <!-- <label class="form-label" for="form3Example3cg">Your Email</label> -->
                </div>
                 <div data-mdb-input-init class="form-outline mb-4">
                  <input type="text" name="Model" id="form3Example3cg" class="form-control form-control-lg" value="" placeholder="Vehicle Model" />
                  <!-- <label class="form-label" for="form3Example3cg">Your Email</label> -->
                </div>
                 <div data-mdb-input-init class="form-outline mb-4">
                  <input type="text" name="Year" id="form3Example3cg" class="form-control form-control-lg" value="" placeholder="Model Year" />
                  <!-- <label class="form-label" for="form3Example3cg">Your Email</label> -->
                </div>
                
                </div>
                 <div data-mdb-input-init class="form-outline mb-4">
                  <input type="Date" name="Date" id="form3Example3cg" class="form-control form-control-lg" value="" />
                </div>
                
                
                 
               <!--  <div class="form-check d-flex justify-content-center mb-5" >
                  <div class="d-flex justify-content-center" style="width:60%;">
                  <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3cg" style="position:absolute; margin-right:300px;" />
                  <label class="form-check-label" for="form2Example3g" style="">
                    I agree all<a href="#!" class="text-body"><u>Terms & Conditions of Services</u></a>
                  </label>
                  </div>
                </div> -->

                <div class="d-flex justify-content-center">
                  <button type="submit"
                    data-mdb-button-init data-mdb-ripple-init class="btn btn-secondary btn-block btn-lg text-body" value="Submit">Book</button>
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