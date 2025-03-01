package Javacore.G_Associacao.Test;

import Javacore.G_Associacao.Domain.Aluno;
import Javacore.G_Associacao.Domain.Local;
import Javacore.G_Associacao.Domain.Professor;
import Javacore.G_Associacao.Domain.Seminario;

public class Associação_Test {
    public static void main(String[] args) {
        Local local = new Local("Bairro do Limoeiro");
        Aluno aluno = new Aluno("Theo", 21);
        Professor professor = new Professor("Baba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como aprender a nadar em 7 passos", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
