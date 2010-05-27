<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
      <div class="art-Post-inner">
          <h2 class="art-PostHeaderIcon-wrapper">
              <span class="art-PostHeader">
              <bean:message key="modification.de"/> <bean:write name="FILM" property="titre"/>
              </span>
          </h2>
	          <div class="art-PostContent">
	          <p>
	<html:form action="/modifierfilm.do" enctype="multipart/form-data">
	<html:hidden property="idFilm" name="FILM"/>
	<html:hidden property="affiche" name="FILM"/>
	<div  style="float:left;border-right: 1px solid black;padding-right: 10px;">
		<table>
			<tr>
				<td><bean:message key="Titre"/></td>
				<td><html:text styleId="s" property="titre" size="15" name="FILM"/></td>
			</tr>
			<tr>
				<td><bean:message key="Sortie"/></td>
				<td><html:text styleId="s" property="dateSortie" size="15" name="FILM" />&nbsp; AAAA-MM-JJ</td>
			</tr>
			<tr>
				<td><bean:message key="Cout"/></td>
				<td><html:text styleId="s" property="cout" size="15" name="FILM"/>&nbsp; Euros</td>

			</tr>
			<tr>
				<td><bean:message key="Synopsis"/></td>
				<td><html:textarea styleId="s" property="synopsis" name="FILM" cols="30" rows="10"></html:textarea></td>
			</tr>
			
			<tr>
				<td><html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel></td>
				<td><html:submit styleClass="art-button"><bean:message key="Enregistrer"/></html:submit></td>
			</tr>	
		</table>
	</div>
	<div style="float:left;padding-left: 10px;">
		<table>
			<tr>
				<td><bean:message key="Affiche"/></td>
				<td><img class="art-article" src="<bean:write name="FILM" property="affiche"/>"  height="150px"/></td>
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