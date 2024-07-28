<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Registration Form</title>
<link rel="stylesheet" href="AdminRegistration.css"/>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<%@include file="AdminPanel.jsp"%>

<section class="vh-100 bg-image abcd">
  <!-- style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');"> -->
  <div class="mask d-flex align-items-center h-100">
    <div class="container h-100">
      <div class="row d-flex justify-content-center align-items-center h-100">
        <div class="col-12 col-md-9 col-lg-7 col-xl-8">
          <div class="card" style="border-radius: 15px;">
            <div class="card-body bg-light p-5" style="border-radius: 15px;">
              <h2 class="text-uppercase text-center mb-5">Add New Admin</h2>

              <form name="frm" action="AdminRegister" method="post" >

                <div data-mdb-input-init class="form-outline d-flex mb-4">
                  <input id="fnamemsg" type="text" name="firstname" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder="First Name" onkeyup="isFirstNameValid(this.value)" />
               	  <input id="lnamemsg" type="text" name="lastname" id="form3Example1cg" class="form-control form-control-lg" value="" placeholder="Last Name" onkeyup="isLastNameValid(this.value)" />
                 <!--  <label class="form-label" for="form3Example1cg">Your Name</label> -->
                </div>

                <div data-mdb-input-init class="form-outline mb-4">
                  <input id="emailmsg" type="email" name="email" id="form3Example3cg" class="form-control form-control-lg" value="" placeholder="Your Email" onkeyup="isEmailValid(this.value)" />
                  <!-- <label class="form-label" for="form3Example3cg">Your Email</label> -->
                </div>
                
                <div data-mdb-input-init class="form-outline mb-4">
                  <input type="email" name="username" id="form3Example3cg" class="form-control form-control-lg" value="" placeholder="Username" />
                  <!-- <label class="form-label" for="form3Example3cg">Your Email</label> -->
                </div>

                <div data-mdb-input-init class="form-outline d-flex mb-4">
                  <input id="passwordmsg" type="password" name="password" id="form3Example4cg" class="form-control form-control-lg" value="" placeholder="Password" onkeyup="isPasswordStrong(this.value)" />
                  <input type="password" name="confirmpassword" id="form3Example4cg" class="form-control form-control-lg" value="" placeholder="Cunfirm Password" />
                 <!--  <label class="form-label" for="form3Example4cg">Password</label> -->
                </div>

                <!-- <div class="form-check d-flex justify-content-center mb-5" >
                  <div class="d-flex justify-content-center" style="width:60%;">
                  <input class="form-check-input me-2" type="checkbox" value="" id="form2Example3cg" style="position:absolute; margin-right:300px;" />
                  <label class="form-check-label" for="form2Example3g" style="">
                    I agree all<a href="#!" class="text-body"><u>Terms & Conditions of Services</u></a>
                  </label>
                  </div>
                </div> -->

                <div class="d-flex justify-content-center">
                  <button type="submit"
                    data-mdb-button-init data-mdb-ripple-init class="btn btn-secondary btn-block btn-lg text-body" value="Submit">Add</button>
                </div>

                <p class="text-center text-muted mt-5 mb-0">Have already an account? <a href="#!"
                    class="fw-bold text-body"><u>Login here</u></a></p>

              </form>

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

	</div>
<script type="text/javascript" src="Validation.js"></script>
</body>
</html>