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

<%-- <%out.print(request.getServletContext().getAttribute("x")); %> --%>

		<%
			Client c = (Client)request.getAttribute("client");
		%>

		
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
    	<input type="hidden" name="nom" value ="<% out.print(c.getNom()); %>" >
	    <input type="hidden" name="prenom" value ="<% out.print(c.getPrenom()); %>" >
	    <input type="hidden" name="email" value ="<% out.print(c.getEmail()); %>" >
	    <input type="hidden" name="dateNaissance" value ="<% out.print(c.getDateNaissance()); %>" >
	    <input type="hidden" name="telephone" value ="<% out.print(c.getTelephone()); %>" >
	    <input type="hidden" name="sexe" value ="<% out.print(c.getSexe()); %>" >
	    <input type="hidden" name="mdp" value ="<% out.print(c.getMdp()); %>" >
	    <input type="hidden" name="pays" value ="<% out.print(c.getPays()); %>" >
	    <input type="hidden" name="langages" value ="<% out.print(c.getLangages()); %>" >
		<input type="hidden" name="etape" value="enregistrementClient">
		<input type="submit" value="Enregistrer">
	</form>

</body>
</html>