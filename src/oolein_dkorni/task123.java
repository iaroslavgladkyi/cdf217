package oolein_dkorni;

/**
 * Created by codefire on 26.02.17.
 */
public class task123 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
            delay();
        }
    }

    private static void delay() {
        try {
            Thread.sleep(400);
        } catch (Exception e) {
        }
    }
}
