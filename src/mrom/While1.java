package mrom;

import java.util.Scanner;

/**
 * Created by codefire on 12.02.17.
 */
public class While1 {
    public static void main(String[] args) {

        /*int i = 16;
        while (i < 33) {
            System.out.println(i++);*/

        /*Scanner s;
        s = new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        while(x < y+1){
            System.out.println(x++);*/

        /*2.2
        Scanner s;
        s = new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        while(x > y-1){
            System.out.println(x--);*/

       /* 3
       Scanner scanner;
        scanner = new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println("_________");
        while(x > y-1){
            System.out.println(x--);*/

        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println("______");
        if (x<y){
            while(x < y+1){
            System.out.println(x++);}

        }
        else
            while(x > y-1){
            System.out.println(x--);}
    }
}