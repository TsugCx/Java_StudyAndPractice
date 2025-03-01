package Javacore.G_Associacao.Test;

import Javacore.G_Associacao.Domain.Escola;
import Javacore.G_Associacao.Domain.Professor;

public class Escola_Teste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Shikamaru");
        Professor professor2 = new Professor("Kakashi");
        Professor professor3 = new Professor("Tsunade");

        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Konoha", professores);


        escola.imprime();
    }
}
