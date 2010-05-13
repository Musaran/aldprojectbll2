<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html:html>

<head>
	<jsp:include page="/includes/head.jsp" />
	<title><bean:message key="Index.titre"/></title>
</head>

<body>
	<jsp:include page="/includes/top.jsp" />
	<!-- ---------------------Contenu---------------------------- -->
	
	<table>
		<tr>
			<th>Titre</th>
			<th></th>
		</tr>
		<logic:iterate id="liste" name="LISTEFILMS" scope="session">
		<tr>
			<td><bean:write name="liste" property="titre"/></td>
			<td></td>
		</tr>
		</logic:iterate>
	</table>
	
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
	</body>

</html:html>