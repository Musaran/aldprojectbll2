<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html:html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<link href="../style/style1.css" rel="stylesheet" type="text/css" />
	<title><bean:message key="Index.titre"/></title>
</head>

<body>
	<div id="extern">
		<div id="header">
			<h1></h1>
			<div id="menuBarre">
				<html:form action="/connexion.do">
					<table>
						<tr>
							<td>Login</td>
							<td><html:text property="login" size="10" /></td>
						</tr>
						<tr>
							<td>Mot de passe</td>
							<td><html:text property="motDePasse" size="10" /></td>
						</tr>
						<tr>
							<td></td>
							<td><html:submit>OK</html:submit></td>
						</tr>
						<tr>
							<td></td>
						</tr>
						<tr>
							<td><html:errors/></td>
						</tr>
					</table>				
				</html:form>
        	</div>
	        <div id="searchBarre">
	        </div>
		</div>
	    <div id="barreNews">
	   	</div>
	   	<div id="mainContainer">
        	<div id="menuContent">
     		</div>
        	<div id="content">
        	</div>
        </div>
	    <div id="footer">
	    </div>
	</div>
</body>

</html:html>