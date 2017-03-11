package week02;

import java.util.Scanner;

/**
 * Created by codefire on 11.02.17.
 */
public class TaskMaxIF {
    public static void main(String[] args) {
        int a;
        int b;
        int c = 1;
        int d;
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = new Scanner(System.in).nextInt();
        d = new Scanner(System.in).nextInt();
        if (a > b) {
            // -b | a c d
            if (c > a) {
                // -a -b | c d
                if (d > c) {
                    // -a -b -c | d
                    System.out.println(d);
                } else {
                    // -a -b -d | c
                    System.out.println(c);
                }
            } else {
                // -c -b | a d
                if (a > d) {
                    System.out.println(a);
                } else {
                    System.out.println(d);
                }
            }
        } else {
            // -a | b c d
            if (b > c) {
                // -a -c | b d
                if (b > d) {
                    // -a -c -d | b
                    System.out.println(b);
                } else {
                    // -a -c -b | d
                    System.out.println(d);
                }
            } else {

            }

        }


    }
}
