///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package br.edu.iff.ec.compiladores.projetolexico;
//import org.antlr.v4.runtime.BaseErrorListener;
//import org.antlr.v4.runtime.RecognitionException;
//import org.antlr.v4.runtime.Recognizer;
//import org.antlr.v4.runtime.Token;
//
//public class ErrorListener extends BaseErrorListener {
//    
//    @Override
//    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, 
//                            int charPositionInLine, String msg, RecognitionException e) {
//        
//        Token t = (Token) offendingSymbol;
//        String erro = t.getText();
//        
//        if(!erro.equals("<EOF>")) 
//            // Grava a mensagem de erro sintatico no arquivo
//            File.AddString("                    <div id=\"erros\">" + 
//                    "Erro sintático perto de: " + erro + "</div>\n");
//
//    }
//}