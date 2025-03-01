package introduction;

public class Aula05_pt01EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 10;

        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida Alcolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida Alcolica");
        }



        System.out.println("Fora do if");
    }
}
