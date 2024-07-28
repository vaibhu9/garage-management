package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.EmployeeModel;
import Service.EmployeeService;
import Service.EmployeeServiceImpl;

//Controller for register employee
@WebServlet("/EmployeeRegister")
public class EmployeeRegister extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String firstName=request.getParameter("FirstName");
		String lastName=request.getParameter("LastName");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String address=request.getParameter("address");
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmpassword");
		
//		out.println(firstName);
//		out.println(lastName);
//		out.println(email);
//		out.println(contact);
//		out.println(address);
//		out.println(userName);
//		out.println(password);
//		out.println(confirmPassword);
		
		if(password.equals(confirmPassword)) {
			EmployeeModel employeeModel=new EmployeeModel();
			employeeModel.setFirstName(firstName);
			employeeModel.setLastName(lastName);
			employeeModel.setContact(contact);
			employeeModel.setEmail(email);
			employeeModel.setAddress(address);
			employeeModel.setUsername(userName);
			employeeModel.setPassword(password);
			
			EmployeeService employeeService=new EmployeeServiceImpl();
			int result=employeeService.isAddEmployee(employeeModel);
			out.println((result == 1) ? "<h1>Employee added successfully.</h1>"
					: (result == -1) ? "<h1>Employee is already present.</h1>"
							: "<h1>Sorry... Employee is not added.</h1>");
		}else {
			out.println("<h1>Sorry... Your Confirm Password is not match with Password</h1>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
