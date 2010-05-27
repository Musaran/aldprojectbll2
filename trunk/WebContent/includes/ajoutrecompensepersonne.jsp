<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              <bean:message key="Ajout.recompense"/> <bean:write name="PERSONNE" property="nom"/> <bean:write name="PERSONNE" property="prenom"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <html:form action="/ajoutrecompensepersonne.do">
		     	<table>	
						<html:hidden property="idPersonne" name="PERSONNE"/>
							<tr>
								<td><bean:message key="recompense"/></td>
								<td>
								<html:select property="codeRecompense" >
									<html:options property="idRecompense" collection="RECOMPENSES" labelProperty="nomRecompense"/>
								</html:select>
								</td>
							</tr>
							<tr>
								<td><bean:message key="type.recompense"/></td>
								<td><html:select property="codeTypeRecompense" >
									<html:options property="idTypeRecompensePersonne" collection="TYPERECOMPENSES" labelProperty="nomTypeRecompensePersonne"/>
								</html:select></td>
							</tr>	
							<tr>
								<td><bean:message key="annee"/></td>
								<td><html:text property="annee" size="4"  maxlength="4"></html:text></td>
							</tr>	
					</table><br /><br />
						<html:reset styleClass="art-button">Effacer</html:reset>&nbsp;
				<html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel>&nbsp;
				<html:submit styleClass="art-button"><bean:message key="Valider"/></html:submit>
			              	
		     </html:form>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>