package br.edu.iff.ec.compiladores.projetolexico;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class App 
{
    public static void main( String args[]) throws IOException{
        CharStream cs = CharStreams.fromFileName(args[0]);
        ProjetolexicoLexer lexer = new ProjetolexicoLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProjetolexicoParser parser = new ProjetolexicoParser(tokens);
        ProjetolexicoParser.InicialContext arvore = parser.inicial();
        Token t = null;
        //System.out.println(parser.getContext().getText());
        while((t = lexer.nextToken()).getType() != Token.EOF){
            System.out.println("<"+ProjetolexicoLexer.VOCABULARY.getDisplayName(t.getType())+","+t.getText()+">");
        }

        GeradorHTML g = new GeradorHTML();
        g.visitGate(arvore);

        //parser.inicial();
    }
}