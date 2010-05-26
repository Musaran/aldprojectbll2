<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<% if(session.getAttribute("login") ==	 null){%>
<logic:forward name="welcome"/>
<%} %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html>
<head>
    <jsp:include page="/includes/head.jsp" />
    <title><bean:message key="Index.titre"/></title>
</head>
<body>
	<jsp:include page="/includes/top.jsp" />
	<table>
		<html:form action="/vote.do">
			<tr>
				<td><bean:message key="Vote.film"/></td>
				<td>
				<html:select property="codeFilm">
				<html:options collection="FILM_A_VOTER"
								labelProperty="titre"
								property="idFilm"/>
				</html:select>
				
				
				</td>
			</tr>
			<tr>
				<td><bean:message key="Vote.note"/></td>
				<td><html:text property="note" size="15" onfocus="javascript:this.value=''" style="color:#090909;"/></td>
			</tr>
			
			<tr>
				<td><html:cancel ><bean:message key="Annuler"/></html:cancel></td>
				<td><html:submit ><bean:message key="Enregistrer"/></html:submit></td>
			</tr>	
		</html:form>
	</table>

	<jsp:include page="/includes/bottom.jsp" />      
</body>
</html:html>