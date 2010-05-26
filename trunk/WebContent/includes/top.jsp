<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<div id="art-page-background-gradient"></div>
    <div id="art-page-background-glare">
        <div id="art-page-background-glare-image">
        </div>
    </div>   
    <div id="art-main">  
        <div class="art-Sheet">
            <div class="art-Sheet-tl"></div>
            <div class="art-Sheet-tr"></div>
            <div class="art-Sheet-bl"></div>
            <div class="art-Sheet-br"></div>
            <div class="art-Sheet-tc"></div>
            <div class="art-Sheet-bc"></div>
            <div class="art-Sheet-cl"></div>
            <div class="art-Sheet-cr"></div>
            <div class="art-Sheet-cc"></div>
            <div class="art-Sheet-body">
                <div class="art-Header">
	                <div id="connexion"  style="float:left;padding-top: 10px;padding-left: 10px;">
						<jsp:include page="/includes/connexion.jsp" />
					</div>
					<div id="language" style="float:right;padding-top: 10px;padding-right: 10px;">
						<html:link page='/changerlangue.do?lang=fr&cty=FR'><img alt="fr" height="20px" src="/sitewebald/img/Flags/FR.png" title="Français"></html:link>
						<html:link page='/changerlangue.do?lang=en&cty=EN'><img alt="en" height="20px" src="/sitewebald/img/Flags/EN.png" title="English"></html:link>
						<html:link page='/changerlangue.do?lang=es&cty=ES'><img alt="es" height="20px" src="/sitewebald/img/Flags/ES.png" title="Español"></html:link>
						<html:link page='/changerlangue.do?lang=de&cty=DE'><img alt="de" height="20px" src="/sitewebald/img/Flags/DE.png" title="Deutsch"></html:link>
						<html:link page='/changerlangue.do?lang=it&cty=IT'><img alt="it" height="20px" src="/sitewebald/img/Flags/IT.png" title="Italiano"></html:link>
						<html:link page='/changerlangue.do?lang=ro&cty=RO'><img alt="ro" height="20px" src="/sitewebald/img/Flags/RO.png" title="Româna"></html:link>
					</div>
                    <div class="art-Header-png"></div>
                    <div class="art-Header-jpeg"></div>
                    <div class="art-Logo">
                        <h1 id="name-text" class="art-Logo-name"><a href="#">Films &amp; co</a></h1>
                        <div id="slogan-text" class="art-Logo-text">Des films et des films</div>
                    </div>
                </div>
                <div class="art-nav">
                	<div class="l"></div>
                	<div class="r"></div>
                	<div class="art-nav-center">
                	<ul class="art-menu">
                		<li>
                			<html:link href="/sitewebald/vues/index.jsp"><span class="l"></span><span class="r"></span><span class="t">
                			Accueil</span>
                			</html:link>
                		</li>
                		<%--   <li><a href="#"><span class="l"></span><span class="r"></span><span class="t">About</span></a>
                		</li>
                		<li><a href="#"><span class="l"></span><span class="r"></span><span class="t">Services</span></a></li>
                		<li><a href="#"><span class="l"></span><span class="r"></span><span class="t">Solutions</span></a>
                		</li>
                		<li><a href="#"><span class="l"></span><span class="r"></span><span class="t">Contact</span></a></li>
                		--%>
                	</ul>
                	</div>
                </div>
                <div class="art-contentLayout">
                    <div class="art-sidebar1">
                        <jsp:include page="/includes/search.jsp" /> 
                        <jsp:include page="/includes/menu.jsp" />
                        <div class="art-Block">
                            <div class="art-Block-body">
                                <div class="art-BlockHeader">
                                    <div class="art-header-tag-icon">
                                        <div class="t">Contact</div>
                                    </div>
                                </div><div class="art-BlockContent">
                                    <div class="art-BlockContent-tl"></div>
                                    <div class="art-BlockContent-tr"></div>
                                    <div class="art-BlockContent-bl"></div>
                                    <div class="art-BlockContent-br"></div>
                                    <div class="art-BlockContent-tc"></div>
                                    <div class="art-BlockContent-bc"></div>
                                    <div class="art-BlockContent-cl"></div>
                                    <div class="art-BlockContent-cr"></div>
                                    <div class="art-BlockContent-cc"></div>
                                    <div class="art-BlockContent-body">
                                        <div>
                                              <img src="/sitewebald/img/style/contact.jpg" alt="an image" style="margin: 0 auto;display:block;width:95%" />
                                        <br />
                                        <b>Films & co</b><br />
                                        Metz<br />
                                        Email: <a href="">info@films.com</a><br />
                                        <br/>
                                        Phone: 0300000000 <br/>
                                        Fax:   0300000001
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>