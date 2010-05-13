<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>


<div id="extern">
		<div id="header">
			<h1></h1>
			<div id="menuBarre">
				<jsp:include page="/includes/connexion.jsp" />
			</div>
	        <div id="searchBarre">
	       	 	<jsp:include page="/includes/search.jsp" />
	        </div>
		</div>
	    <div id="barreNews">
	    	<jsp:include page="/includes/news.jsp" />
	   	</div>
	   	<div id="mainContainer">
        	<div id="menuContent">
        		<jsp:include page="/includes/menu.jsp" />
     		</div>
        	<div id="content">