<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
      <div class="art-Post-inner">
          <h2 class="art-PostHeaderIcon-wrapper">
              <span class="art-PostHeader">
              <bean:message key="resultat"/>
              </span>
          </h2>
		<logic:present name="RECHERCHEFILM" scope="session">
			<table>
				<tr>
					<th><bean:message key="Film"/></th>
				</tr>
				<logic:iterate id="rechercheFilm" name="RECHERCHEFILM" scope="session">
				<tr>
					<td>
					<% if(session.getAttribute("login") != null){ %>
					<html:link action="/apercufilm.do" paramId="code" paramName="rechercheFilm" paramProperty="idFilm">
						<bean:write name="rechercheFilm" property="titre"/> <bean:write name="rechercheFilm" property="dateSortie"/>
					</html:link>
					<% } else {%>
					<bean:write name="rechercheFilm" property="titre"/>
					<% } %>
					</td>
				</tr>
				</logic:iterate>
			</table>
		</logic:present>
	<% if(session.getAttribute("login") != null){ %>
	<logic:present name="RECHERCHEPERSONNE" scope="session">
		<table>
			<tr>
				<th><bean:message key="Personne"/></th>
			</tr>
			<logic:iterate id="recherchePersonne" name="RECHERCHEPERSONNE" scope="session">
			<tr>
				<td>
				<html:link action="/apercupersonne.do" paramId="code" paramName="recherchePersonne" paramProperty="idPersonne">
					<bean:write name="recherchePersonne" property="nom"/> <bean:write name="recherchePersonne" property="prenom"/>
				</html:link>
				</td>
			</tr>
			</logic:iterate>
		</table>
	</logic:present>
	<% } %>
      </div>    
        </div>
    </div>
</div>









