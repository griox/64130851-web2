<%@ page import="java.util.Date" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
  <h1>Hello JSP Example</h1>
<%=new Date().toString()%>
<% int x;
x = 5;int y = x+99;
%>
<hr><%=y%><hr>
<%out.print(y);%><br>
<a href="chia.html">Phép chia</a><br>
<a href="nhan.html">Phép nhân</a><br>
<a href="tru.html">Phép trừ</a><br>
<a href="cong.html">Phép cộng</a><br>

</body>
</html>