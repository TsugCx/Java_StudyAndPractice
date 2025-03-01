package introduction;

public class Aula15_pt02ArraysMultdimensionais {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[5];
        arrayInt[2] = new int[]{2, 3, 6, 1, 42, 10};


        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }


            int[][] arrayEx2 = {{2, 3}, {9, 76, 4}, {1, 2, 4, 2, 5}};
        }

    }
}
