<%@ page import="java.util.*" %>
<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 22.11.2021
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">Beer recommendations JSP</h1>
<p>
        <%
    List<String> brands = (ArrayList<String>)request.getAttribute("brands");
    out.print("You should try beer brands below:<br>");
    for (String brand : brands ) {
        out.print(brand + "<br>");
    }
            %>
</body>
</html>
