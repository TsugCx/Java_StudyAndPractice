package Javacore.C_SobrecargaMetodos.Test;

import Javacore.C_SobrecargaMetodos.Domain.Anime;

public class Anime_Teste {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("SeaSide Estranger Harukaze", "filme", 1, "Romance");
        anime.imprime();
    }
}
