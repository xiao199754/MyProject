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
<form name="updateUser" action="${pageContext.request.contextPath}/user/updateUser" method="post">
    要更新的ID:<input type="text" name="userId"><br>
    要更新的姓名:<input type="text" name="userName"><br>
    <input type="submit" value="更新"><br>
</form>

</body>
</html>
