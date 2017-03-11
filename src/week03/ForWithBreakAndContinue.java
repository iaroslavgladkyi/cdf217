package week03;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by codefire on 18.02.17.
 */
public class ForWithBreakAndContinue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=s.nextInt();
        int g=s.nextInt();

        for (;;) {
            if (i <= -60) {
                break;
            }
            i-=3;
            if (i == 26) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println(i);
    }


}
