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
	<html:form action="/ajoutfilm.do" enctype="multipart/form-data">
		<div  >
			<table>
				<tr>
					<td><bean:message key="Titre"/></td>
					<td><html:text styleId="s" property="titre" size="15"/></td>
				</tr>
				<tr>
					<td><bean:message key="Sortie"/></td>
					<td><html:text styleId="s" property="dateSortie" size="15"/>&nbsp; AAAA-MM-JJ</td>
				</tr>
				<tr>
					<td><bean:message key="Cout"/></td>
					<td><html:text styleId="s" property="cout" size="15"/>&nbsp; Euros</td>
	
				</tr>
				<tr>
					<td><bean:message key="Synopsis"/></td>
					<td><html:textarea styleId="s" property="synopsis" cols="30" rows="10"></html:textarea></td>
				</tr>
				<tr>
					<td><bean:message key="Affiche"/></td>
					<td><html:file styleId="s" property="file"></html:file></td>
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