<%@ page language="java" contentType="text/html; charset=UTF-8" import="com.main.service.impl.*"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分享学习</title>
<link rel="stylesheet" href="css/text.css"/>
<link rel="stylesheet" href="js/share.js"/>
</head>
<body> 
<%
String result=(String)session.getAttribute("textInfos");
if(result==null){
%>
<s:action name="text" executeResult="true" namespace="/"></s:action>
<%
 // response.sendRedirect("text");
}else{
%>  
    	<div id="share">
	        <div id="search">
	            <div id="input_search">
	                <input class="input_text" type="text" value="输入搜索内容">
	                <input class="input_button" type="button" value="搜索">
	            </div>
	        </div>
	        <s:iterator value="textInfos" var="textInfo">
	        <div id="main">
	        	<div id="top">
		        	<div id="title"><s:property value="#textInfo.title"/></div>
		        	<div id="time"><s:property value="#textInfo.time.toString().substring(0, 19)"/></div>
		       	</div>
	        	<div id="main_study">
	        		<label id="lab">
	        		<a href = "javascript:void(0)" onclick = "document.getElementById('<s:property value="#textInfo.id"/>').style.display='block';document.getElementById('fade').style.display='block'">
	        			<PRE><s:property value="#textInfo.text"/></PRE>
	        		</a>
	        		</label>
        			<div id="<s:property value="#textInfo.id"/>" class="white_content"><p><s:property value="#textInfo.text"/></p><a href = "javascript:void(0)" onclick = "document.getElementById('<s:property value="#textInfo.id"/>').style.display='none';document.getElementById('fade').style.display='none'">点这里关闭本窗口</a></div> 
        			<div id="fade" class="black_overlay"></div> 
	        	</div>
	        </div>
	        </s:iterator>
        </div>
        <div id="footer">
         <a href="writeText.jsp">分享我的经验</a>
        </div>
<%session.removeAttribute("textInfos"); } %>
</body>
</html>