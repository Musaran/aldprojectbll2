<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html:form action="/search.do">
	<table>
		<tr>
			<td>Recherche</td>
			<td><html:text property="keywords" size="20" /></td>
			<td><html:submit>OK</html:submit></td>
		</tr>
	</table>				
</html:form>