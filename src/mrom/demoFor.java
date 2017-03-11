package mrom;

import java.util.Scanner;

/**
 * Created by codefire on 18.02.17.
 */
public class demoFor {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        int i = s.nextInt();
        int g = s.nextInt();
        int sum = 0;
        if (i >= g) {
            while (i >= g) {
                System.out.print(i + " ");
                i--;
                if (i%3 == 0)
                    sum = sum +i;

            }
        } else {
            while (i <= g) {
                System.out.print(i + " ");
                i++;
                if (i%3 == 0)
                sum = sum +i;
            }
        }
        System.out.println("\n"+sum);
    }
}

