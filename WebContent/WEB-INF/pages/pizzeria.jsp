<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizzeria</title>
<link rel="stylesheet" href="ressources/css/pizzeria.css" />
</head>
<body>

<header>
<h1>Pizzeria</h1>
</header>
	<a href="ajouter-pizza">Ajouter une pizza</a>
<section>
	<c:forEach items="${ toutesLesPizzas }" var="pizzeria" >
			<div class=blockPhoto>
				<a href ="infos-pizza?id=${ pizzeria.id }"><img src="${ pizzeria.urlimage }"/></a>
				<div>${ pizzeria.libelle }</div>
			</div>
	</c:forEach>
</section>

</body>
</html>