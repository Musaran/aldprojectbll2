<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html:html>
<head>
	<jsp:include page="/includes/head.jsp" />
	<title><bean:message key="Erreurs.titre"/></title>
</head>
<body>
	<jsp:include page="/includes/top.jsp" />
	<div class="art-content">
	    <div class="art-Post">
	        <div class="art-Post-body">
	      <div class="art-Post-inner">
			<h2 class="art-PostHeaderIcon-wrapper">
		              <span class="art-PostHeader">
		              <bean:message key="Liste.des.erreurs"/>
		              </span>
		          </h2>
		     <div class="art-PostContent">	
				<html:errors/>
			</div>
	          <div class="cleared"></div>
	      </div>    
	        </div>
	    </div>
	</div>
	<jsp:include page="/includes/bottom.jsp" />
</body>
</html:html>