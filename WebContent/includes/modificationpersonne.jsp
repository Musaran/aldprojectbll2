<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
      <div class="art-Post-inner">
          <h2 class="art-PostHeaderIcon-wrapper">
              <span class="art-PostHeader">
              <bean:message key="modification.de"/> <bean:write name="PERSONNE" property="prenom"/> <bean:write name="PERSONNE" property="nom"/>
              </span>
          </h2>
	          <div class="art-PostContent">
	          <p>
	<html:form action="/modifierpersonne.do" enctype="multipart/form-data">
	<html:hidden property="idPersonne" name="PERSONNE"/>
	<html:hidden property="photo" name="PERSONNE"/>
	<div  style="float:left;border-right: 1px solid black;padding-right: 10px;">
		<table>
			<tr>
				<td><bean:message key="Nom"/></td>
				<td><html:text styleId="s" property="nom" size="15" name="PERSONNE"/></td>
			</tr>
			<tr>
				<td><bean:message key="Prenom"/></td>
				<td><html:text styleId="s" property="prenom" size="15" name="PERSONNE" />&nbsp;</td>
			</tr>
			<tr>
				<td><bean:message key="date.de.naissance"/></td>
				<td><html:text styleId="s" property="dateDeNaissance" size="15" maxlength="10" name="PERSONNE"/>&nbsp; <bean:message key="FormatDate"/></td>
			</tr>
			<tr>
				<td><bean:message key="biographie"/></td>
				<td><html:textarea styleId="s" property="biographie" name="PERSONNE" cols="30" rows="10"></html:textarea></td>
			</tr>
			
			<tr>
				<td><html:reset styleClass="art-button"><bean:message key="Effacer"/></html:reset></td>
				<td><html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel>&nbsp;
				<html:submit styleClass="art-button"><bean:message key="Enregistrer"/></html:submit></td>
			</tr>	
		</table>
	</div>
	<div style="float:left;padding-left: 10px;">
		<table>
			<tr>
				<td><bean:message key="Photo"/></td>
				<td><img class="art-article" src="<bean:write name="PERSONNE" property="photo"/>"  height="150px"/></td>
			</tr>
			<tr>
				<td colspan="2"><html:file styleId="s" property="file"></html:file></td>
			</tr>
		</table>
	</div>
	</html:form>
		</p>
	</div>
          
          <div class="cleared"></div>
      </div>    
        </div>
    </div>
</div>