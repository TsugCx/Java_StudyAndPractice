package Javacore.B_IntroducaoMetodos.Test;

import Javacore.B_IntroducaoMetodos.Domain.Calculadora;

public class CalculadoraTest_05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
            calculadora.somaArray(numeros);
            calculadora.somaVarArgs(1,2,3,4,5,6,7);

    }
}
