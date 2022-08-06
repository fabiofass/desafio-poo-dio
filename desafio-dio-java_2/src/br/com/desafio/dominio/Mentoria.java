package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

   private LocalDate date;
   private String descricao;
   private String titulo;
   public Mentoria() {
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }



   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }

   @Override
   public String toString() {
      return "Mentoria{" +
              "titulo='" + titulo + '\'' +
              ", descricao='" + descricao + '\'' +
              ", date=" + date +
              '}';
   }
}
