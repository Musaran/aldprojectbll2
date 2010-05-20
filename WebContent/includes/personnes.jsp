<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<table id="film">
<logic:iterate id="liste" name="LISTEPERSONNES" scope="session">
		<tr id="head">
			
			<td colspan="2">
				<html:link action="/apercupersonne.do" paramId="code" paramName="liste" paramProperty="idPersonne">
					<h2><bean:write name="liste" property="nom"/> <bean:write name="liste" property="prenom"/></h2>
				</html:link>
			</td>
			<td rowspan="2">
				<% if(session.getAttribute("login") != null){ %>
				<html:link action="/lienmodifierpersonne.do" paramId="code" paramName="liste" paramProperty="idPersonne">
					<img src="../img/edit.png" alt="Editer" title="Editer" height="20px"/>
				</html:link>
				<%} %>
			</td>
		</tr>
		<tr>
			<td>
				<html:link action="/apercupersonne.do" paramId="code" paramName="liste" paramProperty="idPersonne">
					<img src="<bean:write name="liste" property="photo"/>"  height="150px"/>
				</html:link>
			</td>
			<td>
				Date de naissance: <bean:write name="liste" property="dateDeNaissance"/><br />
				Biographie: <p><bean:write name="liste" property="biographie"/></p>
			</td>
		</tr>
	</logic:iterate>
</table>