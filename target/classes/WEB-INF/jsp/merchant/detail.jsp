<%@ include file="/common/customtag.jsp"%>
<head>
<title><fmt:message key="merchant.detail" /></title>
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
			<div class="panel-heading">
				<fmt:message key="merchant.detail" />
			</div>
			<div class="panel-body">
				<div class="row">
					<div class="col-lg-12">
						<spring:url var="action" value='core/merchant/detail' />
						<form:form role="form" class="form-horizontal"
							commandName="merchant" method="post" action="${action}"
							id="merchant">
							<div class="form-group">
								<label class="control-label col-sm-2"> <fmt:message
										key="merchant.name" />
								</label>
								<div class="col-sm-5">
									<form:input path="merchantName" type="text"
										class="form-control" required="required" id="merchantName"
										readonly="true"
										placeholder="Merchant Name" />
									<form:errors path="merchantName" cssClass="error" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2"> <fmt:message
										key="merchant.terminalname" />
								</label>
								<div class="col-sm-5">
									<form:input path="terminalName" type="text"
										class="form-control" required="required" id="terminalName"
										readonly="true"
										placeholder="Terminal Name" />
									<form:errors path="terminalName" cssClass="error" />
								</div>
							</div>
							<div class="form-group">
								<label class="control-label col-sm-2"> <fmt:message
										key="merchant.type" />
								</label>
								<div class="col-sm-5">
									<form:input path="merchantType" type="text"
										class="form-control" required="required" id="merchantType"
										readonly="true"
										placeholder="Merchant Type" />
									<form:errors path="merchantType" cssClass="error" />
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-xs-2"> <fmt:message
										key="merchant.activatedatetime" />
								</label>
								<div class="col-xs-5 date">
								<div class="input-group input-append date" >
					                <form:input type="text" 
					                		class="form-control"										
											path="activateDateTime" id="date"
											readonly="true"
											placeholder="activate Date Time" 
											required="required"/>
					                <span class="input-group-addon add-on"><span class="glyphicon glyphicon-calendar"></span></span>
					            	<form:errors path="activateDateTime" cssClass="error" />
					            </div>
					            </div>
							</div>
							<div class="form-group">
								<label class="control-label col-xs-2"> <fmt:message
										key="merchant.registrationdate" />
								</label>
								<div class="col-xs-5 date">
								<div class="input-group input-append date" >
								<fmt:formatDate pattern="dd/MM/yyyy" value="${merchant.registeredDateTime}" 
									var="registeredDateTime"/>
					                <form:input type="text" 
					                		value="${registeredDateTime}"
					                		class="form-control"										
											path="registeredDateTime" id="date"
											readonly="true"
											placeholder="activate Date Time" 
											required="required"/>
					                <span class="input-group-addon add-on"><span class="glyphicon glyphicon-calendar"></span></span>
					            	<form:errors path="registeredDateTime" cssClass="error" />
					            </div>
					            </div>
							</div>

							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
<!-- 									<button type="submit" class="btn btn-default">Submit</button> -->
									<a href="<spring:url value='/core/merchant/' />">
									<input type="button" class="btn btn-default" value="Cancel"/></a>
								</div>
							</div>

						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>