package br.com.dio.desafio.dominio;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Mentoria extends Conteudo {

    private LocalDate data;


    @Override
    public double calcularXp() {
        return XP_PADRAO +20;
    }

    @Override
        public String toString() {
            return "Mentoria{" +
                    "data=" + data +
                    ", titulo='" + getTitulo() + '\'' +
                    ", descricao='" + getDescricao()+ '\'' +
                    '}';
        }
}
