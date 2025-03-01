package Javacore.E_BlocosdeInicializacao.Test;

import Javacore.E_BlocosdeInicializacao.Domain.Anime;

public class Anime_Teste_01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
