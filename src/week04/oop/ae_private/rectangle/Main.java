package week04.oop.ae_private.rectangle;

/**
 * Created by codefire on 26.02.17.
 */
@SuppressWarnings("Duplicates")
public class Main {
    public static void main(String[] args) {
        Rectangle r1, r2;
        r1 = new Rectangle(100, 200);

        r2 = new Rectangle(20, 30);
        r1.setWidth(1000);
        r1.setHeight(2000);

        r1.setWidth(-31); // will be ignored
        //r1.width = -31;

        print(r1, r2);
    }

    public static void print(Rectangle r1, Rectangle r2) {
        System.out.printf("---------- %s: r1 -------%n", Rectangle.NAME);
        System.out.println(r1.getWidth() + " x " + r1.getHeight());

        System.out.printf("---------- %s: r2 -------%n", Rectangle.NAME);
        System.out.println(r2.getWidth() + " x " + r2.getHeight());
    }
}
