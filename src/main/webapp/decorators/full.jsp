<%@ include file="/common/customtag.jsp"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><decorator:title /> | <fmt:message key="title.main" /></title>
<!-- Bootstrap Core CSS -->

<link
	href="<c:url value="/bower_components/bootstrap/dist/css/bootstrap.min.css"/>"
	rel="stylesheet">
<!-- MetisMenu CSS -->
<link
	href="<c:url value="/bower_components/metisMenu/dist/metisMenu.min.css"/>"
	rel="stylesheet">
<!-- DataTables CSS -->
<link
	href="<c:url value="/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" />"
	rel="stylesheet">
	
<!-- DataTables Responsive CSS -->
<link
	href="<c:url value="/bower_components/datatables-responsive/css/dataTables.responsive.css" />"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="<c:url value="/dist/css/sb-admin-2.css"/>" rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="<c:url value="/bower_components/font-awesome/css/font-awesome.min.css"/>"
	rel="stylesheet" type="text/css">

<!-- datepicker css -->
<link href="<spring:url value="/datepicker/css/datepicker.css" />" rel="stylesheet" />

<!-- datepicker js -->
<script src="<spring:url value="/js/jquery-1.8.3.js" />"></script>

</head>
<body>

	<div id="wrapper">
		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<jsp:include page="/decorators/navbar.jsp" />
			<jsp:include page="/decorators/sidebar.jsp" />
		</nav>

		<div id="page-wrapper">
			<jsp:include page="/decorators/message.jsp" />
			<decorator:body />
		</div>

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script
		src="<c:url value="/bower_components/jquery/dist/jquery.min.js"/> "></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="<c:url value="/bower_components/bootstrap/dist/js/bootstrap.min.js"/> "></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script
		src="<c:url value="/bower_components/metisMenu/dist/metisMenu.min.js" />"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<c:url value="/dist/js/sb-admin-2.js" /> "></script>


	<!-- Load jQuery and bootstrap datepicker scripts -->
	<script src="<spring:url value="/datepicker/js/bootstrap-datepicker.js" />"></script>

	<!-- DataTables JavaScript -->
    <script src="<c:url value="/bower_components/datatables/media/js/jquery.dataTables.min.js" />"></script>
    <script src="<c:url value="/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js" />"></script>
	

	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
    $(document).ready(function() {
        $('#dataTables').DataTable({
                responsive: true
        });
    });
    </script>
</body>

</html>
