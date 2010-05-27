<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<% if(session.getAttribute("login") ==	 null){%>
<logic:forward name="welcome"/>
<%} %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html>
<head>
    <jsp:include page="/includes/head.jsp" />
    <title><bean:message key="Index.titre"/></title>
</head>
<body>
	<jsp:include page="/includes/top.jsp" />
	<jsp:include page="/includes/vote.jsp" /> 
	<jsp:include page="/includes/bottom.jsp" />      
</body>
</html:html>