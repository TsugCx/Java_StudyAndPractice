package introduction;

public class Aula07_pt03EstruturasCondicionais {
    public static void main(String[] args) {

        double salario = 6000;
         String mensagemDoar = "Eu vou doar 500 para o DevDojo";
         String mensagemNaoDoar = "Ainda nao tenho condicoes, mas vou ter!";

         //(Condicao) ? verdadeiro : falso
         String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

         System.out.println(resultado);


    }
}
