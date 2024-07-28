<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Panel</title>
<link rel="stylesheet" href="PanelCss.css">
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"
	rel="stylesheet">
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<script type="text/javascript" src="Panel.js"></script>
<script src="https://kit.fontawesome.com/014ca51276.js"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="experiment">
		<div class="nav-side-menu">
			<div class="brand">Brand Logo</div>
			<i class="fa fa-bars fa-2x toggle-btn" data-toggle="collapse"
				data-target="#menu-content"></i>

			<div class="menu-list">
				<ul id="menu-content" class="menu-content collapse out">
					<li><a href="#"> <i class="fa fa-dashboard fa-lg"></i>
							Dashboard
					</a></li>


					<li data-toggle="collapse" data-target="#Admin"
						class="collapsed"><a href="#"><i class="fa fa-user fa-lg"></i>
							Admin <span class="arrow"></span></a>
						<ul class="sub-menu collapse" id="Admin">
							<li><a href="AdminRegistration.jsp">Add Admin</a></li>
							<li><a href="ViewAdmin.jsp">View All Admin</a></li>
						</ul></li>


					<li data-toggle="collapse" data-target="#Employee" class="collapsed">
                <a href="#"><i class="fa-solid fa-circle-user"></i> Employee <span class="arrow"></span></a>
                <ul class="sub-menu collapse" id="Employee">
                    <li><a href="EmplyeeAdd.jsp">Add Employee</a></li>
                    <li><a href="ViewEmploye.jsp">View All Employee</a></li>
                </ul>
            </li>

					<!-- Corrected Dropdown -->
					<li data-toggle="collapse" data-target="#appointment"
						class="collapsed"><a href="#"><i
							class="fa fa-calendar fa-lg"></i> Appointment <span class="arrow"></span></a>
						<ul class="sub-menu collapse" id="appointment">
							<li><a href="BookAppointment.jsp">Book Appointment</a></li>
							<li><a href="ViewAppointment.jsp">View Appointments</a></li>
						</ul></li>
					<!-- End of Corrected Dropdown -->

					<!-- Corrected Dropdown -->
					<li data-toggle="collapse" data-target="#customer"
						class="collapsed"><a href="#"><i class="fa-solid fa-car"></i>Customer
							<span class="arrow"></span></a>
						<ul class="sub-menu collapse" id="customer">
						<!-- 	<li>Add Customer</li> -->
							<li><a href="ViewCustomer.jsp">View Customer Details</a></li>
							<li><a href="ViewVehicles.jsp">View Vehicle Details</a></li>
						</ul></li>
					<li data-toggle="collapse" data-target="#Inventory"
						class="collapsed"><a href="#"><i
							class="fa-solid fa-warehouse"></i>Inventory<span class="arrow"></span></a>
						<ul class="sub-menu collapse" id="Inventory">
							<li>Add Spear Parts</li>
							<li><a href="ViewSpearParts.jsp">View Spear Parts</a></li>
						</ul></li>
					<!-- End of Corrected Dropdown -->
				</ul>
			</div>
		</div>
		
</body>
</html>



