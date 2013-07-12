<jsp:directive.tag language="java" pageEncoding="UTF-8" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
	
<%@ attribute name="name" required="true" type="java.lang.String"%>
<%@ attribute name="current" required="false" type="java.lang.String"%>

<c:url value='/${name}' var="sectionUrl"/>

<li <c:if test="${name == current}">class="active"</c:if>>
	<a href="${sectionUrl}">
		<img src="<c:url value='/resources/images/icons/${name}.png' />" alt=""/>
		<fmt:message key="layout.section.${name}" />
	</a>
</li>
