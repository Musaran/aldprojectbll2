<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              <bean:message key="Ajout.film"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <html:form action="/ajoutfilm.do" enctype="multipart/form-data">
		<div   style="float:left;border-right: 1px solid black;padding-right: 10px;">
			<table>
				<tr>
					<td><bean:message key="Titre"/></td>
					<td><html:text styleId="s" property="titre" size="15"/></td>
				</tr>
				<tr>
					<td><bean:message key="Sortie"/></td>
					<td><html:text styleId="s" property="dateSortie" size="15" maxlength="10"/>&nbsp; AAAA-MM-JJ</td>
				</tr>
				<tr>
					<td><bean:message key="Cout"/></td>
					<td><html:text styleId="s" property="cout" size="15"/>&nbsp; Euros</td>
	
				</tr>
				<tr>
					<td><bean:message key="Synopsis"/></td>
					<td><html:textarea styleId="s" property="synopsis" cols="30" rows="10"></html:textarea></td>
				</tr>
				<tr>
					<td><bean:message key="Affiche"/></td>
					<td><html:file styleId="s" property="file"></html:file></td>
				</tr>
				<tr>
					<td><html:reset styleClass="art-button">Effacer</html:reset></td>
					<td><html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel>
					&nbsp;<html:submit styleClass="art-button"><bean:message key="Valider"/></html:submit></td>
				</tr>	
			</table>
		</div>
		<div style="float:left;padding-left: 10px;">
			<html:errors/>
		</div>
	</html:form>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>