package Controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.AdminModel;
import Service.AdminService;
import Service.AdminServiceImpl;
import Service.EmployeeService;
import Service.EmployeeServiceImpl;
import Model.EmployeeModel;

//Controller for update employee details
@WebServlet("/EmployeeUpdate")
public class EmployeeUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int EId=Integer.parseInt(request.getParameter("EId"));
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
		String Email=request.getParameter("Email");
		String Contact=request.getParameter("Contact");
		String Address=request.getParameter("Address");
		String Username=request.getParameter("Username");
		String Oldpassword=request.getParameter("Oldpassword");
		String Newpassword=request.getParameter("Newpassword");
		String Confirmpassword=request.getParameter("Confirmpassword");
		
//		out.println(Ad_Id);
//		out.println(FirstName);
//		out.println(LastName);
//		out.println(Email);
//		out.println(Contact);
//		out.println(Username);
//		out.println(Oldpassword);
//		out.println(Newpassword);
//		out.println(Confirmpassword);
		
		if(Newpassword.equals(Confirmpassword)) {
			EmployeeService employeeService=new EmployeeServiceImpl();
			
			boolean b=employeeService.verifyEmployee(EId, Oldpassword);
			if(b) {
				EmployeeModel employeeModel=new EmployeeModel(EId,FirstName,LastName,Email,Contact,Address,Username,Newpassword);
				b=employeeService.isUpdateEmployeeDetails(employeeModel);
				if(b) {
					request.setAttribute("Status", "Employee Details Updated");
					RequestDispatcher r=request.getRequestDispatcher("EmployeeUpdate.jsp");
					r.forward(request, response);
				}else {
					request.setAttribute("Status", "Sorry... due to some problem Employee details not updated");
					RequestDispatcher r=request.getRequestDispatcher("EmployeeUpdate.jsp");
					r.forward(request, response);	
				}
			}else {	
				request.setAttribute("Status", "Sorry... Your old password is incorrect please enter correct password");
				RequestDispatcher r=request.getRequestDispatcher("EmployeeUpdate.jsp");
				r.forward(request, response);
			}
		}else {
			request.setAttribute("Status", "Sorry... Your new password and confirm password are different");
			RequestDispatcher r=request.getRequestDispatcher("EmployeeUpdate.jsp");
			r.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
