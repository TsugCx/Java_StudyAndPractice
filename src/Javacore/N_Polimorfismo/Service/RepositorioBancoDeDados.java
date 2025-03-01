package Javacore.N_Polimorfismo.Service;

import Javacore.N_Polimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um Banco de dados");
    }
}
