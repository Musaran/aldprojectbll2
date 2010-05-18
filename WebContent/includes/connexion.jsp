<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<!-- ----------------------------Pro Connecté--------------------------------------------- -->

<% if(session.getAttribute("login") != null){ %>
	Bienvenue <%= session.getAttribute("login") %> !
	<%-- se deconnecter --%>
	<html:link action="/deconnexion.do"><bean:message key="Deconnecter"/></html:link>
	
	
<!-- ----------------------------non Connecté--------------------------------------------- -->

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
			<tr>
				<td><html:link href="./inscription.jsp"><bean:message key="Inscription"/></html:link></td>
			</tr>
		</table>				
	</html:form>
<% } %>
