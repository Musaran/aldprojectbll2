<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              Evaluer un film
		              </span>
		          </h2>
		     <div class="art-PostContent"><p>	
		     <html:form action="/vote.do">
		<table>
			<tr>
				<td><bean:message key="Vote.film"/></td>
				<td>
				<html:select property="codeFilm">
				<html:options collection="FILM_A_VOTER"
								labelProperty="titre"
								property="idFilm"/>
				</html:select>
				
				
				</td>
			</tr>
			<tr>
				<td><bean:message key="Vote.note"/></td>
				<td><html:text property="note" size="15" maxlength="2"/> /10</td>
			</tr>
			
			<tr>
				<td><html:cancel styleClass="art-button"><bean:message key="Annuler"/></html:cancel></td>
				<td><html:submit styleClass="art-button"><bean:message key="Enregistrer"/></html:submit></td>
			</tr>	
			</table>
			
		</html:form></p>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>