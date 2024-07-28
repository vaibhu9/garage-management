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

//Controller for login admin
@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		AdminService aService = new AdminServiceImpl();
		boolean b = aService.verifyAdmin(username, password);
		if(b) {
//			out.println("<h1>Login successfully</h1>");
			
			RequestDispatcher r=request.getRequestDispatcher("AdminPanel.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Login failed</h1>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
