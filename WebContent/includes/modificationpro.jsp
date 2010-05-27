<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              <bean:message key="espace.de"/> <bean:write name="PRO" property="prenom"/> <bean:write name="PRO" property="nom"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <h3><bean:message key="Modifier.profil"/></h3>

			<html:form action="/modifierpro.do">
			<html:hidden name="PRO" property="login"/>
	<table>
		
			<tr>
				<td><bean:message key="Nom"/></td>
				<td><html:text styleId="s" name="PRO" property="nom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="Prenom"/></td>
				<td><html:text styleId="s" name="PRO" property="prenom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="Adresse"/></td>
				<td><html:text styleId="s" name="PRO" property="adresse" size="30" /></td>
			</tr>
			<tr>
				<td><bean:message key="Mot.de.passe"/></td>
				<td><html:password styleId="s" name="PRO" property="password" size="10" /></td>
			</tr>
			<tr>
				<td><bean:message key="Confirm.mot.de.passe"/></td>
				<td><html:password styleId="s" property="confpass" size="10" value=""/></td>
			</tr>
			<tr>
				<td><html:reset styleClass="art-button"><bean:message key="Effacer"/></html:reset></td>
				<td><html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel>&nbsp;
				<html:submit styleClass="art-button"><bean:message key="Enregistrer"/></html:submit></td>
			</tr>	
		
	</table>
	
	</html:form>
			
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>