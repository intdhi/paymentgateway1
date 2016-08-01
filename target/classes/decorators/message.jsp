<%@ include file="/common/customtag.jsp" %>
<c:if test="${not empty errors}">
	<br />
	<div class="row">
		<div class="alert alert-danger alert-dismissable">
			<button type="button" class="close" data-dismiss="alert"
				aria-hidden="true">&times;</button>
			<strong>Danger!</strong>
			<c:forEach var="error" items="${errors}">
               <c:out value="${error}"/><br />
            </c:forEach>
            <c:remove var="errors" scope="session"/>
		</div>
	</div>
</c:if>
<c:if test="${not empty successMessages}">
	<br />
	<div class="row">
		<div class="alert alert-success alert-dismissable">
			<button type="button" class="close" data-dismiss="alert"
				aria-hidden="true">&times;</button>
			<strong>Message : </strong>
			<c:forEach var="msg" items="${successMessages}">
            	<c:out value="${msg}"/><br />
            </c:forEach>
            <c:remove var="successMessages" scope="session"/>
		</div>
	</div>
</c:if>