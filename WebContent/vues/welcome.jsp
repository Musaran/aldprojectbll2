<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<% if(session.getAttribute("LISTEFILMS")==null) {%>
<jsp:forward page="index.jsp" />
<%} %>

<html:html>

<head>
	<jsp:include page="/includes/head.jsp" />
	<title><bean:message key="Index.titre"/></title>
</head>

<body>
	<jsp:include page="/includes/top.jsp" />
	<!-- ---------------------Contenu---------------------------- -->
	
	
	<logic:iterate id="liste" name="LISTEFILMS" scope="session">
		Proposer une <html:link action="/modifierfilm.do">modification</html:link>.
		<table>
			<tr>
				<td><bean:write name="liste" property="titre"/></td>
				<td></td>
			</tr>
		</table>
	</logic:iterate>
	
	<!-- ---------------------------------------------------------- -->
	<jsp:include page="/includes/bottom.jsp" />
</body>

</html:html>