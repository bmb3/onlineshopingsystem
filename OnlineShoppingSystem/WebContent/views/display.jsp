<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		  	<style>
					table, tr, td{
						 border: 2px solid black;
						 width : 30%;
						 text-align: center;
					}
				</style>
</head>
<body bgcolor="#DDDDDD">
<center>
<table border="1">
      <thead>
         <tr>
            <th>ProductNumber</th>
            <th>ProductName</th>
           <th>ProductCost</th>
             <th>ProductQuantity</th>
             <th>ProductDiscount</th>
         </tr>
      </thead>
      
   <h2 style="background-color:aqua;"style="font-size:30px;">PRODUCTS LIST</h2>
			<c:forEach var="Product" items="${list }">
						<tbody>
							<tr>
								<td>
									<h5><c:out value="${Product.getProductno()}"></c:out></h5>
								</td>
								<td>
									<h5><c:out value="${Product.getProductname()}"></c:out></h5>
								</td>
								<td>
									<h5><c:out value="${Product.getProductcost()}"></c:out></h5>
								</td>	
								<td>
									<h5><c:out value="${Product.getQuantity()}"></c:out></h5>
								</td>	
								<td>
									<h5><c:out value="${Product.getDiscount()}"></c:out></h5>
								</td>	
							</tr>
						</tbody>
	     </c:forEach>
</table>
	</center>			
	
		
</body>
</html>


