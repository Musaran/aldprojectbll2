<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<ul id="menu">
	<li><html:link action="/listeFilms.do"><bean:message key="Liste.des.films"/></html:link></li>
	<li><html:link action="/listePersonnes.do"><bean:message key="Liste.des.personnes"/></html:link></li>
</ul>