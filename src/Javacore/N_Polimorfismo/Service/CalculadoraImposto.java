package Javacore.N_Polimorfismo.Service;

import Javacore.N_Polimorfismo.Domain.Produto;
import Javacore.N_Polimorfismo.Domain.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relátório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a  ser pago: " + imposto);
        if (produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
            //System.out.println(((Tomate) produto)).getDataValidade;
        }
    }
}
