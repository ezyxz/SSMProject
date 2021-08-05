<%--
  Created by IntelliJ IDEA.
  User: Xinyuan
  Date: 2021/8/5
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sign in</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名:<input type="text" name="username"/><br/>
    密&nbsp;&nbsp;码:<input type="password" name="password"/> <br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
