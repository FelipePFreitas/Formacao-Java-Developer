package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-------");
        System.out.println("Conteudos inscritos "+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+ devCamila.getConteudosConcluidos());

        System.out.println(devCamila.calcularXp());

        System.out.println("                            ");

        Dev devjoao = new Dev();
        devjoao.setNome("João");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos "+ devjoao.getConteudosInscritos());
        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("-------");
        System.out.println("Conteudos inscritos "+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos "+ devjoao.getConteudosConcluidos());
        System.out.println(devjoao.calcularXp());




    }
}