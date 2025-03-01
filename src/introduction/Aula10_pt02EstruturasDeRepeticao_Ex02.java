package introduction;

public class Aula10_pt02EstruturasDeRepeticao_Ex02 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000


        //Minha resposta.
        int carroValor = 52000;

        for (int i = 1; carroValor >= 1000; i++) {
            carroValor -= 1000;
            if (carroValor < 1000) {
                System.out.println("O seu carro pode ser parcelado em ate " + i + "x");
            }
        }

        //Resposta da Aula.
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            } else {
                break;
            }
            System.out.println("Fora do if, mas dentro do for " + parcela);
        }





    }
}
