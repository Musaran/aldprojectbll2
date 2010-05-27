<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              <bean:message key="Ajout.recompense"/> <bean:write name="FILM" property="titre"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <html:form action="/ajoutrecompensefilm.do">
		     	<table>	
						<html:hidden property="idFilm" name="FILM"/>
							<tr>
								<td><bean:message key="Personne"/></td>
								<td>
								<html:select property="codeRecompense" >
									<html:options property="idRecompense" collection="RECOMPENSES" labelProperty="nomRecompense"/>
								</html:select>
								</td>
							</tr>
							<tr>
								<td><bean:message key="role"/></td>
								<td><html:select property="codeTypeRecompense" >
									<html:options property="idTypeRecompenseFilm" collection="TYPERECOMPENSES" labelProperty="nomTypeRecompenseFilm"/>
								</html:select></td>
							</tr>		
							<tr>
								<td><bean:message key="annee"/></td>
								<td><html:text property="annee" value="" size="4"  maxlength="4"></html:text></td>
							</tr>	
					</table><br /><br />
						<html:reset styleClass="art-button"><bean:message key="Effacer"/></html:reset>&nbsp;
				<html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel>&nbsp;
				<html:submit styleClass="art-button"><bean:message key="Valider"/></html:submit>
			              	
		     </html:form>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>