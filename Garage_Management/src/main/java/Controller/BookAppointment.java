package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CustomerModel;
import Model.VehicleModel;
import Service.AppointmentService;
import Service.AppointmentServiceImpl;

//Controller for book appointment
@WebServlet("/BookAppointment")
public class BookAppointment extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
		String Email=request.getParameter("Email");
		String Contact=request.getParameter("Contact");
		String Address=request.getParameter("Address");
		
		String Vehicle_Number=request.getParameter("Vehicle_Number");
		String Model=request.getParameter("Model");
		int Year=Integer.parseInt(request.getParameter("Year"));
		
		String Date=request.getParameter("Date");
		LocalDate currentDate=LocalDate.now();
		if(Date.compareTo(currentDate.toString())>=0) {
			CustomerModel customerModel=new CustomerModel(FirstName,LastName,Email,Contact,Address);
			VehicleModel vehicleModel=new VehicleModel(Vehicle_Number,Model,Year);
			
			AppointmentService appointmentService=new AppointmentServiceImpl();
			boolean b=appointmentService.isBookAppointment(customerModel,vehicleModel,Date);
			if(b) {
				request.setAttribute("Status", "Your Appointment Created Successfully...");
				RequestDispatcher r=request.getRequestDispatcher("BookAppointment.jsp");
				r.forward(request, response);
			}
			else {
				request.setAttribute("Status", "Sorry... Your Appointment Not Created.");
				RequestDispatcher r=request.getRequestDispatcher("BookAppointment.jsp");
				r.forward(request, response);
			}
		}
		else {
			request.setAttribute("Status", "Please Enter Valid Date");
			RequestDispatcher r=request.getRequestDispatcher("BookAppointment.jsp");
			r.forward(request, response);
		}
		
//		out.println(FirstName);
//		out.println(LastName);
//		out.println(Email);
//		out.println(Contact);
//		out.println(Address);
//		out.println(Vehicle_Number);
//		out.println(Model);
//		out.println(Year);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
