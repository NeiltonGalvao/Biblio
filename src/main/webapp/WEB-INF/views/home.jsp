<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
	<link href="<c:url value="resources/css/reset.css" />" rel="stylesheet">	
	<link href="<c:url value="resources/css/index.css" />" rel="stylesheet">
	
	<title>Controle de eBooks - Softron</title>	
	
</head>
<body>
	<header>
		<div class="container">
			<h2 class="titulo">Controle de eBooks</h2>
		</div>
	</header>
	<main>
		<section class="container">
			<h2>Bem ao Sistema de Controle de eBooks</h2>
			<table>
				
				<tr>
					<th><a href="livros"> Listar eBooks</a></th> 
				</tr>
				<tr>
					<th><a href="livros/form"> Cadastrar eBooks</a></th>
				</tr>
			</table>
		</section>	
	</main>	
</body>
</html>