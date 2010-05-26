<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              Espace de <bean:write name="PRO" property="prenom"/> <bean:write name="PRO" property="nom"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
		     <h3>Informations personnelles</h3>
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
					<td>Date d'inscription</td>
					<td><bean:write name="PRO" property="dateInscription"/></td>
				</tr>
				<tr>
					<td>Dernière connexion</td>
					<td><bean:write name="PRO" property="derniereConnexion"/></td>
				</tr>	
			</table>
			<logic:present name="VOTES" scope="session">
			<h3>Votes</h3>
			<table>
				<tr>
					<th>Film</th>
					<th>Note</th>
				</tr>
				<logic:iterate id="votes" name="VOTES" scope="session">
				<tr>
					<td><bean:write name="votes" property="film"/></td>
					<td><bean:write name="votes" property="note"/></td>
				</tr>
				</logic:iterate>
			</table>
			</logic:present>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>