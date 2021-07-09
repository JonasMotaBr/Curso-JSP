<jsp:useBean id="classeBeansCurso"  class="beans.beansCursoJSP" type="beans.beansCursoJSP" scope="page"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
<!-- tag expressao --> 
<% out.print(request.getParameter("nome")); %>
<%= "Nome recebido:" + request.getParameter("nome") %>

<!-- tag declarativa --> 
<%! int cont=2;
public int soma(int s){
	return cont+s;
}
%>
<p/>
<%= soma(5) %>
<p/>
<%= request.getLocalPort() %>
<p/>
<%= application.getInitParameter("estado") %>


<!-- ### Passando Parametros Setters e Getters ####### --> 
<jsp:setProperty property="*" name="classeBeansCurso"/>
<p/>
<jsp:getProperty property="nome" name="classeBeansCurso"/>
<p/>
<!-- <jsp:getProperty property="ano" name="classeBeansCurso"/>--> 
<p/>
<!--  <jsp:getProperty property="sexo" name="classeBeansCurso"/> --> 
<p/>

<!-- ######## Passando Parametros Expression Lang ########--> 
      Ano: ${param.ano}
      <br/>
      Sexo: ${param.sexo}
      <br/>
<!-- ######## Recebendo atributo Session ########-->      
      Recebendo Atributo Session: ${sessionScope.atb} 
      
 <!-- ############################################################-->      
--%>



</body>
</html>