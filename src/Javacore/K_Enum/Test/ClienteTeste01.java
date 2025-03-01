package Javacore.K_Enum.Test;

import Javacore.K_Enum.Domain.Cliente;
import Javacore.K_Enum.Domain.TipoCliente;
import Javacore.K_Enum.Domain.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente01  = new Cliente("Senku", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02  = new Cliente("Tsukasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
