<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c" %>
    
    

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Usuario</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link  href="resources/images/icons/favicon.ico"rel="icon">
<!--===============================================================================================-->
	<link  href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!--===============================================================================================-->
	<link  href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" >
<!--===============================================================================================-->
	<link  href="resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css" rel="stylesheet">
<!--===============================================================================================-->
	<link  href="resources/fonts/iconic/css/material-design-iconic-font.min.css" rel="stylesheet">
<!--===============================================================================================-->
	<link  href="resources/vendor/animate/animate.css" rel="stylesheet">
<!--===============================================================================================-->	
	<link  href="resources/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet">
<!--===============================================================================================-->
	<link  href="resources/vendor/animsition/css/animsition.min.css" rel="stylesheet">
<!--===============================================================================================-->
	<link  href="resources/vendor/select2/select2.min.css" rel="stylesheet">
<!--===============================================================================================-->	
	<link  href="resources/vendor/daterangepicker/daterangepicker.css" rel="stylesheet">
<!--===============================================================================================-->
	<link href="resources/css/telaEditarUsuario.css" rel="stylesheet">
<!--===============================================================================================-->
</head>
<body>
<body style="background-color: #999999;">
	 
	
	<div class="limiter">
	
		<div class="container-login100">
			<div class="login100-more"></div>
          
			<div class="wrap-login100">
				<form action="editarUsuServelet" method="post" class="login100-form">
					<span class="login100-form-title">
						Editar Cadastro
					</span>             
                   
                     <div class="wrap-input100" data-validate="Name is required">
						<span class="label-input100">Insira Login Atua</span>
						<input class="input100" type="text" id="getlogin" name="getlogin" value="${user}" placeholder="insira login atual">
						<span class="focus-input100"></span>
						<h1 class="erro">${loginnaoexite}</h1>
					</div>
                     
					<div class="wrap-input100" data-validate="Name is required">
						<span class="label-input100">Nome</span>
						<input class="input100" type="text" name="name" placeholder="Name...">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Login Indisponível">
						<span class="label-input100">Novo Login</span>
						<input class="input100" type="text" name="login" id="login" value="${user}" placeholder="novo Login">
						<span class="focus-input100"></span>
						<h1 class="erro">${msgLoginIndisEdit}</h1>
					</div>
					
					<div class="wrap-input100 ">
						<span class="label-input100">telefone</span>
						<input class="input100" type="text" name="telefone" placeholder="telefone addess...">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100" data-validate = "Password is required">
						<span class="label-input100">Senha</span>
						<input class="input100" type="password" name="senha" id="senha" placeholder="*************">
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100" data-validate = "Repeat Password is required">
						<span class="label-input100">Repita a senha</span>
						<input class="input100" type="text" name="repeat-pass" placeholder="*************">
						<span class="focus-input100"></span>
					</div>

					<div class="flex-m">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								<span class="txt1">
									eu concordo com o
									<a href="#" class="txt2 hov1">
										Termos de uso
									</a>
								</span>
							</label>
						</div>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button type="submit" class="login100-form-btn">
								Editar
							</button>
						</div>

						<a href="#" class="dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30">
							Sign inn
							<i class="fa fa-long-arrow-right m-l-5"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>
 

</body>
</html>