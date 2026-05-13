package br.com.dio.desafio.dominio;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
        public String toString() {
            return "Curso{" +
                    "cargaHoraria=" + cargaHoraria +
                    ", titulo='" + getTitulo() + '\'' +
                    ", descricao='" + getDescricao() + '\'' +
                    '}';
        }
}
