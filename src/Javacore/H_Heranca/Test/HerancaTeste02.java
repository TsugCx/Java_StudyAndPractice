package Javacore.H_Heranca.Test;

import Javacore.H_Heranca.Domain.Funcionario;

public class HerancaTeste02 {
    //0-Bloco de inicialização estático da super classe e executado quando a JVM carregar a classe pai;
    //1-Bloco de inicialização estático da subclasse e executado quando a JVM carregar a classe filha;
    //2-Alocado espaço em memória para o objeto da classe superclasse;
    //3-Cada Atributo da superclasse e criado e inicializado com valores defalt ou o quer for passado;
    //4-Bloco de inicialização da superclasse e executado na ordem em que aparece;
    //5-Construtor é executado da superclasse;
    //6-Alocado espaço em memória pro objeto da subclasse;
    //7-Cada Atributo da superclasse e criado e inicializado com valores defalt ou o quer for passado;
    //8-Bloco de inicialização da subclasse e executado quando a JVM carregar a classe filha;
    //9-Construtor é executado da subclasse;

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Guto");
    }
}
