<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>
</head>
<style>
.container {
  text-align : center;
  background-color: #f1f1f1;
  padding: 20px;

}
.table{
width: 10000; 
align : center;
border-collapse: collapse;
border-style:solid ;
border-color: black;
margin-left: auto ;
margin-right: auto; "
}
</style>
<body>
<form name = "RegistrationForm" action = "<%= request.getContextPath() %>/EmployeeeServlet"  method = "post">
<div class = "container">
<h2 align = "center" ><i>REGISTRATION FORM</i></h2>
<br></br>

<h3 align = "center"><i>ENTER YOUR DETAILS HERE</i></h3>

<table border="1" class="table">
<tr>
<td> Employee ID: </td>
<td><input type="text" id="id" name="id" maxlength="10"></td>
</tr>
<tr>
<td> FirstName: </td>
<td><input type="text" id="first_name" name="first_name" maxlength="10"></td>
</tr>
<tr>
<td> LastName: </td>
<td><input type="text" id="last_name" name="last_name" maxlength="10"></td>
</tr>
<tr>
<td> UserName: </td>
<td><input type="text" id="username" name="username" maxlength="10"></td>
</tr>
<tr>
<tr>
<td> PassWord: </td>
<td><input type="password" id="password" name="password"></td>
</tr>
<tr>
<td> Address: </td>
<td><input type="text" id="address" name="address"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" id="sub" name="submit" value="Submit"></td>
</tr>
</table>
</div>
</form>
</body>
</html>