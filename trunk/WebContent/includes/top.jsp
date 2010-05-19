<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<div id="topbarre">
	<div id="connexion">
		<jsp:include page="/includes/connexion.jsp" />
	</div>
	
	<div id="language">
		<html:link page='/changerlangue.do?lang=fr&cty=FR'><img alt="fr" height="20px" src="../img/Flags/FR.png" title="Français"></html:link>
		<html:link page='/changerlangue.do?lang=en&cty=EN'><img alt="en" height="20px" src="../img/Flags/EN.png" title="English"></html:link>
		<html:link page='/changerlangue.do?lang=es&cty=ES'><img alt="es" height="20px" src="../img/Flags/ES.png" title="Español"></html:link>
		<html:link page='/changerlangue.do?lang=de&cty=DE'><img alt="de" height="20px" src="../img/Flags/DE.png" title="Deutsch"></html:link>
		<html:link page='/changerlangue.do?lang=it&cty=IT'><img alt="it" height="20px" src="../img/Flags/IT.png" title="Italiano"></html:link>
		<html:link page='/changerlangue.do?lang=ro&cty=RO'><img alt="ro" height="20px" src="../img/Flags/RO.png" title="Româna"></html:link>
	</div>
</div>
<div id="extern">
		
		<div id="header">
			<h1></h1>
			<div id="menuBarre">
				
			
			
			</div>
	        <div id="searchBarre">
	       	 	<jsp:include page="/includes/search.jsp" />
	        </div>
		</div>
	    <div id="barreNews">
	    	<jsp:include page="/includes/news.jsp" />
	    	<html:link href="./vues/index.jsp"><img alt="accueil" height="30px" src="../img/home3.png" title="Accueil"></html:link>
	   	</div>
	   	<div id="mainContainer">
        	<div id="menuContent">
        		<jsp:include page="/includes/menu.jsp" />
     		</div>
        	<div id="content">