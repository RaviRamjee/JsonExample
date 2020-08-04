 <%@ page import = "java.util.*" %>
 <%@ page import ="com.json.bean.User" %>
 <%@ page import = "com.json.controller.UserService"%>
 <%@ page import = "com.google.gson.Gson" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<%
UserService service=new UserService();

%>
<h2><center>User Details</center></h2>
<table>
  <tr>
    <th>userId</th>
    <th>UserName</th>
    <th>email ID</th>
    <th>Age</th>
    <th>Address</th>
  </tr>
  <%
  
  for(int i=0;i<service.getUsers().size();i++)
  {
	  User user=service.getUsers().get(i);
	  Gson json=new Gson();
	  String s=json.toJson(user);
	  User u= json.fromJson(s, User.class);
	  %>
  <tr>
    <td><%= u.getUser_id() %></td>
    <td><%=u.getUser_name() %></td>
    <td><%= u.getUser_email() %></td>
    <td><%= u.getUser_age() %></td>
    <td><%= u.getUser_address() %></td>
  </tr>
  <%} %>
</table>

</body>
</html>