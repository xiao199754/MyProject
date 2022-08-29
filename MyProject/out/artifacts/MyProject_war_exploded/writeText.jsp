<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>写些东西吧</title>
</head>
<body>
<s:form action="writeText" method="post">
 <p>提交时时间自动生成  </p>
 <s:textfield label="请输入标题" name="textInfo.title"></s:textfield>
 <s:textarea label="请输入正文" name="textInfo.text"></s:textarea>
 <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>