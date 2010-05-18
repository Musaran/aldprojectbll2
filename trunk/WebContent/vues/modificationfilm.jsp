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
	
		<html:form action="/inscription.do">
			<tr>
				<td>Titre</td>
				<td><html:text property="titre" size="15" name="FILM"/></td>
			</tr>
			<tr>
				<td>Date de sortie</td>
				<td><html:text property="dateSortie" size="15" name="FILM"/></td>
			</tr>
			<tr>
				<td>Coût du film</td>
				<td><html:text property="cout" size="15" name="FILM"/></td>
			</tr>
			<tr>
				<td>Synopsis</td>
				<td><html:textarea property="synopsis" name="FILM" cols="30" rows="10"></html:textarea></td>
			</tr>
			
			<tr>
				<td><html:cancel>annuler</html:cancel></td>
				<td><html:submit>inscription</html:submit></td>
			</tr>	
		</html:form>
		
	</table>
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
</body>

</html:html>