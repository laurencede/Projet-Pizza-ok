<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter une Pizza</title>
<link rel="stylesheet" href="ressources/css/ajouter-pizza.css" />
</head>
<body>

<header>
	<h1>Ajouter une pizza</h1>
</header>

	<section>
		<div>
			<form action="ajouter-pizza" method="post">
				<p class="marge">
					<input type="text" id="id" name="id" value="${ pizzeria.id }" class="dim_block" hidden/>
				</p>
				<p class="marge">
					<label for="libelle">Libellé</label><br>
					<input type="text" id="libelle" name="libelle" value="${ pizzeria.libelle }" class="dim_block" />
				</p>
				<p class="marge">
					<label for="reference">Référence</label><br>
					<input type="text" id="reference" name="reference" value="${ pizzeria.reference }" class="dim_block" />
				</p>
				<p class="marge">
					<label for="prix">Prix</label><br> 
					<input type="text" id="prix" name="prix" value="${ pizzeria.prix }" class="dim_block" />
				</p>
				<p class="marge">
					<label for="description">Description</label><br> 
					<input type="text" id="description" name="description" value="${ pizzeria.description }" class="dim_block" />
				</p>
				<p class="marge">
					<label for="numero">Numero</label><br> 
					<input type="text" id="numero" name="numero" value="${ pizzeria.numero }" class="dim_block" />
				</p>
				<p class="marge">
					<label for="urlimage">Photo</label><br>
					<input type="text" id="urlimage" name="urlimage" value="${ pizzeria.urlimage }" class="dim_block" />
				</p>

					<input class="bouton" type="submit" value="Valider"></input> 
					<input class="bouton" type="reset" value="Annuler"></input>
			</form>
			
		</div>
	</section>
</body>
</html>