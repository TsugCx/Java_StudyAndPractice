package Javacore.L_ClassesAbstratas.Domain;

public class Desenvolverdor extends Funcionario{
    public Desenvolverdor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolverdor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }


}
