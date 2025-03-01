package introduction;

public class Aula13_pt03Arrays_Foreach {
    public static void main (String[] args) {

        //Formas de Inicializar um Array

        //1
        int[] numeros = new int[3];
        numeros[0] = 34;
        numeros[1] = 9;
        //2
        int[] alphanumerics = new int[]{4, 3, 4, 5, 0, 23};
        //3
        int[] number = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);

        }


        //Foreach
        for (int y:number) {
            System.out.println(y);
        }






    }
}
