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
            
            <form:form method="POST" action="${pageContext.request.contextPath}/atualizarClienteConsulta" modelAttribute="cliente" name="formulario" id="formulario">
                <form:errors path = "*" cssClass = "blocoerro" element = "div" />
                <center><img width="40%" src="${pageContext.request.contextPath}/resources/images/figura.png"></center>
                <legend>
                    Informação do cliente 
                </legend>
                <div class="input-group">
                    <form:label path= "id">Nome</form:label>

                    <form:select path = "id">
                        <form:option value = "0" label = "Selecionar"/>
                        <form:options items = "${webConsultaClientes}" />
                    </form:select>
                </div>
                 <div class="footer">
                    <input type = "submit" value = "::. Consultar .::"/>
                </div>

                        </form:form>

            <br> 
            <form:form method="POST" action="${pageContext.request.contextPath}/atualizarClienteMudanca" commandName="cliente" modelAttribute="cliente" name="formulario" id="formulario">
            <legend>
                Dados Enviados pelo usuário
            </legend>
            <div class="input-group">
                <form:label path= "nome">Nome</form:label>
                <form:input path = "nome" value="${nome}" />
            </div>
            <div class="input-group">
                    <form:label path= "email">Email</form:label>

                    <form:input path = "email" value="${email}"/>
            </div>
            <div class="input-group">
                    <form:label path= "cpf">CPF</form:label>

                    <form:input path = "cpf" value="${cpf}"/>

            </div>
            <div class="input-group">
                    <form:label path= "senha">Senha</form:label>

                    <form:input path = "senha" value="${senha}"/>
            </div>
                        <div class="input-group">
                    <form:label path= "telefone">Telefone</form:label>

                    <form:input path = "telefone" value="${telefone}"/>
            </div>
                            <div class="footer">
                    <input type = "submit" value = "::. Atualizar .::"/>
                </div>
            </form:form>
            ${resultado}
        </div>
        <!--JavaScript at end of body for optimized loading-->
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>