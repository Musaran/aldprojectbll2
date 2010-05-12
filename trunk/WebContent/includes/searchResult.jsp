<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<table>
	<tr>
		<th>Titre</th>
		<th></th>
	</tr>
	<logic:iterate id="recherche" name="RECHERCHEFILM" scope="request">
	<tr>
		<td><bean:write name="recherche" property="titre"/></td>
		<td></td>
	</tr>
	</logic:iterate>
</table>

