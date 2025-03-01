package Javacore.B_IntroducaoMetodos.Test;

import Javacore.B_IntroducaoMetodos.Domain.Estudante;

public class EstudanteTest_02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Doug";
        estudante01.idade = 90;
        estudante01.sexo = 'M';

        estudante02.nome = "Kuno";
        estudante02.idade = 23;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
