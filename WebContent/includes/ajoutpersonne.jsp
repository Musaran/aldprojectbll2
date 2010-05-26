<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              Ajout d'une personne
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <html:form action="/ajoutpersonne.do" enctype="multipart/form-data">
	<div  >
		<table>
			<tr>
				<td><bean:message key="Nom"/></td>
				<td><html:text styleId="s" property="nom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="Prenom"/></td>
				<td><html:text styleId="s" property="prenom" size="15" /></td>
			</tr>
			<tr>
				<td><bean:message key="date.de.naissance"/></td>
				<td><html:text styleId="s" property="dateDeNaissance" size="15" />&nbsp; AAAA-MM-JJ</td>
			</tr>
			<tr>
				<td><bean:message key="biographie"/></td>
				<td><html:textarea styleId="s" property="biographie" cols="30" rows="10"></html:textarea></td>
			</tr>
			<tr>
				<td><bean:message key="Photo"/></td>
				<td><html:file styleId="s" property="file">Parcourir...</html:file></td>
			</tr>
			<tr>
				<td><html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel></td>
				<td><html:submit styleClass="art-button">Valider</html:submit></td>
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