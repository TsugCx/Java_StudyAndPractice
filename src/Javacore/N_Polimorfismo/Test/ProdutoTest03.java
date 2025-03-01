package Javacore.N_Polimorfismo.Test;

import Javacore.N_Polimorfismo.Domain.Computador;
import Javacore.N_Polimorfismo.Domain.Produto;
import Javacore.N_Polimorfismo.Domain.Tomate;
import Javacore.N_Polimorfismo.Service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);


        Produto produto2 = new Tomate("Miudo", 15);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataDeValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("----------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}