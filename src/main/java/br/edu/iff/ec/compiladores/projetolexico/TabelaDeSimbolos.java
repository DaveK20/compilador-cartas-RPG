//
//package br.edu.iff.ec.compiladores.projetolexico;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class TabelaDeSimbolos {
//    public enum Classe {
//        LADINO,
//        GUERREIRO
//    }
//    
//    class EntradaTabelaDeSimbolos {
//        String nome;
//        Classe classe;
//        int lvl;
//
//        private EntradaTabelaDeSimbolos(String nome, Classe classe, int lvl) {
//            this.nome = nome;
//            this.classe = classe;
//            this.lvl = lvl;
//        }
//    }
//    
//    private final Map<String, EntradaTabelaDeSimbolos> tabela;
//    
//    public TabelaDeSimbolos() {
//        this.tabela = new HashMap<>();
//    }
//    
//    public void add(String nome, Classe classe, int lvl) {
//        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, classe, lvl));
//    }
//    
////    public boolean existe(String nome) {
////        return tabela.containsKey(nome);
////    }
////    
////    public Classe verificar(String nome) {
////        return tabela.get(nome).classe;
////    }
//
//}