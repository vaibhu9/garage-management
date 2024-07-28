package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.InventoryModel;
import Service.InventoryService;
import Service.InventoryServiceImpl;

//Controller for add spear parts
@WebServlet("/SpearPartAdd")
public class SpearPartAdd extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String partName=request.getParameter("partName");
		int price=Integer.parseInt(request.getParameter("price"));
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		
		InventoryModel inventoryModel=new InventoryModel(partName,price,quantity);
		
		InventoryService inventoryService=new InventoryServiceImpl();
		
		int isAdd=inventoryService.isAddPart(inventoryModel);
		
		if(isAdd==1) {
			request.setAttribute("status", "Spear part added.");
			RequestDispatcher r=request.getRequestDispatcher("AddSpearPart.jsp");
			r.forward(request, response);
		}
		else if(isAdd==-1){
			request.setAttribute("status", "Spear part already present.");
			RequestDispatcher r=request.getRequestDispatcher("AddSpearPart.jsp");
			r.forward(request, response);
		}
		else {
			request.setAttribute("status", "Sorry... Due to some problem spear part is not added.");
			RequestDispatcher r=request.getRequestDispatcher("AddSpearPart.jsp");
			r.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
