package Javacore.G_Associacao.Test;

import Javacore.G_Associacao.Domain.Jogador;
import Javacore.G_Associacao.Domain.Time;

public class Jogador_Teste02 {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("Vasco");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
