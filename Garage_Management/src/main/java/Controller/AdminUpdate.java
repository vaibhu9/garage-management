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

// Controller for update admin data
@WebServlet("/AdminUpdate")
public class AdminUpdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int Ad_Id=Integer.parseInt(request.getParameter("adminId"));
		String FirstName=request.getParameter("FirstName");
		String LastName=request.getParameter("LastName");
		String Email=request.getParameter("Email");
		String Contact=request.getParameter("Contact");
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
//		out.println(Oldpasword);
//		out.println(Newpassword);
//		out.println(Confirmpassword);
		
		if(Newpassword.equals(Confirmpassword)) {
			AdminService adminService=new AdminServiceImpl();
			
			boolean b=adminService.verifyAdmin(Ad_Id, Oldpassword);
			System.out.println("Admin id : "+Ad_Id);
			System.out.println("Old pass : "+Oldpassword);
			if(b) {
				AdminModel adminModel=new AdminModel(Ad_Id,FirstName,LastName,Email,Contact,Username,Newpassword);
				b=adminService.isUpdateAdminDetails(adminModel);
				if(b) {
					request.setAttribute("Status", "Admin Details Updated");
					RequestDispatcher r=request.getRequestDispatcher("AdminUpdate.jsp");
					r.forward(request, response);
				}else {
					request.setAttribute("Status", "Sorry... due to some problem admin details not updated");
					RequestDispatcher r=request.getRequestDispatcher("AdminUpdate.jsp");
					r.forward(request, response);	
				}
			}else {	
				request.setAttribute("Status", "Sorry... Your old password is incorrect please enter correct password");
				RequestDispatcher r=request.getRequestDispatcher("AdminUpdate.jsp");
				r.forward(request, response);
			}
		}else {
			request.setAttribute("Status", "Sorry... Your new password and confirm password are different");
			RequestDispatcher r=request.getRequestDispatcher("AdminUpdate.jsp");
			r.forward(request, response);
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
