<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form name="deleteUser" action="${pageContext.request.contextPath}/user/deleteUser" method="post">
<h1>展示账户数据列表</h1>
    <table border="1">
        <tr>
            <th>账户id</th>
            <th>账户名称</th>
            <th>账户密码</th>
            <th>更新用户</th>
            <th>插入新用户</th>
            <th>删除用户</th>
        </tr>

        <c:forEach items="${list}" var="user">
        <tr>

                <td><input name="userId" value="${user.userId}" style="width:0; height:0;">${user.userId}</td>
                <td>${user.userName}</td>
                <td>${user.password}</td>
                <td><a href="../update.jsp">更新用户</a></td>
                <td><a href="../insert.jsp">插入新用户</a></td>
                <td><input type="submit" value="删除用户"><td>
            <a href="update.jsp">你好啊</a>
        </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
