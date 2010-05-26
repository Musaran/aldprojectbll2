<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<% if(session.getAttribute("login") != null){ %>

<html:html>

<head>
	<jsp:include page="/includes/head.jsp" />
	<title><bean:message key="Index.titre"/></title>
</head>

<body>
	<jsp:include page="/includes/top.jsp" />
	<!-- ---------------------Contenu---------------------------- -->
	<html:form action="/ajoutpersonne.do" enctype="multipart/form-data">
	<div  >
		<table>
			<tr>
				<td><bean:message key="Nom"/></td>
				<td><html:text styleId="s" property="nom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="Prenom"/></td>
				<td><html:text styleId="s" property="prenom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="date.de.naissance"/></td>
				<td><html:text styleId="s" property="dateDeNaissance" size="15" />&nbsp; AAAA-MM-JJ</td>
			</tr>
			<tr>
				<td><bean:message key="biographie"/></td>
				<td><html:textarea styleId="s" property="biographie" cols="30" rows="10"></html:textarea></td>
			</tr>
			<tr>
				<td><bean:message key="Photo"/></td>
				<td><html:file styleId="s" property="file">Parcourir...</html:file></td>
			</tr>
			<tr>
				<td><html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel></td>
				<td><html:submit styleClass="art-button">Valider</html:submit></td>
			</tr>	
		</table>
	</div>
	</html:form>
		
	
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
</body>

</html:html>
<% } else { %>
	<logic:forward name="welcome"/>
<%} %>