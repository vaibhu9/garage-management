package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.EmployeeService;
import Service.EmployeeServiceImpl;

//Controller for delete employee
@WebServlet("/EmployeeDelete")
public class EmployeeDelete extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int EId=Integer.parseInt(request.getParameter("EId"));
		EmployeeService employeeService=new EmployeeServiceImpl();
		boolean isDelete=employeeService.isDeleteEmployeeDetails(EId);
		if(isDelete) {
			RequestDispatcher r=request.getRequestDispatcher("ViewEmploye.jsp");
			r.forward(request, response);
		}else {
			out.println("<h1>Sorry... due to some problem is Employee not deleted</h1>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
