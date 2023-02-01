<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wesh la miiif</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">


	<h1>Utilisateur enregistré :</h1>


        <div class="ligne">
            <span class="span--intitule">Nom</span><span class="span--valeur"><% out.print(request.getAttribute("nom"));%></span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Prénom</span><span class="span--valeur"><% out.print(request.getAttribute("prenom"));%></span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Email</span><span class="span--valeur"><% out.print(request.getAttribute("email"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Date de naissance</span><span class="span--valeur"><% out.print(request.getAttribute("dateNaissance"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Téléphone</span><span class="span--valeur"><% out.print(request.getAttribute("telephone"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Sexe</span><span class="span--valeur"><% out.print(request.getAttribute("sexe"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Mot de passe</span><span class="span--valeur"><% out.print(request.getAttribute("mdp"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Pays</span><span class="span--valeur"><% out.print(request.getAttribute("pays"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Langages adorés</span><span class="span--valeur"><% out.print(request.getAttribute("langages"));%> </span>
        </div>
    </div>







</body>
</html>