<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulários</title>
        <link rel="shortcut icon" type="imagex/png" href="${pageContext.request.contextPath}/resources/images/icon.png">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/estilo.css" />
    </head>
    <body>
        
        <div class="form-centro">
             <form:form action="#" name="formulario" id="formulario">
                 <center><img width="25%" src="${pageContext.request.contextPath}/resources/images/figura.png"></center>
                <legend>
                   Intranet
                </legend>
                <div class="input-group">
                    <a class="botao" style="padding-left: 40px; padding-right: 40px" class="active" href="avaliacaoIndex">Avaliações</a>
                </div>
                <div class="input-group">
                    <a class="botao" style="padding-left: 40px; padding-right: 40px" href="categoriaIndex">Categorias</a>
                </div>
                 
                <div class="input-group">
                    <a class="botao" style="padding-left: 50px; padding-right: 50px" href="clienteIndex">Clientes</a>
                </div>
                 
                <div class="input-group">
                    <a class="botao" style="padding-left: 30px; padding-right: 30px" class="active" href="fornecedorIndex">Fornecedores</a>
                </div>
                <div class="input-group">
                    <a class="botao" style="padding-left: 48px; padding-right: 48px" href="produtoIndex">Produtos</a>
                </div>
                 
                <div class="input-group">
                    <a class="botao" href="transportadoraIndex">Transportadoras</a>
                </div>
             </form:form>
        </div>
    </body>
</html>
