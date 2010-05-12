<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<logic:equal parameter="page" value="search">
	<jsp:include page="searchResult.jsp"></jsp:include>
</logic:equal>
<logic:equal parameter="page" value="films">
	<jsp:include page="films.jsp"></jsp:include>
</logic:equal>
