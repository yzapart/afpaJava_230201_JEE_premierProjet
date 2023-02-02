<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="model.Client"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wesh la miiif</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<% Client c = (Client) request.getServletContext().getAttribute("clientSession"); %>

		
	<div class="container">
        <div class="ligne">
            <span class="span--intitule">Nom</span>
            <span class="span--valeur"><% out.print(c.getNom());%></span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Prénom</span>
            <span class="span--valeur"><% out.print(c.getPrenom());%></span>
        </div>
         <div class="ligne">
            <span class="span--intitule">Email</span>
            <span class="span--valeur"><% out.print(c.getEmail());%></span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Date de naissance</span>
            <span class="span--valeur"><% out.print(c.getDateNaissance());%></span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Téléphone</span>
            <span class="span--valeur"><% out.print(c.getTelephone());%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Sexe</span>
            <span class="span--valeur"><% out.print(c.getSexe());%> </span>
        </div>

        <div class="ligne">
            <span class="span--intitule">Mot de passe</span>
            <span class="span--valeur"><% out.print(c.getMdp());%> </span>
        </div>

        <div class="ligne">
            <span class="span--intitule">Pays</span>
            <span class="span--valeur"><% out.print(c.getPays());%> </span>
        </div>
        <div class="ligne">
            <span class="span--intitule">Langages adorés</span>
            <span class="span--valeur"><% out.print(c.getLangages());%> </span>
        </div> 
    </div>
    
    <form action="AjoutClient" method="post">
		<input type="hidden" name="etape" value="enregistrementClient">
		<input type="submit" value="Enregistrer">
	</form>

</body>
</html>