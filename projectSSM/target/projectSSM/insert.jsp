<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/12/3
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>更新用户信息</h1>
<form name="updateUser" action="${pageContext.request.contextPath}/user/insertUser" method="post">
    注册姓名:<input type="text" name="userName"><br>
    注册密码:<input type="password" name="password"><br>
    <input type="submit" value="插入"><br>
</form>

</body>
</html>
