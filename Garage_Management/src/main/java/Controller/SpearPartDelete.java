package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.InventoryService;
import Service.InventoryServiceImpl;

//Controller for delete spear part
@WebServlet("/SpearPartDelete")
public class SpearPartDelete extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int PId=Integer.parseInt(request.getParameter("PId"));
		InventoryService inventoryService=new InventoryServiceImpl();
		
		boolean isDelete=inventoryService.isDeleteSparePart(PId);
		
		if(isDelete) {
			RequestDispatcher r=request.getRequestDispatcher("ViewSpearParts.jsp");
			r.forward(request, response);
		}
		else {
			out.println("<h1>Sorry... Due to some problem spear part details not deleted.</h1>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
