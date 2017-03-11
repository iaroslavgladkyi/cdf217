package week01.intro;

import java.util.Scanner;

/**
 * Created by codefire on 04.02.17.
 */
public class HelloWorld {
    public static void main(String[] args) {

        System.out.print("s = ");
        String s = new Scanner(System.in).nextLine();

        int t2;
        t2 = Integer.parseInt(s);
        ++t2;
        String s2 = Integer.toString(t2);
        System.out.println(s2);

    }

    public static void main0(String[] args) {
        short x = (short) 0b011111000011110000;


        System.out.println(x);
    }
}