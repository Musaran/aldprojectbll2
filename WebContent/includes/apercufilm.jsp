<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
      <div class="art-Post-inner">
          <h2 class="art-PostHeaderIcon-wrapper">
              <span class="art-PostHeader">
              <bean:write name="FILM" property="titre"/>
              </span>
          </h2>
	          <div class="art-PostContent">
	              <img class="art-article" src="<bean:write name="FILM" property="affiche"/>"  height="150px" style="float:left"/>
	              <p>
	              	<bean:message key="Note"/>: <bean:write name="FILM" property="noteMoyenne"/> /10<br />
					<bean:message key="Sortie"/>: <bean:write name="FILM" property="dateSortie"/><br />
					<bean:message key="Cout"/>: <bean:write name="FILM" property="cout"/> Euros<br /><br />
					<b><bean:message key="Synopsis"/></b>: 

					<bean:write name="FILM" property="synopsis"/>
					</p>
				<% if(session.getAttribute("login") != null){ %>
	              <p>
	              	<span class="art-button-wrapper">
	              		<span class="l"> </span>
	              		<span class="r"> </span>		
							<html:link styleClass="art-button" action="/lienmodifierfilm.do" paramId="code" paramName="FILM" paramProperty="idFilm">
								<bean:message key="editer"/>
							</html:link>
	              	</span>
	              </p> 
	              <%} %>
	              <table>
					<tr>
						<td><h3><bean:message key="recompense"/>&nbsp; <html:link action="lienajoutrecompensefilm.do" paramId="code" paramName="FILM" paramProperty="idFilm">
							<img src="../img/icones/add.png" alt="<bean:message key="Ajout.recompense"/>" title="<bean:message key="Ajout.recompense"/>" height="20px"/>
							</html:link>	
							</h3>
						</td>
					</tr>
					<logic:iterate id="recompenses" name="RECOMPENSES" >
						<tr>
							<td>
							<bean:write name="recompenses" property="recompense"/> du <bean:write name="recompenses" property="typeRecompense"/> en <bean:write name="recompenses" property="annee"/>  
							</td>
						</tr>
					</logic:iterate>
				</table>
				<table>
					<tr>
						<td><h3><bean:message key="acteurs"/>&nbsp; <html:link action="lienajoutcasting.do" paramId="code" paramName="FILM" paramProperty="idFilm">
							<img src="../img/icones/add.png" alt="<bean:message key="Ajout.casting"/>" title="<bean:message key="Ajout.casting"/>" height="20px"/>
							</html:link>	</h3></td>
						
					</tr>
					<logic:iterate id="acteurs" name="ACTEURS" >
						<tr>
							<td>
							<html:link action="/apercupersonne.do" paramId="code" paramName="acteurs" paramProperty="idPersonne">
							<bean:write name="acteurs" property="nom"/> <bean:write name="acteurs" property="prenom"/>
							</html:link>
							</td>
						</tr>
					</logic:iterate>
				</table>
				<table>
					<tr>
						<td><h3><bean:message key="producteurs"/></h3></td>
					</tr>
					<logic:iterate id="producteurs" name="PRODUCTEURS" >
						<tr>
							<td>
							<html:link action="/apercupersonne.do" paramId="code" paramName="producteurs" paramProperty="idPersonne">
							<bean:write name="producteurs" property="nom"/> <bean:write name="producteurs" property="prenom"/>
							</html:link>
							</td>
						</tr>
					</logic:iterate>
				</table>
				<table>
					<tr>
						<td><h3><bean:message key="realisateurs"/></h3></td>
					</tr>
					<logic:iterate id="realisateurs" name="REALISATEURS" >
						<tr>
							<td>
							<html:link action="/apercupersonne.do" paramId="code" paramName="realisateurs" paramProperty="idPersonne">
							<bean:write name="realisateurs" property="nom"/> <bean:write name="realisateurs" property="prenom"/>
							</html:link>
							</td>
						</tr>
					</logic:iterate>
				</table>
	          </div>
          
          <div class="cleared"></div>
      </div>    
        </div>
    </div>
</div>