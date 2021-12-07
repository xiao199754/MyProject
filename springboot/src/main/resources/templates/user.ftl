<html>
<head>
    <title>用户信息</title>
    <meta charset="UTF-8">
</head>
<body>
<table border="1" align="center" width="50%">
    <tr>
        <th>ID</th>
        <th>姓名</th>
        <th>年龄</th>
    </tr>
    <#list list as user>
        <tr>
            <td>${user.username}</td>
            <td>${user.age}</td>
            <td>${user.address}</td>
        </tr>
    </#list>
</table>
</body>
</html>