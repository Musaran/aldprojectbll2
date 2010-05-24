<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
      <div class="art-Post-inner">
          <h2 class="art-PostHeaderIcon-wrapper">
              <span class="art-PostHeader">
              Films
              </span>
          </h2>
          <logic:iterate id="liste" name="LISTEFILMS" scope="session">
	          <div class="art-PostContent">
	              <% if(session.getAttribute("login") != null){ %>
					<html:link action="/apercufilm.do" paramId="code" paramName="liste" paramProperty="idFilm">
						<img class="art-article" src="<bean:write name="liste" property="affiche"/>"  height="150px" style="float: left"/>
					</html:link>
					<%} else {%>
					<img class="art-article" src="<bean:write name="liste" property="affiche"/>"  height="150px" style="float: left"/>
					<%} %>
	              <h1>
		              <% if(session.getAttribute("login") != null){ %>
					<html:link action="/apercufilm.do" paramId="code" paramName="liste" paramProperty="idFilm">
					<bean:write name="liste" property="titre"/>
					</html:link>
					<%}  else {%>
					<bean:write name="liste" property="titre"/>
					<%} %>
				</h1>
	              <p><bean:message key="Note"/>: <bean:write name="liste" property="noteMoyenne"/> /10<br />
				<% if(session.getAttribute("login") != null){ %>
					<bean:message key="Sortie"/>: <bean:write name="liste" property="dateSortie"/><br />
					<bean:message key="Cout"/>: <bean:write name="liste" property="cout"/> Euros<br />
					<bean:message key="Synopsis"/>: <p><bean:write name="liste" property="synopsis"/></p>
				<%} %></p>
				<% if(session.getAttribute("login") != null){ %>
	              <p>
	              	<span class="art-button-wrapper">
	              		<span class="l"> </span>
	              		<span class="r"> </span>
	              		
						<html:link styleClass="art-button" action="/lienmodifierfilm.do" paramId="code" paramName="liste" paramProperty="idFilm">
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