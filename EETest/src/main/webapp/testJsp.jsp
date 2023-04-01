<%--
  Created by IntelliJ IDEA.
  User: Серикболсын
  Date: 17.03.2023
  Time: 4:42
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!Documents>
<html>
<head>
    <title>First Jsp</title>
</head>
<body>
    <h1> In the body Hello</h1>
    <p>
        <%@ page import="java.util.Date, logic.TestClass"  %>
        <%
            TestClass test = new TestClass();
        %>
        <%=test.getInfo()%>
        <%
            String name = request.getParameter("name");
        %>
        <%=name%>
    </p>
</body>
</html>
