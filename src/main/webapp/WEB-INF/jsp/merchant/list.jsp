<%@ include file="/common/customtag.jsp"%>
<head>
<title><fmt:message key="merchant.list" /></title>
</head>
<div class="row">
	<div class="col-lg-12">
		<h4 class="page-header">Tables</h4>
	</div>
	<!-- /.col-lg-12 -->
</div>
<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">
			<div class="panel-heading clearfix">
				<fmt:message key="merchant.list" />
				<div class="btn-group pull-right">
					<a href="<spring:url value='/core/merchant/add'/>" class="btn btn-success btn-sm"><fmt:message key="merchant.add" /></a> 
				</div>
				
			</div>
			<div class="panel-body">
				<div class="dataTable_wrapper">
					<table class="table table-striped table-bordered table-hover"
						id="dataTables">
						<thead>
							<tr>
								<th><fmt:message key="merchant.name" /></th>
								<th><fmt:message key="merchant.type" /></th>
								<th><fmt:message key="merchant.activatedatetime" /></th>
								<th><fmt:message key="merchant.terminalname" /></th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="merchat" items="${merchat}">
								<tr>
									<td>${merchat.merchantName}</td>
									<td>${merchat.merchantType}</td>
									<td><fmt:formatDate type="date" pattern="dd/MM/yyyy"
											value="${merchat.activateDateTime}" /></td>
									<td>${merchat.terminalName}</td>
									<td>
										<a href="<spring:url value='/core/merchant/detail/${merchat.id}'/>"><i class="fa fa-eye fa-fw"></i></a>
										<a href="<spring:url value='/core/merchant/edit/${merchat.id}'/>"><i class="fa fa-edit fa-fw"></i></a>
										<a href="<spring:url value='/core/merchant/delete/${merchat.id}'/>"><i class="fa fa-trash-o fa-fw"></i></a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>


