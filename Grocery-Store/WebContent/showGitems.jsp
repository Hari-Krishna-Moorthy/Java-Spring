<%@ page import="java.util.List,java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
	.grid-container {
		display : grid;
		grid-gap: 50px 100px;
	}
	.grid-item {
		display : inline-grid;
		
	}

</style>

<link rel="stylesheet" href="static/css/bootstrap.css">
<link rel="stylesheet" href="static/css/bootstrap-grid.css">

<title>Display All Grocery Store Items</title>
</head>
<body>

	<%Map<String, List<String>> itemList = (Map<String, List<String>>)request.getAttribute("GroceryStoreitems"); %>


		
<div class="grid-container">
		<section class="pt-3 pb-4">
      	 <div class="container">
          <div class="row d-flex justify-content-center">
            <ol class="list-features mt-4 lead list-xl"> 
            <% for(String category : itemList.keySet()) { %>
            
            <div class="grid-item">  <li><big><%=category %> </big> </li>
		    	 <% for(String item : itemList.get(category)) { %>
		     	<ul>
			   		<li class="container"><%=item %></li>
				</ul>
        		<% }%>	
			</div>
        	<%} %>
		   </ol>
         
        </div>
      </div>
    </section>

</div>	

</body>
</html>