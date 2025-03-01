package Javacore.G_Associacao.Test;

import Javacore.G_Associacao.Domain.Jogador;

public class Jogador_Teste01 {
    Jogador jogador1 = new Jogador("Kaka");
    Jogador jogador2 = new Jogador("Romario");
    Jogador jogador3 = new Jogador("Lima");

    Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};

}
// Jogador 1 -- 1 Personagem;
// Time 1 -- N Jogador;
// Jogador N -- 1 Time;
// Estudante N -- N curso;