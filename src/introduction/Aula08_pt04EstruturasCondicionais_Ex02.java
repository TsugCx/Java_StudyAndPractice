package introduction;

public class Aula08_pt04EstruturasCondicionais_Ex02 {
    public static void main (String[] args) {
        //Utilizando switch e dados os valores de 1 a 7, imprima se e dia util ou final de semana
        //Considerando 1 como domingo
        byte day = 1;
        switch (day) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
                default:
                    System.out.println("Dia útil");
                    break;
        }
    }
}
