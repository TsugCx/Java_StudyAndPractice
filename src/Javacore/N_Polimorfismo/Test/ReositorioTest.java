package Javacore.N_Polimorfismo.Test;

import Javacore.N_Polimorfismo.Repositorio.Repositorio;
import Javacore.N_Polimorfismo.Service.RepositorioBancoDeDados;

public class ReositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
