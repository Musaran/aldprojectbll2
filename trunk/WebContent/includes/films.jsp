<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-content">
    <div class="art-Post">
        <div class="art-Post-body">
	      <div class="art-Post-inner">
	          <h2 class="art-PostHeaderIcon-wrapper">
	              <span class="art-PostHeader">
	              <bean:message key="Film"/>
	              </span>
	          </h2>
	          <% if(session.getAttribute("login") != null){ %>
	          <div class="art-PostContent">
		              <p>
		              	<span class="art-button-wrapper">
		              		<span class="l"> </span>
		              		<span class="r"> </span>
		              		
							<html:link styleClass="art-button" href="ajoutfilm.jsp">
								<bean:message key="Ajout.film"/>
							</html:link>
							
		              	</span>
		              </p>  
	          </div>
	          <div class="cleared"></div>
	          <%} %>
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
		              <p><b><bean:message key="Note"/>:</b> <bean:write name="liste" property="noteMoyenne"/> /10<br />
					<% if(session.getAttribute("login") != null){ %>
						<b><bean:message key="Sortie"/>:</b> <bean:write name="liste" property="dateSortie"/><br />
						<b><bean:message key="Cout"/>:</b> <bean:write name="liste" property="cout"/> Euros<br /><br />
						<b><bean:message key="Synopsis"/>:</b> </p><p><bean:write name="liste" property="synopsis"/></p>
					<%} %>
					<% if(session.getAttribute("login") != null){ %>
		              <p>
		              	<span class="art-button-wrapper">
		              		<span class="l"> </span>
		              		<span class="r"> </span>
		              		
							<html:link styleClass="art-button" action="/lienmodifierfilm.do" paramId="code" paramName="liste" paramProperty="idFilm">
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