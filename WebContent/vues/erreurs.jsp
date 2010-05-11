<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><bean:message key="Erreurs.titre"/></title>
</head>
<body>
	<center><h1><bean:message key="Liste.des.erreurs"/></h1></center>
	<html:errors/>
</body>
</html:html>