package Javacore.A_IntroducaoClasses.Test;

import Javacore.A_IntroducaoClasses.Domain.Professor;

public class ProfessorTest_01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Gorran";
        professor.idade = 27;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
