package oop.ac_constructor.rectangle;

/**
 * Created by codefire on 26.02.17.
 */
@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) {
        Rectangle r1, r2;
        r1 = new Rectangle(100, 200);

        r2 = new Rectangle(20, 30);

        System.out.printf("---------- %s: r1 -------%n", Rectangle.NAME);
        System.out.println(r1.width + " x " + r1.height);

        System.out.printf("---------- %s: r2 -------%n", Rectangle.NAME);
        System.out.println(r2.width + " x " + r2.height);
    }
}
