<%--
  Created by IntelliJ IDEA.
  User: huyngo
  Date: 24/2/25
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<%
  String username = request.getParameter("username");
  String password = request.getParameter("password");
  if ("huy1603".equals(username) && "16032004".equals(password)) {
    response.sendRedirect("Profile.html");
  } else {
    response.sendRedirect("login.html");
  }
%>
</body>
</html>
