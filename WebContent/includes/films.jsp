<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<table id="film">
<logic:iterate id="liste" name="LISTEFILMS" scope="session">
		<tr id="head">
			<td colspan="2">
				<html:link action="/apercufilm.do" paramId="code" paramName="liste" paramProperty="idFilm">
				<h2><bean:write name="liste" property="titre"/></h2>
				</html:link>
			</td>
			<td rowspan="2">
				<% if(session.getAttribute("login") != null){ %>
				<html:link action="/lienmodifierfilm.do" paramId="code" paramName="liste" paramProperty="idFilm">
					<img src="../img/edit.png" alt="Editer" title="Editer" height="20px"/>
				</html:link>
				<%} %>
			</td>
		</tr>
		<tr>
			<td>
				<html:link action="/apercufilm.do" paramId="code" paramName="liste" paramProperty="idFilm">
					<img src="<bean:write name="liste" property="affiche"/>"  height="150px"/>
				</html:link>
			</td>
			<td>
				<bean:message key="Note"/>: <bean:write name="liste" property="noteMoyenne"/> /10<br />
				<% if(session.getAttribute("login") != null){ %>
					<bean:message key="Sortie"/>: <bean:write name="liste" property="dateSortie"/><br />
					<bean:message key="Cout"/>: <bean:write name="liste" property="cout"/> Euros<br />
					<bean:message key="Synopsis"/>: <p><bean:write name="liste" property="synopsis"/></p>
				<%} %>
			</td>
		</tr>
	</logic:iterate>
</table>