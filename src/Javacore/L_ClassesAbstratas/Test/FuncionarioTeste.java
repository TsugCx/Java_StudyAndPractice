package Javacore.L_ClassesAbstratas.Test;

import Javacore.L_ClassesAbstratas.Domain.Desenvolverdor;
import Javacore.L_ClassesAbstratas.Domain.Gerente;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 16700);
        Desenvolverdor desenvolverdor = new Desenvolverdor("Kalli", 2500);
        System.out.println(gerente);
        gerente.imprime();
        desenvolverdor.imprime();


    }
}
