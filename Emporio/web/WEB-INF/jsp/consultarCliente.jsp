<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cliente</title>
        <link rel="shortcut icon" type="imagex/png" href="${pageContext.request.contextPath}/resources/images/icon.png">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/estilo.css" />
    </head>
    <body>
        <div class="form-centro">
            
            <form:form method="POST" action="${pageContext.request.contextPath}/consultarCliente" modelAttribute="cliente" name="formulario" id="formulario">
                <form:errors path = "*" cssClass = "blocoerro" element = "div" />
                <center><img width="20%" src="${pageContext.request.contextPath}/resources/images/figura.png"></center>
                <legend>
                    Informa��o do cliente 
                </legend>
                <div class="input-group">
                    <form:label path= "id">Nome</form:label>

                    <form:select path = "id">
                        <form:option value = "0" label = "Selecionar"/>
                        <form:options items = "${webConsultaClientes}" />
                    </form:select>
                </div>
                 <div class="footer">
                    <input class="botao" type = "submit" value = "Consultar"/>
                </div>
                
            
            <br> 
            <legend>
                Dados Enviados pelo usu�rio
            </legend>
            <table> 
                <tr>
                    <td class="textofds">Nome</td> 
                    <td class="textofds">: ${nome}</td> 
                </tr>
                <tr> 
                    <td class="textofds">CPF</td> 
                    <td class="textofds">: ${cpf}</td> 
                </tr> 
                <tr> 
                    <td class="textofds">Email</td> 
                    <td class="textofds">: ${email}</td> 
                </tr>
                <tr> 
                    <td class="textofds">Senha</td> 
                    <td class="textofds">: ${senha}</td> 
                </tr>
                <tr> 
                    <td class="textofds">Telefone</td> 
                    <td class="textofds">: ${telefone}</td> 
                </tr>
            </table>
           
            </form:form>
        </div>
        <!--JavaScript at end of body for optimized loading-->
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>