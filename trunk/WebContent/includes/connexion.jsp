<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div style="color:white">
<!-- ----------------------------Pro Connecté--------------------------------------------- -->

<% if(session.getAttribute("login") != null){ %>
	
	<h4 style="color: white;margin-top: 0px;margin-bottom: 0px;"><bean:message key="bienvenue" /> <%= session.getAttribute("login") %> !</h4>
	
	<%-- se deconnecter --%>
	<br /> <br />
	
	            		
	<b><html:link styleClass="art-button"  action="/deconnexion.do" ><bean:message key="Deconnecter"/></html:link></b>
	
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
					<html:submit  styleClass="art-button"><bean:message key="Connecter"/></html:submit>&nbsp;
				</td>
				
			</tr>
			<tr>
				<td>
					<b><html:link  styleClass="art-button" href="/sitewebald/vues/inscription.jsp"><bean:message key="Inscription"/></html:link></b>
				</td>
			</tr>
			<!--tr>
				<td><html:errors/></td>
			</tr-->
		</table>				
	</html:form>
<% } %>
</div>
