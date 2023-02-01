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


    
        <div class="ligne">
            <span class="span--intitule">Nom</span>
            <span class="span--valeur"><% out.print(request.getAttribute("nom"));%></span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Prénom</span>
            <span class="span--valeur"><% out.print(request.getAttribute("prenom"));%></span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Email</span>
            <span class="span--valeur"><% out.print(request.getAttribute("email"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Date de naissance</span>
            <span class="span--valeur"><% out.print(request.getAttribute("dateNaissance"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Téléphone</span>
            <span class="span--valeur"><% out.print(request.getAttribute("telephone"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Sexe</span>
            <span class="span--valeur"><% out.print(request.getAttribute("sexe"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Mot de passe</span>
            <span class="span--valeur"><% out.print(request.getAttribute("mdp"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Pays</span>
            <span class="span--valeur"><% out.print(request.getAttribute("pays"));%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Langages adorés</span>
            <span class="span--valeur"><% out.print(request.getAttribute("langages"));%> </span>
        </div>
    </div>

 
    <form action="EnregistrementCSV" method="post">
    
		<input type="hidden" name="nom" value="<% out.print(request.getAttribute("nom"));%>">
		<input type="hidden" name="prenom" value="<% out.print(request.getAttribute("prenom"));%>">
		<input type="hidden" name="email" value="<% out.print(request.getAttribute("email"));%>">
		<input type="hidden" name="dateNaissance" value="<% out.print(request.getAttribute("dateNaissance"));%>">
		<input type="hidden" name="telephone" value="<% out.print(request.getAttribute("telephone"));%>">
		<input type="hidden" name="sexe" value="<% out.print(request.getAttribute("sexe"));%>">
		<input type="hidden" name="mdp" value="<% out.print(request.getAttribute("mdp"));%>">
		<input type="hidden" name="pays" value="<% out.print(request.getAttribute("pays"));%>">
		<input type="hidden" name="langages" value="<% out.print(request.getAttribute("langages"));%>">
    	<input type="submit" value="Enregistrer">
    </form>







</body>
</html>