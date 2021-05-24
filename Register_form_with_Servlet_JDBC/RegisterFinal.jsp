<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION SUCCESSFUL</title>
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
 <%
String strid = request.getAttribute("id").toString();
String strfname = request.getAttribute("first_name").toString();
String strlname = request.getAttribute("last_name").toString();
String struname = request.getAttribute("username").toString();
String strPwd = request.getAttribute("password").toString();
String strAddress = request.getAttribute("address").toString();
%>
<div class="container">
 		<h1>
 			<i>Details has been Successfully Registered!</i>
 		</h1>
 		<br></br>


 		<h3>
 			<b>Please verify the details</b>
 		</h3>


 		<table border="1" class="table">
 			<tr>
 				<td class="colourfield">
 					<b>Employee ID</b>
 				</td>
 				<td class="field">
 					<%=strid%>
 				</td>
 			</tr>

 			<tr>
 				<td class="colourfield">
 					<b>First Name</b>
 				</td>
 				<td class="field">
 					<%=strfname%>
 				</td>
 			</tr>

 			<tr>
 				<td class="colourfield">
 					<b>Last Name</b>
 				</td>
 				<td class="field">
 					<%=strlname%>
 				</td>
 			</tr>

 			<tr>
 				<td class="colourfield">
 					<b>Username</b>
 				</td>
 				<td class="field">
 					<%=struname%>
 				</td>
 			</tr>


 			<tr>
 				<td class="colourfield">
 					<b>Password</b>
 				</td>
 				<td class="field">
 					<%=strPwd%>
 				</td>
 			</tr>

 			<tr>
 				<td class="colourfield">
 					<b>Address</b>
 				</td>
 				<td class="field">
 					<%=strAddress%>
 				</td>
 			</tr>

 		</table>

 	</div>


</body>
</html>