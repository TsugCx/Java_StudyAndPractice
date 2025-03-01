package introduction;

public class Aula08_pt04EstruturasCondicionais {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo.
        //valores que podem ser colocados no switch: char, int, byte, short, enum, String

        byte days = 3;
         switch (days) {
             case 1:
                 System.out.println("Domingo");
                 break;
             case 2:
                 System.out.println("Segunda");
                 break;
             case 3:
                 System.out.println("Terça");
                 break;
             case 4:
                 System.out.println("Quarta");
                 break;
             case 5:
                 System.out.println("Quinta");
                 break;
             case 6:
                 System.out.println("Sexta");
                 break;
             case 7:
                 System.out.println("Sabado");
                 break;
             default:
                 System.out.println("Opção Inválida");
                 break;
         }

         char sexo = 'M';
        switch(sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
        }


    }
}
