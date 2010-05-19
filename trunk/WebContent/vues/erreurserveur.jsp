<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<html:html>
<head>
	<jsp:include page="/includes/head.jsp" />
	<title><bean:message key="Erreurs.titre"/></title>
</head>
<body>
	<jsp:include page="/includes/top.jsp" />
	<!-- ---------------------Contenu---------------------------- -->
	
	<center><h1><bean:message key="Liste.des.erreurs"/></h1></center>
	<bean:message key="Erreur.requete.formulee"/>
	
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
</body>
</html:html>