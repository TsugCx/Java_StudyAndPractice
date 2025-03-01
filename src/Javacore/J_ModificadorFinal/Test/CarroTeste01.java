package Javacore.J_ModificadorFinal.Test;

import Javacore.J_ModificadorFinal.Domain.Carro;
import Javacore.J_ModificadorFinal.Domain.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {

    Carro carro = new Carro();
    Comprador comprador2 = new Comprador();
    System.out.println(carro.COMPRADOR);
    carro.COMPRADOR.setNome("Cleison");
    System.out.println(carro.COMPRADOR);
    }
}
