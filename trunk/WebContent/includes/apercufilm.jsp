<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<table id="apercufilm">
	<tr id="head">
		<td colspan="2">
			<h2><bean:write name="FILM" property="titre"/></h2>
		</td>
		<td rowspan="2">
			<% if(session.getAttribute("login") != null){ %>
			<html:link action="/lienmodifierfilm.do" paramId="code" paramName="FILM" paramProperty="idFilm">
				<img src="../img/edit.png" alt="Editer" title="Editer" height="20px"/>
			</html:link>
			<%} %>
		</td>
	</tr>
	<tr>
		<td>
			<img src="<bean:write name="FILM" property="affiche"/>"  height="150px"/>
		</td>
		<td>
			<bean:message key="Note"/>: <bean:write name="FILM" property="noteMoyenne"/> /10<br />
			<bean:message key="Sortie"/>: <bean:write name="FILM" property="dateSortie"/><br />
			<bean:message key="Cout"/>: <bean:write name="FILM" property="cout"/> Euros<br />
			<bean:message key="Synopsis"/>: <p><bean:write name="FILM" property="synopsis"/></p>
		</td>
	</tr>
	
</table>
<table>
	<tr>
		<td><h3>Acteurs</h3></td>
	</tr>
	<%--<logic:iterate id="acteurs" name="ACTEURS" >
		<tr>
			<td><bean:write name="acteurs" property="nom"/></td>
		</tr>
		<bean:write name=""/>
	</logic:iterate>--%>
</table>