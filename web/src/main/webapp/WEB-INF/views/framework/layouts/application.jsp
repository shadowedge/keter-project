<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- http://download.oracle.com/javaee/5/jstl/1.1/docs/tlddocs/ -->
<%-- <%@ taglib uri="/WEB-INF/tlds/functions.tld" prefix="f" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!-- Spring security tags -->
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	    
<!-- Custom layout tags -->
<%@ taglib tagdir="/WEB-INF/tags/layouts" prefix="layout"%>
<%-- <%@ taglib tagdir="/WEB-INF/tags/tables" prefix="tab"%> --%>
<%-- <%@ taglib tagdir="/WEB-INF/tags/partials" prefix="partial"%> --%>

<%-- <% System.out.println(request.getRequestURI()); %> --%>
<c:set value="${pageContext.request.requestURI}" var="cmppath" />
<input type="hidden" value= "${cmppath}">
<%-- <c:out value="${fn:substring(cmppath, 0, f:lastIndexOf(cmppath, '.'))}" /> --%>