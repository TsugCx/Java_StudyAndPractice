package Javacore.N_Polimorfismo.Test;

import Javacore.N_Polimorfismo.Domain.Computador;
import Javacore.N_Polimorfismo.Domain.Televisao;
import Javacore.N_Polimorfismo.Domain.Tomate;
import Javacore.N_Polimorfismo.Service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nanco8000", 11000);
        Tomate tomate = new Tomate("Cereja", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 150000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }

}
