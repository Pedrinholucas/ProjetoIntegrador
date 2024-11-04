<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulário</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/estilo.css" />

    </head>
     <body>
        <div class="form-centro">
            
            <form:form method="POST" action="${pageContext.request.contextPath}/adicionarCliente" commandName="cliente" name="formulario" id="formulario">
                <form:errors path = "*" cssClass = "blocoerro" element = "div" />
                <center><img width="80%" src="${pageContext.request.contextPath}/resources/images/figura.png"></center>
                <legend>
                    Cadastro de Cliente
                </legend>
                <div class="input-group">
                    <form:label path= "nome">Nome</form:label>

                    <form:input path = "nome" />

                    <form:errors path = "nome" cssClass="erro" />
                </div>
                <div class="input-group">
                    <form:label path= "cpf">CPF</form:label>

                    <form:input path = "cpf" />

                    <form:errors path = "cpf" cssClass="erro" />
                </div>
                <div class="input-group">
                    <form:label path= "senha">Senha</form:label>

                    <form:input path = "senha" />
                </div>
                <div class="input-group">
                    <form:label path= "email">Email</form:label>

                    <form:input path = "email" />
                </div>
                <div class="input-group">
                    <form:label path= "telefone">Telefone</form:label>

                    <form:input path = "telefone" />
                </div>
                <div class="footer">
                    <input type = "submit" value = "::. Inserir .::"/> 
                </div>
            </div>
        </form:form>
         <!--JavaScript at end of body for optimized loading-->
         <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>