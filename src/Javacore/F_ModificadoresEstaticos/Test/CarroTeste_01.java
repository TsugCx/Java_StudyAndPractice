package Javacore.F_ModificadoresEstaticos.Test;

import Javacore.F_ModificadoresEstaticos.Domain.Carro;

public class CarroTeste_01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(340);

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}

