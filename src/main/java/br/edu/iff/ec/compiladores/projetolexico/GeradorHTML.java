package br.edu.iff.ec.compiladores.projetolexico;


import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeradorHTML extends ProjetolexicoBaseVisitor<Void> {
    public Void visitGate(ProjetolexicoParser.InicialContext ctx) {
        try {
            StringBuilder saida = new StringBuilder();
            saida.append("<!DOCTYPE html>"+
"<html>"+
"<head>"+
    "<title>Retângulo com Informações</title>"+
    "<style>"+
       " @import url('https://fonts.googleapis.com/css2?family=Cinzel&display=swap');"+
       " body {"+
           "display: flex;"+
            "background-image: url('fundofoda.png');"+
            "background-size: contain;"+
            "background-position: center;"+
            "justify-content: center;"+
            "align-items: center;"+
            "height: 100vh;"+
            "margin: 0;"+
        "}"+

        ".card{"+
            "width: 1200px;"+
            "height: 800px;"+
            "background-image: url('fundo.png');"+ /* Substitua pelo caminho da imagem de fundo desejada */
            "background-size: contain;"+
            "background-repeat: no-repeat;"+
            "background-position: center;"+
            "display: flex;"+
            "flex-direction: column;"+
            "align-items: center;"+
            "justify-content: flex-start;"+
           "padding: 20px;"+
       "}"+

        ".rectangle {"+
            "width: 274px;"+
           "height: 452px;"+
            "animation: gradient 2s ease-in-out infinite;"+
            "border: 2px solid #333;"+
            "display: flex;"+
            "flex-direction: column;"+
            "align-items: center;"+
            "justify-content: flex-start;"+
            "padding: 20px;"+
            "border-radius: 8px;"+
            "box-shadow: 0px 0px 10px rgba(0,0,0,0.5);"+
            "margin-top: 142px;"+ /* Adiciona uma margem de 20px para mover a .rectangle para baixo */
            "margin-left: 8px;"+
        "}"+

        "@keyframes gradient {"+
          " 0% {background: #ff9966;}"+
            "25% {background: #c2ffb3;}"+
            "50% {background: #a6a4ff;}"+
            "75% {background: #f79696;}"+
            "100% {background: #9ca3ff;}"+
        "}"+

        ".image {"+
            "width: auto;"+
            "height: auto;"+
            "margin-bottom: 20px;"+
        "}"+

        ".image img {"+
            "border-radius: 50%;"+
            "border: 3px solid #ffffff;"+
            "width: 200px;"+
            "height: 100px;"+
        "}"+

        ".field {"+
            "display: flex;"+
            "flex-direction: column;"+
            "margin-bottom: 20px;"+
            "width: 100%;"+
        "}"+

        "label {"+
            "font-family: 'Cinzel', serif;"+
            "font-size: 20px;"+
            "font-weight: bold;"+
            "margin-bottom: -15px;"+
            "text-transform: uppercase;"+
        "}"+

        "p {"+
           "background-color: rgba(0,0,0,0.2);"+
            "padding: 5px;"+
            "border-radius: 4px;"+
        "}"+
    "</style>"+
"</head>"+
"<body>"+
    "<div class=\"card\">"+
        "<div class=\"rectangle\">"+
            "<div class=\"image\">"+
                "<img src=" +ctx.NOME_IMAGEM()+ ">" +
            "</div>"+
            "<div class=\"field\">"+
                "<label for=\"nome\">Nome:</label>"+
                "<p>" + ctx.NOME_USUARIO().getText().replace("\"","") + "</p>"+
            "</div>"+
            "<div class=\"field\">"+
                "<label for=\"raca\">Raca:</label>"+
                "<p>"+ ctx.RACAS().getText().replace("\"","")  + "</p>"+
            "</div>"+
            "<div class=\"field\">"+
                "<label for=\"classe\">Classe:</label>"+
                "<p>" + ctx.CLASSES().getText().replace("<","").replace(">","") + "</p>"+
            "</div>"+
            "<div class=\"field\">"+
                "<label for=\"level\">Level:</label>"+
                "<p>"+ ctx.LEVEL().getText().replace("<","").replace(">","") +"</p>"+
            "</div>"+
            "<div class=\"field\">"+
                "<label for=\"desc\">Descricao:</label>"+
                "<p>"+ ctx.DESCR().getText().replace("<","").replace(">","") +"</p>"+
            "</div>"+            
        "</div>"+
    "</div>"+
"</body>"+
"</html>");

            FileWriter writer = new FileWriter("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\projetolexico\\target\\maconha.html");
            writer.write(saida.toString());
            writer.close();
            System.out.println("gerei a maconha");
            return super.visitInicial(ctx);
        } catch (IOException ex) {
            System.out.println("gerei a maconha");
            Logger.getLogger(GeradorHTML.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("gerei a maconha");
        return super.visitInicial(ctx);
    }

}