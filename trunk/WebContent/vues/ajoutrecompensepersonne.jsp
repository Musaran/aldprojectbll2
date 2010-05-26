<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<html:html>
<head>
	<jsp:include page="/includes/head.jsp" />
	<title><bean:message key="Index.titre"/></title>
</head>
<body>
	<jsp:include page="/includes/top.jsp" />
	<!-- ---------------------Contenu---------------------------- -->
	
	<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              Ajout d'une récompense à <bean:write name="PERSONNE" property="nom"/> <bean:write name="PERSONNE" property="prenom"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <html:form action="/ajoutrecompensepersonne.do">
		     	<table>	
						<html:hidden property="idPersonne" name="PERSONNE"/>
							<tr>
								<td>Récompense</td>
								<td>
								<html:select property="codeRecompense" >
									<html:options property="idRecompense" collection="RECOMPENSES" labelProperty="nomRecompense"/>
								</html:select>
								</td>
							</tr>
							<tr>
								<td>Type de récompense</td>
								<td><html:select property="codeTypeRecompense" >
									<html:options property="idTypeRecompensePersonne" collection="TYPERECOMPENSES" labelProperty="nomTypeRecompensePersonne"/>
								</html:select></td>
							</tr>	
							<tr>
								<td>Année</td>
								<td><html:text property="annee" size="4" ></html:text></td>
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
			              		<html:submit styleClass="art-button">Ajouter</html:submit>	
			              						
			              	</span>
			              	
		     </html:form>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
	</body>

</html:html>