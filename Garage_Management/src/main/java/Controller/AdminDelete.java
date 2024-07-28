package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.AdminService;
import Service.AdminServiceImpl;

//Controller for delete admin
@WebServlet("/AdminDelete")
public class AdminDelete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int Ad_Id=Integer.parseInt(request.getParameter("Ad_Id"));
		out.println("Ad_Id is : "+Ad_Id);
		AdminService adminService=new AdminServiceImpl();
		boolean isDelete=adminService.isDeleteAdminDetails(Ad_Id);
		if(isDelete) {
			RequestDispatcher r=request.getRequestDispatcher("ViewAdmin.jsp");
			r.forward(request, response);
		}else {
			out.println("<h1>Sorry... due to some problem is admin not deleted</h1>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
