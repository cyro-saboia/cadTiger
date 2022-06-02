 <html>

<head>
<title>Login</title>
<link href="webjars/bootstrap/5.1.0/css/bootstrap.min.css" rel="stylesheet">
<style type="text/css">
	.login-form{
		width: 400px;
		height: 200px;
		position: absolute;
		background-color: #DD4124; 
		border-radius: 5%;
		top: 50%;
		left: 50%;
		margin-right: 50%;
		transform: translate(-50%, -50%);
	}
</style>
</head>

<body>
	<h2>${errorMessage}</h2>
	<div class="login-form">
		<div class="container-fluid">
		    <form method="post">
		        <input type="text" name="name" class="form-control mt-3" placeholder="Usuário"/>
		        <input type="password" name="password" class="form-control mt-3" placeholder="Senha"/> 
		        <div class="d-grid gap-2">
		        	<button class="btn btn-primary btn-dark mt-3">Login</button>
		        </div>
		    </form>
		</div>
	</div>
</body>

</html>