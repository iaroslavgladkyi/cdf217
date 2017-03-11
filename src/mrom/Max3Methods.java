package mrom;

import java.util.Scanner;

/**
 * Created by codefire on 19.02.17.
 *
 * @author iexcept
 * @version 1.0
 */
public class Max3Methods {
    public static void main(String[] args) {
        int a,b,c ;
        Scanner sc = new Scanner (System.in);
        System.out.println("Number a"+" ");
        a = sc.nextInt();
        System.out.println("Number b"+ " ");
        b = sc.nextInt();
        System.out.println("Number c"+" ");
        c = sc.nextInt();
        int x = max3(a,b,c);
        System.out.println("max3:");
        System.out.println(x);
    }

    private static int max3(int a, int b, int c)    {
        int result = Math.max(a,Math.max(b,c) );
        return result;
    }
}