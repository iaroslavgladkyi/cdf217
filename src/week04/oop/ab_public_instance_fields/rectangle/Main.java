package week04.oop.ab_public_instance_fields.rectangle;

/**
 * Created by codefire on 26.02.17.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r1, r2;
        r1 = new Rectangle();
        r1.width = 100;
        r1.height = 200;

        r2 = new Rectangle();
        r2.width = 20;
        r2.height = 30;

        System.out.println("---------- rectangle: r1 -------");
        System.out.println(r1.width + " x " + r1.height);

        System.out.println("---------- rectangle: r2 -------");
        System.out.println(r2.width + " x " + r2.height);
    }
}
