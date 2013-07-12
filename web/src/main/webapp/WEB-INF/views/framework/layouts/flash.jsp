<%@ include file="/WEB-INF/views/framework/layouts/application.jsp"%>

<section id="flash">
	<c:forEach items="${flash}" var="pair">
		<c:forEach items="${flash[pair.key]}" var="message">
			<p class="${pair.key}">
				<c:out value="${message}" />
				<a href="#" class="close">&times;</a>
			</p>
		</c:forEach>
	</c:forEach>
</section>