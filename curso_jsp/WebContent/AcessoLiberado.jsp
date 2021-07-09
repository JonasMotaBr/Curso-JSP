<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acesso Liberado</title>
<link rel="stylesheet" type="text/css" href="resources/css/AcessoLiberado.css">



</head>
<body>
	<h2>Acesso Liberado!</h2>

     <!--Botao Cadastra Produto -->
    <div class="botaoCadastrar">
    <a href="CadastroProduto.jsp"><input type="button" value="Cadastrar Produtos"></a>
    </div><br>

      <!--Botao Estoque -->
     <div class="botaoestoque">
	<form action="acessoLibeServelet" method="post" class="register-form" id="register-form">
		<div class="form-submit">
			<input type="submit" value="Estoque" class="submit" id="submit" name="submit" />
		</div>
	</form>
	</div>
	
	<br>
	
	<div class="botaocaixa">
    <a href="caixaVenda.jsp"><input type="button" value="Caixa Venda"></a>
    </div><br>



</body>
</html>