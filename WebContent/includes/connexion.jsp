<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div style="color:white">
<!-- ----------------------------Pro Connecté--------------------------------------------- -->

<% if(session.getAttribute("login") != null){ %>
	
	<bean:message key="bienvenue" /> <%= session.getAttribute("login") %> ! &nbsp;
	
	<%-- se deconnecter --%>
	
	<b><html:link style="color:white" action="/deconnexion.do" ><bean:message key="Deconnecter"/></html:link></b>
	
<!-- ----------------------------non Connecté--------------------------------------------- -->

<% }else{ %>
	<html:form action="/connexion.do">
		<table>
			<tr>
				<td>
					<html:text property="login" size="15" onfocus="javascript:this.value=''" style="color:#090909;"/>
				</td>
				<td>
					<html:password property="motDePasse" size="10" onfocus="javascript:this.value=''" style="color:#090909;"/>
				</td>
				<td>
					<html:submit ><bean:message key="Connecter"/></html:submit>&nbsp;
				</td>
				
			</tr>
			<tr>
				<td>
					<b><html:link style="color:white" href="/sitewebald/vues/inscription.jsp"><bean:message key="Inscription"/></html:link></b>
				</td>
			</tr>
			<!--tr>
				<td><html:errors/></td>
			</tr-->
		</table>				
	</html:form>
<% } %>
</div>
