<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<% if(session.getAttribute("login") != null){ %>
	<logic:forward name="welcome"/>
<%} %>
<html:html>

<head>
	<jsp:include page="/includes/head.jsp" />
	<title><bean:message key="Index.titre"/></title>
</head>

<body>
	<jsp:include page="/includes/top.jsp" />
	<!-- ---------------------Contenu---------------------------- -->
	<table>
		<html:form action="/inscription.do">
			<tr>
				<td><bean:message key="Nom"/></td>
				<td><html:text styleId="s" property="nom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="Prenom"/></td>
				<td><html:text styleId="s" property="prenom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="Adresse"/></td>
				<td><html:text styleId="s" property="adresse" size="30" /></td>
			</tr>
			<tr>
				<td><bean:message key="Login"/></td>
				<td><html:text styleId="s" property="login" size="10" /></td>
			</tr>
			<tr>
				<td><bean:message key="Mot.de.passe"/></td>
				<td><html:password styleId="s" property="password" size="10" /></td>
			</tr>
			<tr>
				<td><bean:message key="Confirm.mot.de.passe"/></td>
				<td><html:password styleId="s" property="confpass" size="10" /></td>
			</tr>
			<tr>
				<td><html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel></td>
				<td><html:submit styleClass="art-button"><bean:message key="Inscription"/></html:submit></td>
			</tr>	
		</html:form>
	</table>
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
</body>

</html:html>