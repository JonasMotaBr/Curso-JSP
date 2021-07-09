<jsp:useBean id="classeBeansCurso" class="beans.beansCursoJSP"
	type="beans.beansCursoJSP" scope="page" />



<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JamTech Solft</title>
<link rel="stylesheet" href="resources/css/style.css">

</head>
<body>


	<%--
<h1>Helo Word</h1>
<!-- ######## Passando valores para receberNome.jsp ########--> 
<form action="receberNome.jsp" method="post">
<input type="text" id="nome" name="nome">
<input type="text" id="ano" name="ano">
<input type="text" id="sexo" name="sexo">

<input type="submit" value="Enviar"></input>
<p/>
<%= "Data atual:"+ new Date() %>
<p/>
<%= classeBeansCurso.Soma(5,2) %>
<p/>


<!-- ######## Setando atributo Session ########--> 
<%  session.setAttribute("atb", "Testando"); %>
<a href="receberNome.jsp"> Ver teste</a>
<p/>  



 <!-- ############################################################--> 
--%>

	<%--

<c:out value="${'Bem Vindo ao JSTL'}"/>

<!-- ------------- --> 
<c:catch var="calc">
<%= 100/2 %> 
</c:catch>
<p/>
<c:if test="${calc != null }">
 Erro:${calc.message }
</c:if>
<p/>
<!-- -------Condi��o when------ --> 
<c:set var="numero" value="${100/2 }"></c:set>
<c:choose>
  <c:when test="${numero >50 }">
     <c:out value="${'Maior que 50' }"></c:out>
  </c:when>
  <c:when test="${numero <50 }">
     <c:out value="${'menor que 50' }"></c:out>
  </c:when>
  <c:otherwise>
     <c:out value="${'N�o encontrou nenhuma condi��o' }"></c:out>
  </c:otherwise>
</c:choose>
<p/>
<!-- -------Condi��o forEatch------ --> 
<c:set var="numero" value="${100/2 }"></c:set>
<c:forEach var="n" begin="1" end="${numero }">
     Item: ${n}
</c:forEach>

<!-- ------URL------- --> 
<c:url value="acessoLiberado.jsf" var="acesso">
  <c:param name="para01" value="111"/>
  <p/>
  <c:param name="para02" value="222"/>
</c:url>
${acesso}

<!-- ------------- --> 
<%--
<c:set var="condicao" value="${2 }"/>

     <c:if test="${condicao >1 }">
          <c:redirect url="https://www.google.com"/>
     </c:if>
     
     <c:if test="${condicao <1 }">
          <c:redirect url="https://www.youtube.com"/>
     </c:if>
--%>

	<div class="body"></div>
	<div class="grad"></div>
	<div class="header">
		<div>
			JamTech<span>Soft</span>
		</div>
	</div>
	<br>
	<div>
		<form action="LoginServelet" method="post" class="login" onsubmit="return validarCampos();">
			> Login: <input type="text" id="login" name="login">
			<p />
			Senha: <input type="password" id="senha" name="senha">
			<p />
			<input type="submit" value="logar"> 
			
			<a href="cadastrarUsuario.jsp"><input type="button" value="cadastar"></a>

		</form>
	</div>


<script type="text/javascript">
function validarCampos(){
    if (document.getElementById("login").value == '') {
        alert('informe o login')
        return false;
    }
    else if (document.getElementById("senha").value == '') {
        alert('informe a senha')
        return false;
    }
  
}
</script>

</body>
</html>