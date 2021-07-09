<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>

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
                    <form action="cadasProduServelet" method="post" class="register-form" id="register-form" onsubmit="return validarCampos();">
                        <div class="form-row">
                            <div class="form-group">
                                <div class="form-input">
                                    <label for="Descrição" class="required">Descrição:</label>
                                    <input type="text" name="Descrição" id="Descrição" />
                                </div>
                                <div class="form-input">
                                    <label for="valor_custo" class="required">Valor custo</label>
                                    <input type="text" name="valor_custo" id="valor_custo" />
                                </div>
                                <div class="form-input">
                                    <label for="Preço" class="required">Preço:</label>
                                    <input type="text" name="Preço" id="Preço" />
                                </div>
                              <!--  <div class="form-input">
                                    <label for="email" class="required">xxxxxxx1</label>
                                    <input type="text" name="email" id="email" />
                                </div>-->
                                <div class="form-input">
                                    <label for="Quantidade" class="required">Quantidade</label>
                                    <input type="text" name="Quantidade" id="Quantidade" />
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-select">
                                    <div class="label-flex">
                                        <label for="Tipo">Tipo</label>
                                        <a href="#" class="form-link">Lunch detail</a>
                                    </div>
                                    <div class="select-list">
                                        <select name="Tipo" id="Tipo">
                                            <option value="Hardware">Hardware</option>
                                            <option value="Periféricos">Periféricos</option>
                                            <option value="Monitores">Monitores</option>
                                             <option value="Computadores">Computadores</option>
                                            <option value="Gamer">Gamer</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="form-radio">
                                    <div class="label-flex">
                                        <label for="payment">Status:</label>
                                        
                                    </div>
                                    <div class="form-radio-group">            
                                        <div class="form-radio-item">
                                            <input type="radio" name="status" id="Ativo" value="ativo">
                                            <label for="Ativo"  >Ativo</label>
                                            <span class="check"></span>
                                        </div>
                                        <div class="form-radio-item">
                                            <input type="radio" name="status" id="Inativo" value="inativo">
                                            <label for="Inativo">Inativo</label>
                                            <span class="check"></span>
                                        </div>
                                    </div>
                                </div>
                                
                                <div class="form-input">
                                    <label for="Codigo_Barra">Codigo Barra:</label>
                                    <input type="text" name="Codigo_Barra" id="Codigo_Barra" />
                                </div>
                             <!--    <div class="form-input">
                                    <label for="blank_name">xxxxx3 ( Bank Name)</label>
                                    <input type="text" name="blank_name" id="blank_name" />
                                </div>-->
                              <!--   <div class="form-input">
                                    <label for="payable">xxxxxx4</label>
                                    <input type="text" name="payable" id="payable" />
                                </div>-->
                            </div>
                      <!--   </div>
                        <div class="donate-us">
                            <label>xxxxx2</label>
                            <div class="price_slider ui-slider ui-slider-horizontal">
                                <div id="slider-margin"></div>
                                <span class="donate-value" id="value-lower"></span>
                            </div>-->
                        </div>
                        <div class="form-submit">
                            <input type="submit" value="Cadastrar" class="submit" id="submit" name="submit" />
                            <a href="AcessoLiberado.jsp"><input type="button" value="Voltar"></a><br>
                        </div>
                    </form>
                </div>
            </div>
        </div>

<script type="text/javascript">
function validarCampos(){
    if (document.getElementById("Descrição").value == '') {
        alert('informe a Descrição')
        return false;
    }
    else if (document.getElementById("valor_custo").value == '') {
        alert('informe o valor custo')
        return false;
    }
    else if (document.getElementById("Preço").value == '') {
        alert('informe o Preço')
        return false;
    }
    else if (document.getElementById("Quantidade").value == '') {
        alert('informe a Quantidade')
        return false;
    }
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