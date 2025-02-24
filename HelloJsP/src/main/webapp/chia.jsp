<%--
  Created by IntelliJ IDEA.
  User: huyngo
  Date: 24/2/25
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết quả phép Chia</title>
</head>
<body>
  <%
    String a =  request.getParameter("a");
    double new_a = Integer.parseInt(a);
    String b = request.getParameter("b");
    double new_b = Integer.parseInt(b);
    out.print("a = " + new_a + "<br>");
    out.print("b = " + new_b + "<br>");
    out.print("a : b = " + (new_a / new_b) + "<br>");

  %>
</body>
</html>
