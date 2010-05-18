<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<logic:iterate id="liste" name="LISTEFILMS" scope="session">
	<table id="film">
		<tr id="head">
			<td><h2><bean:write name="liste" property="titre"/></h2></td>
			<td>
			<% if(session.getAttribute("login") != null){ %>
			<html:link action="/modifierfilm.do" paramId="code" paramName="liste" paramProperty="idFilm">
				<img src="../img/edit.png" alt="Editer" title="Editer" height="20px"/>
			</html:link>
			<%} %>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<img src="<bean:write name="liste" property="affiche"/>" align="left" height="150px"/>
				Note: <bean:write name="liste" property="noteMoyenne"/> /10<br />
				Sortie: <bean:write name="liste" property="dateSortie"/><br />
				Coût: <bean:write name="liste" property="cout"/> euros<br />
				Synopsis: <p><bean:write name="liste" property="synopsis"/></p>
			</td>
		</tr>
	</table>
	</logic:iterate>