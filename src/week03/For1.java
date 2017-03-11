package week03;

/**
 * Created by codefire on 26.02.17.
 */
public class For1 {
    public static void main(String[] args) {
        System.out.println("Entering main");
        dojob();
        System.out.println("Exiting main");
    }

    private static void dojob() {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                return;
            }
            //System.out.println("i = " + i);
            System.out.printf("i = %d%n", i);
        }
    }
}
/*
Entering main
i = 0
i = 1
i = 2
Exiting main

*/