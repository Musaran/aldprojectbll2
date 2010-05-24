<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
      <div class="art-Post-inner">
          <h2 class="art-PostHeaderIcon-wrapper">
              <span class="art-PostHeader">
              Personnes
              </span>
          </h2>
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
						<bean:write name="liste" property="nom"/> <bean:write name="liste" property="prenom"/>
					</html:link>
					<%} else {%>
						<bean:write name="liste" property="nom"/> <bean:write name="liste" property="prenom"/>
					<%} %>
				</h1>
	              <p>
	              	<% if(session.getAttribute("login") != null){ %>
				<bean:message key="date.de.naissance"/>: <bean:write name="liste" property="dateDeNaissance"/><br /><br />
				<b><bean:message key="biographie"/></b>: <bean:write name="liste" property="biographie"/>
				<%} %></p>
				<% if(session.getAttribute("login") != null){ %>
	              <p>
	              	<span class="art-button-wrapper">
	              		<span class="l"> </span>
	              		<span class="r"> </span>
						<html:link styleClass="art-button" action="/lienmodifierpersonne.do" paramId="code" paramName="liste" paramProperty="idPersonne">
							Editer
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