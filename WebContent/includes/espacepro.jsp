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
		     <h3><bean:message key="Info.personelle"/></h3>
		     <table>
				<tr>
					<td><bean:message key="Nom"/></td>
					<td><bean:write name="PRO" property="nom"/></td>
				</tr>
				<tr>
					<td><bean:message key="Prenom"/></td>
					<td><bean:write name="PRO" property="prenom"/></td>
				</tr>
				<tr>
					<td><bean:message key="Login"/></td>
					<td><bean:write name="PRO" property="login"/></td>
	
				</tr>
				<tr>
					<td><bean:message key="Adresse"/></td>
					<td><bean:write name="PRO" property="adresse"/></td>
				</tr>
				<tr>
					<td><bean:message key="date.inscription"/></td>
					<td><bean:write name="PRO" property="dateInscription"/></td>
				</tr>
				<tr>
					<td><bean:message key="derniere.connexion"/></td>
					<td><bean:write name="PRO" property="derniereConnexion"/></td>
				</tr>	
			</table>
			<p>
			<span class="art-button-wrapper">
			            	<span class="l"> </span>
			            	<span class="r"> </span>
			            	<html:link action="/lienmodifierpro.do" styleClass="art-button">Modifier mon profil</html:link>
	            		</span></p>
			<logic:present name="VOTES" scope="session">
			<h3><bean:message key="Vote"/></h3>
			<table>
				<tr>
					<th><bean:message key="Film"/></th>
					<th><bean:message key="Note"/></th>
				</tr>
				<logic:iterate id="votes" name="VOTES" scope="session">
				<tr>
					<td><bean:write name="votes" property="film"/></td>
					<td><bean:write name="votes" property="note"/></td>
				</tr>
				</logic:iterate>	
			</table>
			</logic:present><p>
			<span class="art-button-wrapper">
			            	<span class="l"> </span>
			            	<span class="r"> </span>
			            	<html:link action="/effectuerUnVote.do" styleClass="art-button"><bean:message key="Effectuer.un.vote"/></html:link>
	            		</span></p>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>