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
		<html:form action="/ajoutcasting.do">
		<html:hidden property="idFilm" name="FILM"/>
			<tr>
				<td>Personne</td>
				<td>
				<html:select property="codePersonne" >
					<html:options property="idPersonne" collection="LISTEPERSONNES" labelProperty="nom"/>
				</html:select>
				</td>
			</tr>
			<tr>
				<td>Rôle</td>
				<td><html:select property="role">
					<html:option value="acteur">Acteur</html:option>
					<html:option value="producteur">Producteur</html:option>
					<html:option value="realisateur">Réalisateur</html:option>
				</html:select></td>
			</tr>
			<tr>
				<td><html:cancel><bean:message key="Annuler"/></html:cancel></td>
				<td><html:submit><bean:message key="Inscription"/></html:submit></td>
			</tr>	
		</html:form>
	</table>
	
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
	</body>

</html:html>