package introduction;

public class Aula07_pt03EstruturasCondicionais_Ex01 {
    public static void main(String[] args) {

        double salario = 504;
        float valorDoImposto = 0;

        float percentualOne = 0.0970F;
        float percentualTwo = 0.3735F;
        float percentualThree = 0.4950F;

        if(salario > 0 && salario <= 34712) {
            valorDoImposto = (float) salario * percentualOne;
        } else if(salario >= 34713 && salario <= 68507) {
            valorDoImposto = (float) salario * percentualTwo;
        } else if(salario >= 68508) {
            valorDoImposto = (float) salario * percentualThree;
        }
        System.out.println("Você vai pagar " + valorDoImposto + "€ de imposto.");
    }
}
