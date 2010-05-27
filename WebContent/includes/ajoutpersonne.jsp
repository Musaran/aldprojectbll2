<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              <bean:message key="Ajout.personne"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <html:form action="/ajoutpersonne.do" enctype="multipart/form-data">
	<div  >
		<table>
			<tr>
				<td><bean:message key="Nom"/></td>
				<td><html:text styleId="s" value="" property="nom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="Prenom"/></td>
				<td><html:text styleId="s" value="" property="prenom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="date.de.naissance"/></td>
				<td><html:text styleId="s" value="" property="dateDeNaissance" size="15"  maxlength="10"/>&nbsp; <bean:message key="FormatDate"/></td>
			</tr>
			<tr>
				<td><bean:message key="biographie"/></td>
				<td><html:textarea styleId="s" value="" property="biographie" cols="30" rows="10"></html:textarea></td>
			</tr>
			<tr>
				<td><bean:message key="Photo"/></td>
				<td><html:file styleId="s" property="file"></html:file></td>
			</tr>
			<tr>
				<td><html:reset styleClass="art-button"><bean:message key="Effacer"/></html:reset></td>
				<td>
				<html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel>&nbsp;
				<html:submit styleClass="art-button"><bean:message key="Valider"/></html:submit></td>
			</tr>	
		</table>
	</div>
	</html:form>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>