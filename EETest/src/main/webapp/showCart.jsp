<%--
  Created by IntelliJ IDEA.
  User: Серикболсын
  Date: 18.03.2023
  Time: 1:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@ page import="logic.Cart"%>
    <% Cart cart =(Cart) session.getAttribute("cart");%>
    <p> Name full: <%=cart.getName()%></p>
    <p> Amount : <%=cart.getQuantity()%></p>
</body>
</html>
