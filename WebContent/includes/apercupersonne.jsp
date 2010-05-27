<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
      <div class="art-Post-inner">
          <h2 class="art-PostHeaderIcon-wrapper">
              <span class="art-PostHeader">
              <bean:write name="PERSONNE" property="nom"/> <bean:write name="PERSONNE" property="prenom"/>
              </span>
          </h2>
	          <div class="art-PostContent">
	              <img class="art-article" src="<bean:write name="PERSONNE" property="photo"/>"  height="150px" style="float:left"/>
	              <p>
	              	<bean:message key="Popularite"/>: <bean:write name="PERSONNE" property="nombreRequetes"/> <bean:message key="requetes"/><br />
			<bean:message key="date.de.naissance"/>: <bean:write name="PERSONNE" property="dateDeNaissance"/><br />
			<br /><br />
					<b><bean:message key="biographie"/></b>: 

					<bean:write name="PERSONNE" property="biographie"/>
					</p>
				<% if(session.getAttribute("login") != null){ %>
	              <p>
	              	<span class="art-button-wrapper">
	              		<span class="l"> </span>
	              		<span class="r"> </span>		
							<html:link styleClass="art-button" action="/lienmodifierpersonne.do" paramId="code" paramName="PERSONNE" paramProperty="idPersonne">
								<bean:message key="editer"/>
							</html:link>
	              	</span>
	              </p> 
	              <%} %>
	              <table>
					<tr>
						<td><h3><bean:message key="recompense"/>&nbsp; <html:link action="lienajoutrecompensepersonne.do" paramId="code" paramName="PERSONNE" paramProperty="idPersonne">
							<img src="../img/icones/add.png" alt="<bean:message key="Ajout.recompense"/>" title="<bean:message key="Ajout.recompense"/>" height="20px"/>
							</html:link></h3></td>
					</tr>
					<logic:iterate id="recompenses" name="RECOMPENSES" >
						<tr>
							<td>
							<bean:write name="recompenses" property="recompense"/> du <bean:write name="recompenses" property="typeRecompense"/> en <bean:write name="recompenses" property="annee"/>
							</td>
						</tr>
					</logic:iterate>
				</table>
				<h3><bean:message key="filmographie"/></h3>
				<table>
					<tr>
						<td><h3><bean:message key="acteur"/></h3></td>
					</tr>
					<logic:iterate id="acteurs" name="ACTEUR" >
						<tr>
							<td>
							<% if(session.getAttribute("login") != null){ %>
							<html:link action="/apercufilm.do" paramId="code" paramName="acteurs" paramProperty="idFilm">
								<bean:write name="acteurs" property="titre"/>
							</html:link>
							<%} else {%>
								<bean:write name="acteurs" property="titre"/>
							<%} %></td>
						</tr>
					</logic:iterate>
				</table>
				<table>
					<tr>
						<td><h3><bean:message key="producteur"/></h3></td>
					</tr>
					<logic:iterate id="producteurs" name="PRODUCTEUR" >
						<tr>
							<td><% if(session.getAttribute("login") != null){ %>
							<html:link action="/apercufilm.do" paramId="code" paramName="producteurs" paramProperty="idFilm">
								<bean:write name="producteurs" property="titre"/>
							</html:link>
							<%} else {%>
									<bean:write name="producteurs" property="titre"/>
							<%} %></td>
						</tr>
					</logic:iterate>
				</table>
				<table>
					<tr>
						<td><h3><bean:message key="realisateur"/></h3></td>
					</tr>
					<logic:iterate id="realisateurs" name="REALISATEUR" >
						<tr>
							<td><% if(session.getAttribute("login") != null){ %>
							<html:link action="/apercufilm.do" paramId="code" paramName="realisateurs" paramProperty="idFilm">
							<bean:write name="realisateurs" property="titre"/>
							</html:link>		
							<%} else{%>
								<bean:write name="realisateurs" property="titre"/>	
							<%} %></td>
						</tr>
					</logic:iterate>
				</table>
	          </div>
          
          <div class="cleared"></div>
      </div>    
        </div>
    </div>
</div>