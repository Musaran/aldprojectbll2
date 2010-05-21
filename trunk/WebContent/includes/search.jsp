<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<html:form action="/search.do">
	<table>
		<tr>
			<td><bean:message key="Recherche"/></td>
			<td><html:select property="type" >
					<% if(session.getAttribute("login") != null){ %>
						<html:option value="tous" ><bean:message key="Tous"/></html:option>
					<% } %>
					<html:option value="film" ><bean:message key="Film"/></html:option>
					<% if(session.getAttribute("login") != null){ %>
						<html:option value="personne"><bean:message key="Personne"/></html:option>
					<% } %>
				</html:select>
            </td>
			<td><html:text property="keywords" size="20" /></td>
			<td><html:submit>OK</html:submit></td>
		</tr>
	</table>				
</html:form>