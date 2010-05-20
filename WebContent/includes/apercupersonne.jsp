<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<table id="apercupersonne">
	<tr id="head">
		<td colspan="2">
			<h2><bean:write name="PERSONNE" property="nom"/> <bean:write name="PERSONNE" property="prenom"/></h2>
		</td>
		<td rowspan="2">
			<% if(session.getAttribute("login") != null){ %>
			<html:link action="/lienmodifierpersonne.do" paramId="code" paramName="PERSONNE" paramProperty="idPersonne">
				<img src="../img/edit.png" alt="Editer" title="Editer" height="20px"/>
			</html:link>
			<%} %>
		</td>
	</tr>
	<tr>
		<td>
			<img src="<bean:write name="PERSONNE" property="photo"/>"  height="150px"/>
		</td>
		<td>
			Date de naissance: <bean:write name="PERSONNE" property="dateDeNaissance"/><br />
			Biographie: <bean:write name="PERSONNE" property="biographie"/><br />
		</td>
	</tr>
	
</table>
<h3>Filmographie</h3>
<table>
	<tr>
		<td><h3>Acteur</h3></td>
	</tr>
	<logic:iterate id="acteurs" name="ACTEUR" >
		<tr>
			<td><html:link action="/apercufilm.do" paramId="code" paramName="acteurs" paramProperty="idFilm">
					<bean:write name="acteurs" property="titre"/></html:link></td>
		</tr>
	</logic:iterate>
</table>
<table>
	<tr>
		<td><h3>Producteur</h3></td>
	</tr>
	<logic:iterate id="producteurs" name="PRODUCTEUR" >
		<tr>
			<td><html:link action="/apercufilm.do" paramId="code" paramName="producteurs" paramProperty="idFilm">
					<bean:write name="producteurs" property="titre"/></html:link></td>
		</tr>
	</logic:iterate>
</table>
<table>
	<tr>
		<td><h3>Réalisateur</h3></td>
	</tr>
	<logic:iterate id="realisateurs" name="REALISATEUR" >
		<tr>
			<td><html:link action="/apercufilm.do" paramId="code" paramName="realisateurs" paramProperty="idFilm">
					<bean:write name="realisateurs" property="titre"/></html:link></td>
		</tr>
	</logic:iterate>
</table>