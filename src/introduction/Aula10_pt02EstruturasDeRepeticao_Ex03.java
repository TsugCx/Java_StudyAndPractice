package introduction;

public class Aula10_pt02EstruturasDeRepeticao_Ex03 {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= valorTotal; parcela--) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " +  parcela + "R$ " + valorParcela);

        }





    }
}
