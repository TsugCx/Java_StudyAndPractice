package Javacore.A_IntroducaoClasses.Test;

import Javacore.A_IntroducaoClasses.Domain.Estudante;

public class EstudanteTest_01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Bob";
        estudante.idade = 19;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }
}
