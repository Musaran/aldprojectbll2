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
	<html:form action="/modifierpersonne.do" enctype="multipart/form-data">
	<html:hidden property="idPersonne" name="PERSONNE"/>
	<html:hidden property="photo" name="PERSONNE"/>
	<div  style="float:left;border-right: 1px solid black;padding-right: 10px;">
		<table>
			<tr>
				<td>Nom</td>
				<td><html:text property="nom" size="15" name="PERSONNE"/></td>
			</tr>
			<tr>
				<td>Prénom</td>
				<td><html:text property="prenom" size="15" name="PERSONNE" />&nbsp;</td>
			</tr>
			<tr>
				<td>Date de naissance</td>
				<td><html:text property="dateDeNaissance" size="15" name="PERSONNE"/>&nbsp; AAAA-MM-JJ</td>
			</tr>
			<tr>
				<td>Biographie</td>
				<td><html:textarea property="biographie" name="PERSONNE" cols="30" rows="10"></html:textarea></td>
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
				<td>Photo</td>
				<td><img src="<bean:write name="PERSONNE" property="photo"/>"  height="150px"/></td>
			</tr>
			<tr>
				<td colspan="2"><html:file property="file">Parcourir...</html:file></td>
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