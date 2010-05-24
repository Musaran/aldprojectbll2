<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
				<td><bean:message key="Personne"/></td>
				<td>
				<html:select property="codePersonne" >
					<html:options property="idPersonne" collection="LISTEPERSONNES" labelProperty="nom"/>
				</html:select>
				</td>
			</tr>
			<tr>
				<td><bean:message key="role"/></td>
				<td><html:select property="role">
					<html:option value="acteur"><bean:message key="acteur"/></html:option>
					<html:option value="producteur"><bean:message key="producteur"/></html:option>
					<html:option value="realisateur"><bean:message key="realisateur"/></html:option>
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