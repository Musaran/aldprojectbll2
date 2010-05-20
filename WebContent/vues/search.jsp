<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html:html>

<head>
	<jsp:include page="/includes/head.jsp" />
	<title><bean:message key="Index.titre"/></title>
</head>

<body>
	<jsp:include page="/includes/top.jsp" />
	<!-- ---------------------Contenu---------------------------- -->
	
	<logic:present name="RECHERCHEFILM" scope="session">
		<table>
			<tr>
				<th><bean:message key="Titre"/></th>
				<th></th>
			</tr>
			<logic:iterate id="rechercheFilm" name="RECHERCHEFILM" scope="session">
			<tr>
				<td><html:link action="/apercufilm.do" paramId="code" paramName="rechercheFilm" paramProperty="idFilm">
					<bean:write name="rechercheFilm" property="titre"/>
				</html:link></td>
				<td></td>
			</tr>
			</logic:iterate>
		</table>
	</logic:present>
	
	<logic:present name="RECHERCHEPERSONNE" scope="session">
		<table>
			<tr>
				<th><bean:message key="Nom"/></th>
				<th></th>
			</tr>
			<logic:iterate id="recherchePersonne" name="RECHERCHEPERSONNE" scope="session">
			<tr>
				<td>
				<html:link action="/apercupersonne.do" paramId="code" paramName="recherchePersonne" paramProperty="idPersonne">
					<bean:write name="recherchePersonne" property="nom"/> <bean:write name="recherchePersonne" property="prenom"/>
				</html:link>
				</td>
				<td></td>
			</tr>
			</logic:iterate>
		</table>
	</logic:present>
	
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
	</body>

</html:html>