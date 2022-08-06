package br.com.desafio.dominio;

public abstract class Conteudo {
   protected static final double XP_PADAO = 10d;
   private String titulo;
   private String descricao;

   public abstract double calcularxp() ;
}
