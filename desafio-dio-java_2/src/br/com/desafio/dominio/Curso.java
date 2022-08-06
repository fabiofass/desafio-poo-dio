package br.com.desafio.dominio;

public class Curso extends Conteudo  {

       private   int cargaHoraria;
    @Override
    public double calcularxp() {
        return XP_PADAO * cargaHoraria;
    }
    public Curso() {
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}
