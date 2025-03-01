package Javacore.H_Heranca.Domain;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de init. estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de init Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de init Funcionario 2");
    }
    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorio() {
        System.out.println("Eu " + this.nome + "recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}