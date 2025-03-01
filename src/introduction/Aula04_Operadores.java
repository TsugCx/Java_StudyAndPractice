package introduction;

public class Aula04_Operadores {
    public static void main(String[] args) {

        // [+]soma; [-]subtração; [*]multiplicação; [/]divisão;
        int numberOne = 5;
        int numberTwo = 10;
        double result = numberTwo - numberOne;

        System.out.println(result);

        //[%] resto da divisão
        int resto = 21 % 7;

        System.out.println(resto);

        // [<] menor que; [>]maior que; [<=] menor igual; [>=]maior igual; [==]comparaçãoç [!=]diferente de; todos eles retornam valores booleanos;
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 20 > 10;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte );
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);


        // Operadores Logicos: [&&]AND; [||]or; [!]logical not
        int age = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = age > 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupança = 10800;
        float valorPlaystation = 500F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupança > valorPlaystation;

        System.out.println(isPlaystationCincoCompravel);

        // Operadores de Atribuição [=]igual; [+=]mais igual; [-=]menos igual;[*=]multiplicação igual; [/=]divisão igual; [%=]resto igual;

        int bonus = 1000;

        bonus += 500;
        System.out.println(bonus);

        bonus -= 250;
        System.out.println(bonus);

        bonus *= 2;
        System.out.println(bonus);

        bonus /= 2;
        System.out.println(bonus);

        bonus %= 2;
        System.out.println(bonus);

        // Imcremento e decremento: [++] e [--];

        int contador = 0;
        contador++;
        System.out.println(contador);
        ++contador;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
        --contador;
        System.out.println(contador);
        // Se o  incrementos for colocado antes da variavel o valor e adicionado primeiro, se for colocado apos a o codigo executa a ação e depois incrementa ou remove.



    }
}
