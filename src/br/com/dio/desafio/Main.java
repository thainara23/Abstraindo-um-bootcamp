package br.com.dio.desafio;

import br.com.dio.desafio.Dominio.Conteudo;
import br.com.dio.desafio.Dominio.Curso;
import br.com.dio.desafio.Dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Cuso Java");
        curso1.setDescricao("Decrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2  = new Curso();
        curso1.setTitulo("Cuso JavaScript");
        curso1.setDescricao("Decrição curso JavaScript");
        curso1.setCargaHoraria(8);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }

}
