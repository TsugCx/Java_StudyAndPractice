package Javacore.B_IntroducaoMetodos.Test;

import Javacore.B_IntroducaoMetodos.Domain.Calculadora;

public class CalculadoraTest_03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double result = calculadora.dividiDoisNumeros(0, 0);
        System.out.println(result);
    }
}
