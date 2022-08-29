<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="/user" method="post" namespace="/">
 用户名:<input type="text" value="输入用户名" name="user.name"/><br/>
 密码:<input type="password"  name="user.password"/><br/>
 <s:submit value="登陆"></s:submit>
</s:form>
</body>
</html>