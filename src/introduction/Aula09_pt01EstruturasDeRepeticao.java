package introduction;

public class Aula09_pt01EstruturasDeRepeticao {
    public static void main (String[] args) {
        //while, do while; for.

        //while
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        //do while
        count = 0;
        do {System.out.println("Dentro do do while "+ ++count);
        } while (count < 10);

        //for
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }



    }
}
