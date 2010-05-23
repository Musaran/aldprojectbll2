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
	<html:form action="/modifierfilm.do" enctype="multipart/form-data">
	<html:hidden property="idFilm" name="FILM"/>
	<html:hidden property="affiche" name="FILM"/>
	<div  style="float:left;border-right: 1px solid black;padding-right: 10px;">
		<table>
			<tr>
				<td><bean:message key="Titre"/></td>
				<td><html:text property="titre" size="15" name="FILM"/></td>
			</tr>
			<tr>
				<td><bean:message key="Sortie"/></td>
				<td><html:text property="dateSortie" size="15" name="FILM" />&nbsp; AAAA-MM-JJ</td>
			</tr>
			<tr>
				<td><bean:message key="Cout"/></td>
				<td><html:text property="cout" size="15" name="FILM"/>&nbsp; Euros</td>
			</tr>
			<tr>
				<td><bean:message key="Synopsis"/></td>
				<td><html:textarea property="synopsis" name="FILM" cols="30" rows="10"></html:textarea></td>
			</tr>
			
			<tr>
				<td><html:cancel><bean:message key="Annuler"/></html:cancel></td>
				<td><html:submit><bean:message key="Enregistrer"/></html:submit></td>
			</tr>	
		</table>
	</div>
	<div style="float:left;padding-left: 10px;">
		<table>
			<tr>
				<td><bean:message key="Affiche"/></td>
				<td><img src="<bean:write name="FILM" property="affiche"/>"  height="150px"/></td>
			</tr>
			<tr>
				<td colspan="2"><html:file property="file"></html:file></td>
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