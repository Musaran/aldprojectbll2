<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              <bean:message key="Ajout.d'une.personne.au.casting.de"/> <bean:write name="FILM" property="titre"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <html:form action="/ajoutcasting.do">
		     	<table>	
						<html:hidden property="idFilm" name="FILM"/>
							<tr>
								<td><bean:message key="Personne"/></td>
								<td>
								<html:select property="codePersonne" >
									<html:options property="idPersonne" collection="LISTEPERSONNES" labelProperty="nom"/>
								</html:select>
								</td>
							</tr>
							<tr>
								<td><bean:message key="role"/></td>
								<td><html:select property="role">
									<html:option value="acteur"><bean:message key="acteur"/></html:option>
									<html:option value="producteur"><bean:message key="producteur"/></html:option>
									<html:option value="realisateur"><bean:message key="realisateur"/></html:option>
								</html:select></td>
							</tr>		
					</table><br /><br />
						<span class="art-button-wrapper">
			              		<span class="l"> </span>
			              		<span class="r"> </span>
			              		<html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel>
			              						
			              	</span>
			              	<span class="art-button-wrapper">
			              		<span class="l"> </span>
			              		<span class="r"> </span>
			              		<html:submit styleClass="art-button"><bean:message key="Ajouter"/></html:submit>	
			              						
			              	</span>
			              	
		     </html:form>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>