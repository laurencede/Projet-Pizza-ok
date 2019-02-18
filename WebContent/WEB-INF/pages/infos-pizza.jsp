<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pizzas</title>
<link rel="stylesheet" href="ressources/css/infos-pizza.css" />
</head>
<body>

	<header>
		<h1>Info Pizza</h1>
	</header>

	<section>
		<article class=element1>
			<div>
				<h2>${ choixPizza.libelle }</h2>
				<img src="${ choixPizza.urlimage }">
			</div>
		</article>

		<article class=element2>
			<ul>
				<li>Description : ${ choixPizza.description }</li>
				<li><label>Prix : ${ choixPizza.prix }</label></li>
				<li>Réference : ${ choixPizza.reference }</li>
				<li><label>Numéro : ${ choixPizza.numero }</label></li>
			</ul>
		</article>
	</section>
	
			<section>
			<a href="supprimer-pizza?id=${choixPizza.id}">
			<input class=bouton type="button" value="Supprimer"></input></a> 
		
			<a href="modifier-pizza?id=${choixPizza.id}">
			<input class=bouton type="button" value="Modifier"></input></a>	
		</section>
	
</body>
</html>