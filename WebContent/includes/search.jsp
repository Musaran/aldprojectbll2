<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-Block">
	<div class="art-Block-body">
	    <div class="art-BlockHeader">
	        <div class="art-header-tag-icon">
	            <div class="t"><bean:message key="Recherche"/></div>
	        </div>
	    </div>
    	<div class="art-BlockContent">
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
	            	<html:form action="/search.do" styleId="newsletterform">
	            		<html:select property="type" >
							<% if(session.getAttribute("login") !=	 null){ %>
								<html:option value="tous" ><bean:message key="Tous"/></html:option>
							<% } %>
							<html:option value="film" ><bean:message key="Film"/></html:option>
							<% if(session.getAttribute("login") != null){ %>
								<html:option value="personne"><bean:message key="Personne"/></html:option>
							<% } %>
						</html:select><br /><br />
						<html:text property="keywords" size="30" styleId="s" value=""/><br /><br />
			            <span class="art-button-wrapper">
			            	<span class="l"> </span>
			            	<span class="r"> </span>
			            	<html:submit styleClass="art-button">OK</html:submit>
	            		</span>
	            	</html:form>
	            </div>
	        </div>
	    </div>
	</div>
</div>