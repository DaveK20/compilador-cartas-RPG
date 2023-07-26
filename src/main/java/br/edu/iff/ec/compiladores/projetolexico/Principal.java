//package br.edu.iff.ec.compiladores.projetolexico;
////
////import br.edu.iff.ec.compiladores.projetolexico.ProjetolexicoParser.InicialContext;
//
//import java.io.IOException;
//import javax.xml.transform.ErrorListener;
//import org.antlr.runtime.CharStream;
//import org.antlr.runtime.CommonTokenStream;
//import org.antlr.v4.runtime.CharStreams;
//
////import java.io.File;
////import java.io.IOException;
////import java.io.PrintWriter;
////import org.antlr.v4.runtime.CharStream;
////import org.antlr.v4.runtime.CharStreams;
////import org.antlr.v4.runtime.CommonTokenStream;
////import org.antlr.v4.runtime.Token;
////
/////**
//// *
//// * @author Pedro
//// */
//public class Principal {
//        public static void main(String args[]) throws IOException {
//        
//        // Chamada para criação dos arquivos 
//        File.criaArquivo(args[1]);
//
//        // Criação da linguagem e seus tokens
//        CharStream cs = CharStreams.fromFileName(args[0]);
//        ProjetolexicoLexer lexer = new ProjetolexicoLexer(cs);
//
//        // Criação do parser
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        ProjetolexicoParser parser = new ProjetolexicoParser(tokens);
//        
//        // Parte repsonsavel pelo gerenciamento de erros no parser 
//        ErrorListener el = new ErrorListener() {};
//        parser.removeErrorListeners();
//        parser.addErrorListener(el);
//        
//        // Parte reponsavem pela criacao de toda a parte semantica 
//        ProgramaContext arvore = parser.programa();
//        Semantico as = new Semantico();
//        as.visitPrograma(arvore);        
//        parser.programa();
//        
//        //Chamada para a gravação no documento externo
//        File.gravaArquivo();           
//    }
//
//    
//    
//    
//    
//    
////    public static void main(String args[])throws IOException{
////        PrintWriter pw = new PrintWriter(new File(args[1]));
////
////        /* Erro sintatico */
////        CharStream cs = CharStreams.fromFileName(args[0]);
////        ProjetolexicoLexer lexer = new ProjetolexicoLexer(cs);
////        CommonTokenStream tokens = new CommonTokenStream(lexer);
////        ProjetolexicoParser parser = new ProjetolexicoParser(tokens);
////
////        // Remove a mensagem de erro padrão
////        parser.removeErrorListeners();
////
////        // Registra o error personalizado da analise  sintatica
////        Tratamentoerros pegaErro = new Tratamentoerros(pw);
////        parser.addErrorListener(pegaErro);
////
////        /* Erro semantico */
////        InicialContext arvore = parser.inicial();
////        Semantico as = new Semantico();
////        as.visitPrograma(arvore);
////
////     
////        GeradorCarta lac = new GeradorCarta();
////            lac.visitPrograma(arvore);
////            try (PrintWriter pwc = new PrintWriter(args[1])) {
////                pwc.println(lac.out.toString());
////            }
////    }
//}
