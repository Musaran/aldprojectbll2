<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<!-- ----------------------------Pro Connecté--------------------------------------------- -->

<% if(session.getAttribute("login") != null){ %>
	
	Bienvenue <%= session.getAttribute("login") %> ! &nbsp;
	
	<%-- se deconnecter --%>
	
	<html:link action="/deconnexion.do"><bean:message key="Deconnecter"/></html:link>
	
<!-- ----------------------------non Connecté--------------------------------------------- -->

<% }else{ %>
	<html:form action="/connexion.do">
		<table>
			<tr>
				<td>
					<html:text property="login" size="15" value="Login"  onfocus="javascript:this.value=''" style="color:#090909;"/>
				</td>
				<td>
					<html:text property="motDePasse" size="10" value="Password" onfocus="javascript:this.value=''" style="color:#090909;"/>
				</td>
				<td>
					<html:submit>se connecter</html:submit>&nbsp;
				</td>
				<td>
					<html:link href="./inscription.jsp"><bean:message key="Inscription"/></html:link>
				</td>
			</tr>
			<tr>
				<td><html:errors/></td>
			</tr>
		</table>				
	</html:form>
<% } %>
