<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta charset="ISO-8859-1">
<title>Estoque</title>
<link rel="stylesheet" type="text/css" href="resources/css/telaEstoque.css">
</head>
<body>
<div class="Botao-inicio">
<h1>Estoque</h1>
<a href="AcessoLiberado.jsp"><input type="button" value="Voltar"></a><br>
</div>



<div class="table-wrapper">
    <table class="fl-table">
        <thead>
        <tr>
            <th>Código</th>
            <th>Descrição</th>
            <th>Valor</th>
            <th>Estoque</th>
            <th>Categoria</th>
            <th>Custo</th>
            <th>Status</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${produto}" var="produto">
	    <tr>
	     <td><c:out value="${produto.codigo}"></c:out></td>
	      <td><c:out value="${produto.descri}"></c:out></td>
	      <td><c:out value="${produto.valor}"></c:out></td>
	      <td><c:out value="${produto.quant}"></c:out></td>
	      <td><c:out value="${produto.tipo}"></c:out></td>
	      <td><c:out value="${produto.custo}"></c:out></td>
	      <td><c:out value="${produto.status}"></c:out></td>
	    </tr>
	
	</c:forEach>
</table>
</div>

</body>
</html>