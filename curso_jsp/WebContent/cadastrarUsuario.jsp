<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <!-- Adicionando JQuery -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
            crossorigin="anonymous"></script>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Cadastro</title>

    <!-- Font Icon -->
    <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="vendor/nouislider/nouislider.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="resources/css/telaCadastroProdutos.css">
</head>
<body>
 <div class="main">

        <div class="container">
            <div class="signup-content">
                <!-- <div class="signup-img">
                    <img src="images/form-img.jpg" alt="">
                    <div class="signup-img-content">
                        <h2>Register now </h2>
                        <p>while seats are available !</p>
                    </div>-->
                </div>
                <div class="signup-form">
                    <form action="cadasUsuServelet" method="post" class="register-form" id="register-form" onsubmit="return validarCampos();"  enctype="multipart/form-data">
                        <div class="form-row">
                            <div class="form-group">
                                <div class="form-input">
                                    <label for="Nome:" class="required">Nome:</label>
                                    <input class="input100" type="text" name="nome" id="nome" placeholder="Name..."value="${nom}">
                                </div>
                                <div class="form-input">
                                    <label for="Email" class="required">Email</label>
                                    <input class="input100" type="text" name="email" id="email" placeholder="Email addess..."value="${email}">
                                </div>
                                <div class="form-input">
                                    <label for="Login" class="required">Login:</label>
                                    <input class="input100" type="text" name="login" id="login" placeholder="Login" value="${user}">
                                    <h1 class="erro">${msgLogin}</h1>
                                </div>
                                <div class="form-input">
                                    <label for="telefone" class="required">telefone</label>
                                    <input class="input100" type="text" name="telefone" placeholder="telefone addess..."value="${tel}">
                                </div>
                                <div class="form-input">
                                    <label for="senha" class="required">Senha</label>
                                    <input class="input100" type="password" name="senha" id="senha" placeholder="*************" value="${senha}">
                                    <h1 class="erro">${msgSenha}</h1>
                                </div>
                                <div class="form-input">
                                    <label for="Repita a senha" class="required">Repita a senha</label>
                                    <input class="input100" type="password" name="repeat_pass" id="repeat_pass" placeholder="*************">
                                    <h1 class="erro">${msgSenha}</h1>
                                </div>
                                 <div class="form-input">
                                    <label for="foto" class="required">Imagem Perfil: </label>
                                    <input class="input100" type="file" name="foto"  value="foto">
                                   
                                </div>
                            </div>
                            <div class="form-group">
                               
                                
                                <h1>Endereço</h1>
                                <div class="form-input">
                                    <label for="Codigo_Barra">Rua:</label>
                                    <input type="text" name="rua" id="rua" />
                                </div>
                                <div class="form-input">
                                    <label for="Número">Número:</label>
                                    <input type="text" name="Numero" id="Numero" />
                                </div>
                                <div class="form-input">
                                    <label for="bairro">Bairro</label>
                                    <input type="text" name="bairro" id="bairro" />
                                </div>
                                <div class="form-input">
                                    <label for="Complemento">Complemento</label>
                                    <input type="text" name="Complemento" id="Complemento" />
                                </div>
                                <div class="form-input">
                                    <label for="Cep">Cep:</label>
                                    <input type="text" name="cep" id="cep" onblur="consultaCep();" />
                                </div>
                                <div class="form-input">
                                    <label for="cidade">Cidade:</label>
                                    <input type="text" name="cidade" id="cidade"  />
                                </div>
                                <div class="form-input">
                                    <label for="uf">Estado:</label>
                                    <input type="text" name="uf" id="uf"  />
                                </div>
                               
                            </div>
                        </div>
                        
                        <div class="form-submit">
                           <a href=""><button ></button></a>
                            <input type="submit" value="Cadastrar" class="submit" id="submit" name="submit" />
                        </div>
                    </form>
                </div>
            </div>
        </div>


<table  >
	<c:forEach items="${usuario}" var="user">
	    <tr>
	    
	     <td><c:out value="${user.id}"></c:out></td>
	      <td><c:out value="${user.login}"></c:out></td>
	      <td><c:out value="${user.senha}"></c:out></td>
	      <td><a href="cadasUsuServelet?acao=download&user=${user.login}"> <img alt="" src='<c:out value="${user.tempFotouser}"></c:out>' height="32px" width="32px"> </a> </td>
	      <td><a href="cadasUsuServelet?acao=delete&user=${user.login}" >Excluir</a></td>
	      <td><a href="cadasUsuServelet?acao=edit&user=${user.login}" >Editarr<</a></td>
	    </tr>
	
	</c:forEach>
	</table>



<script type="text/javascript">
function validarCampos(){
    if (document.getElementById("name").value == '') {
        alert('informe o name')
        return false;
    }
    else if (document.getElementById("email").value == '') {
        alert('informe o email')
        return false;
    }
    else if (document.getElementById("login").value == '') {
        alert('informe o login')
        return false;
    }
    else if (document.getElementById("senha").value == '') {
        alert('informe a senha')
        return false;
    }
    else if (document.getElementById("repeat-pass").value == '') {
        alert('Repita a repeat-pass')
        return false;
    }
}

//----------------------------

function consultaCep() {
	var cep = $("#cep").val();
	alert(cep);
	//Consulta o webservice viacep.com.br/
    $.getJSON("https://viacep.com.br/ws/"+ cep +"/json/?callback=?", function(dados) {
          alert(dados.localidade);
        if (!("erro" in dados)) {
            //Atualiza os campos com os valores da consulta.
            $("#rua").val(dados.logradouro);
            $("#bairro").val(dados.bairro);
            $("#cidade").val(dados.localidade);
            $("#uf").val(dados.uf);
        } //end if.
        else {
            //CEP pesquisado não foi encontrado.
            limpa_formulário_cep();
            alert("CEP não encontrado.");
        }
    });

	
}
</script>

    <!-- JS -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/nouislider/nouislider.min.js"></script>
    <script src="vendor/wnumb/wNumb.js"></script>
    <script src="vendor/jquery-validation/dist/jquery.validate.min.js"></script>
    <script src="vendor/jquery-validation/dist/additional-methods.min.js"></script>
    <script src="js/main.js"></script>
</body>
</html>