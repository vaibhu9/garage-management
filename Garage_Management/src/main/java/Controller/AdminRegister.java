package Controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.AdminModel;
import Service.AdminService;
import Service.AdminServiceImpl;

// Controller for register admin
@WebServlet("/AdminRegister")
public class AdminRegister extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String email=request.getParameter("email");
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmpassword");
		
//		out.println(firstName);
//		out.println(lastName);
//		out.println(email);
//		out.println(userName);
//		out.println(password);
//		out.println(confirmPassword);
		
		if (password.equals(confirmPassword)) {
			AdminModel adminModel = new AdminModel();
			adminModel.setFirstName(firstName);
			adminModel.setLastName(lastName);
			adminModel.setEmail(email);
			adminModel.setUsername(userName);
			adminModel.setPassword(password);
			AdminService adminService=new AdminServiceImpl();
			int result = adminService.isAddAdmin(adminModel);
			out.println((result == 1) ? "<h1>Admin added successfully.</h1>"
					: (result == -1) ? "<h1>Admin is already present.</h1>"
							: "<h1>Sorry... Admin is not added.</h1>");
		} else {
			out.println("<h1>Sorry... Your Confirm Password is not match with Password</h1>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
