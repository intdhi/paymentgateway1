<%@ include file="/common/customtag.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login Page</title>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
  
    <link href="<c:url value="/bower_components/bootstrap/dist/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/bower_components/metisMenu/dist/metisMenu.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/dist/css/sb-admin-2.css"/>" rel="stylesheet">
    <link href="<c:url value="/bower_components/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
    <script src="<c:url value="/bower_components/jquery/dist/jquery.min.js"/>"></script>
    <script src="<c:url value="/bower_components/bootstrap/dist/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/bower_components/metisMenu/dist/metisMenu.min.js"/>"></script>
    <script src="<c:url value="/dist/js/sb-admin-2.js"/>"></script>
 	<link href="<c:url value="/dist/css/jumbotron.css" />" rel="stylesheet">	
</head>
<body>
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Payment Gateway Admin Console 1.0</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form name='loginForm' 
			action="<c:url value='/login' />" method='POST' class="navbar-form navbar-right" >
            <div class="form-group">
              <input type="text" placeholder="Username" class="form-control" name='username' >
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control" name='password'>
            </div>
            <button type="submit" class="btn btn-success" value="submit" >Sign in</button>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>
        <br/><br/><br/>
    <c:if test="${not empty error}">		
		<div class="container">
			<p></p>
		    <div class="alert alert-danger fade in">
			    <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			    <strong>Danger!</strong>  ${error}
			 </div>
		</div>
	</c:if>
	 
	  <div class="container">
      <footer>
        <p>&copy; 2015 Company, Inc.</p>
      </footer>
    </div> <!-- /container -->
	
</body>
</html>