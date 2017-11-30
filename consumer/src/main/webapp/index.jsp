<%@ page language="java" import="java.util.*,java.io.InputStream,java.io.OutputStreamWriter,java.net.HttpURLConnection,java.net.URL,java.io.OutputStreamWriter" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<h2>Hello World!</h2>
</body>
</html>
