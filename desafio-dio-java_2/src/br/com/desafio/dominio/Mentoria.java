package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private LocalDate date;
   @Override
   public double calcularxp() {
      return XP_PADAO + 20;
   }
   public Mentoria() {
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
              "titulo='" + getTitulo() + '\'' +
              ", descricao='" + getDescricao() + '\'' +
              ", date=" + date +
              '}';
   }


}
