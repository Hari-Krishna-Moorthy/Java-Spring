package com.GroceryStore.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import com.GroceryStore.Model.Samples.SampleGroceryStoreitems;

@SuppressWarnings("serial")
public class GetGroceryStoreItems extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SampleGroceryStoreitems sampleItems = new SampleGroceryStoreitems();
		request.setAttribute("GroceryStoreitems", sampleItems.sampleGroceryStoreitemList() );
		
		RequestDispatcher dispatcher =  request.getRequestDispatcher("showGitems.jsp");
		dispatcher.forward(request, response);
		
	}
}
