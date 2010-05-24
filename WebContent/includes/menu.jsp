<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<div class="art-Block">
    <div class="art-Block-body">
        <div class="art-BlockHeader">
            <div class="art-header-tag-icon">
                <div class="t">Menu</div>
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
                	<ul >
						<li><html:link action="/listeFilms.do"><bean:message key="Liste.des.films"/></html:link></li>
						<li><html:link action="/listePersonnes.do"><bean:message key="Liste.des.personnes"/></html:link></li>
					</ul>
				</div>
            </div>
        </div>
    </div>
</div>