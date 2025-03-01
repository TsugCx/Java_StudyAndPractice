package Javacore.H_Heranca.Test;

import Javacore.H_Heranca.Domain.Endereco;
import Javacore.H_Heranca.Domain.Funcionario;
import Javacore.H_Heranca.Domain.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("R. Alta Baixada");
        endereco.setCep("89034-7121");
        Pessoa pessoa = new Pessoa("Haybusa Lione");
        pessoa.setCpf("3123123123");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Taka Massa Nomuro");
        funcionario.setCpf("2049201312");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(100000);
        funcionario.imprime();
    }
}
