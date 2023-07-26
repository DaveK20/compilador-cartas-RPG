//
//package br.edu.iff.ec.compiladores.projetolexico;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class SemanticoUtils {
//
//    public static List<String> errosSemanticos = new ArrayList<>();
//        
//    //Verifica a qual classe o personagem pertence
//    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, ProjetoLexicoParser.Declaracao_localContext ctx) {
//        String classe = ctx.classe().getText();
//
//        switch (classe) {
//            case "guerreiro":    return TabelaDeSimbolos.Classe.GUERREIRO;            
//            case "ladino":   return TabelaDeSimbolos.Classe.LADINO;              
//            default:
//                File.AddString("                    <div id=\"erros\">" + 
//                    "Erro: a classe " + classe + " não existe!</div>\n");
//                return TabelaDeSimbolos.Classe.INVALIDO;
//        }
//    }
//    
//    public static TabelaDeSimbolos.Classe verificarClasse(TabelaDeSimbolos tabela, String nomePersonagem) {
//        if (tabela.existe(nomePersonagem)) {
//            return tabela.verificar(nomePersonagem);
//        } else {
//            return TabelaDeSimbolos.Classe.INVALIDO;
//        }
//    }
//
//}
