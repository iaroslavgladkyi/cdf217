package week03;

/**
 * Created by codefire on 19.02.17.
 */
public class MathDemo {
    public static void main(String[] args) {
        // mathDemo1();
        mathDemo2();
    }

    private static void mathDemo1() {
        // constants
        System.out.println(Math.E);
        System.out.println(Math.PI);

        // trigonometric functions : sin
        double fi = 1;
        double y = Math.sin(fi);
        System.out.println(y);

        // logarithms
        System.out.println(Math.log10(100D));

        // Math.addExact()
        int i = Integer.MAX_VALUE;
        i++;
        System.out.println(i);
        i--;
        System.out.println(i);
        i = Math.addExact(Integer.MAX_VALUE, 1); /* !!!
        Exception in thread "main"
        java.lang.ArithmeticException: integer overflow*/
        System.out.println(i);
    }

    private static void mathDemo2() {
        // rounding
        double x = 1.5;
        System.out.println(Math.ceil(1.2d));  // 2.0
        System.out.println(Math.round(x));  // 2.0
        System.out.println(Math.floor(1.7d)); // 1.0

        // power / square root
        x = 4;
        System.out.println(Math.pow(x, 2)); // 16.0
        System.out.println(Math.sqrt(x));   // 2.0

        System.out.println(Math.random()); // [0, 1)

        System.out.println(Math.max(2, Math.max(5, 7)));
    }
}
