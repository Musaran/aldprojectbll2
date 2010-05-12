<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<% String loginSession = (String)session.getAttribute("login"); %>
<% if(loginSession != null){ %>
	Bienvenue <%= loginSession %> !
	<%-- se deconnecter --%>
	<html:link action="/deconnexion.do"><bean:message key="Deconnecter"/></html:link>
<% }else{ %>
	<html:form action="/connexion.do">
		<table>
			<tr>
				<td><bean:message key="Login"/></td>
				<td><html:text property="login" size="10" /></td>
			</tr>
			<tr>
				<td><bean:message key="Mot.de.passe"/></td>
				<td><html:text property="motDePasse" size="10" /></td>
				<td><html:submit>OK</html:submit></td>
			</tr>
			<tr>
				<td><html:errors/></td>
			</tr>
		</table>				
	</html:form>
<% } %>
