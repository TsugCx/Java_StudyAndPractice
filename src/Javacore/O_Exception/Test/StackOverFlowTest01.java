package Javacore.O_Exception.Test;

public class StackOverFlowTest01 {

    public static void main(String[] args) {

    recursividade();

    }

    public static void recursividade() {
        recursividade();
    }
}
