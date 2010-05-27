<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
      <div class="art-Post-inner">
          <h2 class="art-PostHeaderIcon-wrapper">
              <span class="art-PostHeader">
              <bean:message key="Personne"/>
              </span>
          </h2>
          <% if(session.getAttribute("login") != null){ %>
          <div class="art-PostContent">
          
	              <p>
	              	<span class="art-button-wrapper">
	              		<span class="l"> </span>
	              		<span class="r"> </span>
	              		
						<html:link styleClass="art-button" href="ajoutpersonne.jsp">
							<bean:message key="Ajout.personne"/>
						</html:link>
						
	              	</span>
	              </p> 
	              
          </div>
          <div class="cleared"></div>
          <%} %>
			<logic:iterate id="liste" name="LISTEPERSONNES" scope="session">
	          <div class="art-PostContent">	
	              <% if(session.getAttribute("login") != null){ %>
					<html:link action="/apercupersonne.do" paramId="code" paramName="liste" paramProperty="idPersonne">
					<img class="art-article" src="<bean:write name="liste" property="photo"/>"  height="150px" style="float: left"/>
					</html:link>
					<%} else {%>
					<img class="art-article" src="<bean:write name="liste" property="photo"/>"  height="150px" style="float: left"/>
					<%} %>
	              <h1>
	              	<% if(session.getAttribute("login") != null){ %>
					<html:link action="/apercupersonne.do" paramId="code" paramName="liste" paramProperty="idPersonne">
						<bean:write name="liste" property="prenom"/> <bean:write name="liste" property="nom"/>
					</html:link>
					<%} else {%>
						<bean:write name="liste" property="prenom"/> <bean:write name="liste" property="nom"/>
					<%} %>
				</h1>
	              <p>
	              	<% if(session.getAttribute("login") != null){ %>
				<b><bean:message key="date.de.naissance"/>:</b> <bean:write name="liste" property="dateDeNaissance"/><br /><br />
				
				<%} %></p>
				<% if(session.getAttribute("login") != null){ %>
	              <p>
	              	<span class="art-button-wrapper">
	              		<span class="l"> </span>
	              		<span class="r"> </span>
						<html:link styleClass="art-button" action="/lienmodifierpersonne.do" paramId="code" paramName="liste" paramProperty="idPersonne">
							<bean:message key="editer"/>
						</html:link>
	              	</span>
	              </p> 
	              <%} %>
	          </div>
          <div class="cleared"></div>
          </logic:iterate>
      </div>    
        </div>
    </div>
</div>