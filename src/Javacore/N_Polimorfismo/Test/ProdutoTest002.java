package Javacore.N_Polimorfismo.Test;
import Javacore.N_Polimorfismo.Domain.Produto;
import Javacore.N_Polimorfismo.Domain.Computador;
import Javacore.N_Polimorfismo.Domain.Tomate;

public class ProdutoTest002 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------------------");

        Produto produto2 = new Tomate("Miudo", 15);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
