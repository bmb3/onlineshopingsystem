<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#DDDDDD">
<center>
   <h2 style="background-color:aqua;"style="font-size:30px;">ADD CUSTOMER</h2>
       <form action="addcustomer">
           Enter Customer id - <input type="text" name="customerid"><br>
           Enter Customer Name - <input type="text" name="customername"><br>
           Enter Customer Password - <input type="text" name="password"><br>
           Enter Customer Balance - <input type="text" name="balance"><br>
           <input type="submit" name="btn" value="addcustomer">
         </form>
</center>         
</body>
</html>