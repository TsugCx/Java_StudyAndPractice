package Javacore.G_Associacao.Test;

import Javacore.G_Associacao.Domain.Jogador;
import Javacore.G_Associacao.Domain.Time;


public class JogadorTeste_03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Sasuke");
        Jogador jogador2 = new Jogador("Naruto");


        Time time = new Time("Barcelona");

        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();

        System.out.println("--- Jogador ---");
        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();

    }
}
