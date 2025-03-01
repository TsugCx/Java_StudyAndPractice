package Javacore.A_IntroducaoClasses.Test;

import Javacore.A_IntroducaoClasses.Domain.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "Ferrari";
        carro1.modelo = "Aviator";
        carro1.ano = 2005;

        Carro carro2 = new Carro();
        carro2.nome = "Fusca";
        carro2.modelo = "Linde";
        carro2.ano = 1980;

        System.out.println("Nome:" + carro1.nome + "\nModelo: " + carro1.ano + "\nAno: " + carro1.ano);
        System.out.println("__________________________________________");
        System.out.println("Nome:" + carro2.nome + "\nModelo: " + carro2.ano + "\nAno: " + carro2.ano);

    }
}
