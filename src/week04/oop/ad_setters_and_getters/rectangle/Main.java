package week04.oop.ad_setters_and_getters.rectangle;

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

        System.out.printf("---------- %s: r1 -------%n", Rectangle.NAME);
        System.out.println(r1.getWidth() + " x " + r1.getHeight());

        System.out.printf("---------- %s: r2 -------%n", Rectangle.NAME);
        System.out.println(r2.getWidth() + " x " + r2.getHeight());

    }
}
