package Javacore.B_IntroducaoMetodos.Test;

import Javacore.B_IntroducaoMetodos.Domain.Funcionario;

public class FuncionarioTest_01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Edward");
        funcionario.setIdade(19);
        funcionario.setSalarios(new double[]{1200, 974.23, 2500});

        funcionario.imprime();
        System.out.println("Media " + funcionario.getMedia());

    }
}
